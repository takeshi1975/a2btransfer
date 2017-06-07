package com.epl.a2btransfer.services;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epl.a2btransfer.dto.Comision;
import com.epl.a2btransfer.exception.NotApplicableException;
import com.epl.a2btransfer.repositories.ComisionRepository;
import com.epl.a2btransfer.xto.AvailRs;
import com.epl.a2btransfer.xto.BookingRs;
import com.epl.a2btransfer.xto.ReserveRs;


@Service
public class PolicyService {

	@Autowired
	private ComisionRepository comisionRepository;
	
	private final static Logger log = Logger.getLogger(PolicyService.class);
	
	private float applyFee(float price, Date date) throws NotApplicableException{
		List<Comision> comisions = comisionRepository.findComision(date);
		if (comisions.size()!=1)
			throw new NotApplicableException();
		Comision comision = comisions.get(0);
		Double pct = comision.getMargen();		
		log.info("Precio anterior ="+price+ "Precio final ="+(price+price*pct/100.0f));
		return (float)(price+price*pct/100.0f);		
	}
	
	public List<AvailRs.TransferOnly.Availability.Avline> calculatePrice(List<AvailRs.TransferOnly.Availability.Avline>  availlines, Date date) throws NotApplicableException{
		for (int i=0; i<availlines.size(); i++){
			float price = availlines.get(i).getTransferPrice();
			log.debug("Precio anteror -->"+price+" Precio final "+applyFee(price, date));
			availlines.get(i).setTransferTotalPrice(applyFee(price, date));
		}
		return availlines;
	}
	
	public ReserveRs calculatePrice(ReserveRs reserveRs, Date date) throws NotApplicableException{
		if (reserveRs.getTransferOnly()==null){
			float price = reserveRs.getTransferOnly().getBooking().getReserve().getHolidayValue();
			reserveRs.getTransferOnly().getBooking().getReserve().setHolidayValue(applyFee(price, date));
		}
		return reserveRs;
	}
	
	public BookingRs calculatePrice(BookingRs bookingRs, Date date) throws NotApplicableException{
		if (bookingRs.getTransferOnly().getErrors()==null){
			float price = bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().getInvoiceValue();			
			bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().setInvoiceValue(applyFee(price, date));			
		}
		return bookingRs;
	}
	
}
