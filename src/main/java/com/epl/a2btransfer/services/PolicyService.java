package com.epl.a2btransfer.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epl.a2btransfer.dto.Comision;
import com.epl.a2btransfer.exception.NotApplicableException;
import com.epl.a2btransfer.repositories.ComisionRepository;
import com.epl.a2btransfer.xto.BookingRs;

@Service
public class PolicyService {

	@Autowired
	private ComisionRepository comisionRepository;
	
	public BookingRs calculatePrice(BookingRs bookingRs) throws NotApplicableException{
		if (bookingRs.getTransferOnly().getErrors()==null){
			double precio = bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().getInvoiceValue();
			// Consultado con Jose para aplicar la fecha...
			List<Comision> comisions = comisionRepository.findComision(new Date()); // Le aplicamos la comisión de la fecha actual???
			if (comisions.size()>1)
				throw new NotApplicableException();
			Comision comision = comisions.get(0);
			Double pct = comision.getMargen();
			bookingRs.getTransferOnly().getBooking().getConfirm().getVoucherInfo().setInvoiceValue((float)(precio * pct /100.0f));			
		}
		return bookingRs;
	}
	
}
