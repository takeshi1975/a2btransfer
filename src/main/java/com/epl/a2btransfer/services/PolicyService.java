package com.epl.a2btransfer.services;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epl.a2btransfer.dto.Agency;
import com.epl.a2btransfer.dto.ComisionEPL;
import com.epl.a2btransfer.dto.ComisionEPLId;
import com.epl.a2btransfer.dto.Sistema;
import com.epl.a2btransfer.dto.Tax;
import com.epl.a2btransfer.exception.NotApplicableException;
import com.epl.a2btransfer.repositories.AgencyRepository;
import com.epl.a2btransfer.repositories.ComisionEPLRepository;
import com.epl.a2btransfer.repositories.SistemaRepository;
import com.epl.a2btransfer.xto.AvailRs;
import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.ReserveRs;


@Service
public class PolicyService {

	@Autowired
	private ComisionEPLRepository comisionEPLRepository;

	@Autowired
	private SistemaRepository sistemaRepo;
			
	@Autowired
	private AgencyRepository agencyRepository;
	
	private final static Logger log = Logger.getLogger(PolicyService.class);
	
	// Comisión del cliente para el desglose
	private float applyFee(long cliente, long sistema, float price, Date date) throws NotApplicableException{
		comisionEPLRepository.findComission(cliente, sistema, date);
		long id = comisionEPLRepository.getId();		
		log.info("Se recoge "+id+" Neto = "+(comisionEPLRepository.isNeto()?"S":"N")) ;
		String neto = comisionEPLRepository.isNeto()?"S":"N";
		ComisionEPL comisionEPL = comisionEPLRepository.findOne(new ComisionEPLId(id,neto));
		if (comisionEPL==null)		
			throw new NotApplicableException();		
		float pct = comisionEPL.getMargen();		
		float value =  (float) price + price*pct/100.0f;
		value =  Math.round(value * 100.0) / 100.0f; // Rounded to 2 decimal places :-)
		log.info("Precio anterior ="+price+ " / Precio final ="+value);
		return value;
		
	}
	
	public void calculatePrice(List<AvailRs.TransferOnly.Availability.Avline>  availlines, 
			long cliente, 	long sistema,	Date date) throws NotApplicableException{		
		for (int i=0; i<availlines.size(); i++){						 
			float price = availlines.get(i).getTransferTotalPrice();
			price = applyFee(cliente, sistema, price, date);			
			availlines.get(i).setTransferTotalPrice(price);
			log.debug("Precio anteror -->"+price+" Precio final "+price);
		}		
	}
	
	public ReserveRs calculatePrice(ReserveRs reserveRs, long cliente, long sistema, Date date) throws NotApplicableException{
		if (reserveRs.getTransferOnly().getErrors()==null){
			float price = reserveRs.getTransferOnly().getBooking().getReserve().getHolidayValue();
			reserveRs.getTransferOnly().getBooking().getReserve().setHolidayValue(applyFee(cliente, sistema, price, date));
		}
		return reserveRs;
	}
	
	/**
	 * Cáculo de precios para la respuesta del Booking. Incluye desglose de precios.
	 * @param bookingRs
	 * @param date
	 * @return
	 * @throws NotApplicableException
	 */
	public BookingRs calculatePrice(BookingRs bookingRs, long cliente, long sistema, Date date) throws NotApplicableException{
		if (bookingRs.getTransferOnly().getErrors()==null){
			float price = bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().getInvoiceValue();			
			bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().setInvoiceValue(applyFee(cliente, sistema, price, date));			
		}
		return bookingRs;
	}
	
	public float round(float input){
		return Math.round(input*100.0)/100.0f;
	}

	/**
	 * Desglose de precios
	 * @param pvp El precio que ofrecemos a la agencia
	 * @param agency Código de la agencia
	 * @param system Código de sistema. Nos indicará si trabajamos con precios Netos o con PVP
	 * @param bookingDate Fecha de la reserva
	 * @return Lista de strings donde se detalla el desglose de precios.
	 * @throws NotApplicableException
	 */
	public List<String> breakdown(float pvp, long agency, long system, Date bookingDate)
	throws NotApplicableException{
		List<String> results = new ArrayList<String>();
		log.info("Voy a buscar el sistema "+system);
		Sistema sistema = sistemaRepo.findOne(system);
		if (sistema==null)
			log.error("No se ha podido encontrar el sistema "+sistema+"!!!");
		DecimalFormat df = new DecimalFormat("#.##");
		Agency customer = agencyRepository.findOne(agency); // Obtener los datos de la agencia
		if (!sistema.isNeto()){	
			Long comissionId = agencyRepository.findCustomerComision(agency, system, bookingDate);
			Tax tax = customer.getTax();
			float customerComissionValue = agencyRepository.findComissionValue(comissionId);
			float impcom = round(pvp * customerComissionValue/100.0f);
			float imptax = round(impcom * tax.getPct()/100.0f);	
			results.add(("PVP#"+df.format(pvp)));
			results.add("COMAG#"+customerComissionValue+"#"+df.format(impcom));
			results.add("TAX#"+tax.getName()+ "#"+df.format(imptax));												
		} else{			
			results.add("PEPL#"+df.format(pvp));													
		}
		log.info("____________________BREAKDOWN____________________________________");
		results.forEach(t-> log.info(t));
		log.info("__________________________________________________________________");
		return results;
	}
	
}
