package com.epl.a2btransfer.services;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epl.a2btransfer.dto.Agency;
import com.epl.a2btransfer.dto.Comision;
import com.epl.a2btransfer.dto.ComisionEPL;
import com.epl.a2btransfer.dto.Tax;
import com.epl.a2btransfer.exception.NotApplicableException;
import com.epl.a2btransfer.repositories.AgencyRepository;
import com.epl.a2btransfer.repositories.ComisionEPLRepository;
import com.epl.a2btransfer.xto.AvailRs;
import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.ReserveRs;


@Service
public class PolicyService {

	@Autowired
	private ComisionEPLRepository comisionEPLRepository;

	@Autowired
	private AgencyRepository agencyRepository;
	
	private final static Logger log = Logger.getLogger(PolicyService.class);
	
	private float applyFee(long cliente, long sistema, float price, Date date) throws NotApplicableException{
		long pcmId = comisionEPLRepository.findComission(cliente, sistema, date);		
		ComisionEPL comisionEPL = comisionEPLRepository.findOne(pcmId);
		if (comisionEPL==null)		
			throw new NotApplicableException();		
		float pct = comisionEPL.getMargen();		
		float value =  (float) price + price*pct/100.0f;
		value =  Math.round(value * 100.0) / 100.0f; // Rounded to 2 decimal places :-)
		log.info("Precio anterior ="+price+ "Precio final ="+value);
		return value;
		
	}
	
	public List<AvailRs.TransferOnly.Availability.Avline> calculatePrice(List<AvailRs.TransferOnly.Availability.Avline>  availlines, 
			long cliente, 	long sistema,	Date date) throws NotApplicableException{
		for (int i=0; i<availlines.size(); i++){						 
			float price = availlines.get(i).getTransferPrice();
			log.debug("Precio anteror -->"+price+" Precio final "+applyFee(cliente, sistema, price, date));
			availlines.get(i).setTransferTotalPrice(applyFee(cliente, sistema, price, date));
		}
		return availlines;
	}
	
	public ReserveRs calculatePrice(ReserveRs reserveRs, long cliente, long sistema, Date date) throws NotApplicableException{
		if (reserveRs.getTransferOnly()==null){
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

	public List<String> breakdown(float pvp, long agency, long system, Date bookingDate)
	throws NotApplicableException{
		List<String> results = new ArrayList<String>();
		DecimalFormat df = new DecimalFormat("#.##");
		Agency customer = agencyRepository.findOne(agency); // Obtener los datos de la agencia
		Long comissionId = agencyRepository.findCustomerComision(agency, system, bookingDate);
		Tax tax = customer.getTax();
		float customerComissionValue =agencyRepository.findComissionValue(comissionId);
		float impcom = customerComissionValue*pvp/100.0f;
		float imptax = impcom*tax.getPct()/100.0f;
		results.add("COMAG#"+df.format(Math.round(impcom*100.0)/100.0f));
		results.add("TAX#"+tax.getName()+ "#"+df.format(Math.round(imptax*100.0/100.0f)));		
		results.add(("PVP #"+df.format(pvp)));
		return results;
	}
	
}
