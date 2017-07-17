package com.epl.a2btransfer.xto;

import java.lang.reflect.Field;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo;
import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.Client;
import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.JoiningIns;
import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.OutboundTransferDetails;
import com.epl.a2btransfer.xto.BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.ReturnTransferDetails;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "agency", "locata", "transferOnly" })
@XmlRootElement(name = "TCOML")
public class PrintRq {
	@XmlElement(name="Locata", required=true)
	protected String locata;
	
	@XmlElement(name="Agency", required=true)
	protected Long agency;
	
	@XmlElement(name = "TransferOnly", required = true)
	protected BookingRs.TransferOnly transferOnly;

	public String getLocata() {
		return locata;
	}

	public void setLocata(String locata) {
		this.locata = locata;
	}

	public Long getAgency() {
		return agency;
	}

	public void setAgency(Long agency) {
		this.agency = agency;
	}

	public BookingRs.TransferOnly getTransferOnly() {
		return transferOnly;
	}

	public void setTransferOnly(BookingRs.TransferOnly transferOnly) {
		this.transferOnly = transferOnly;
	}	

	
	@Override
    public String toString(){
    	XmlFriendlyReplacer xfr = new XmlFriendlyReplacer("$","_");  
    	XStream xstream = new XStream(new DomDriver("UTF-8",xfr));
    	xstream.alias("TCOML", this.getClass());
    	xstream.aliasField("Agency", this.getClass(), "agency");
    	xstream.aliasField("Locata", this.getClass(), "locata");
    	xstream.aliasField("TransferOnly",this.getClass(),"transferOnly");
    	xstream.aliasField("Booking",BookingRs.TransferOnly.class,"booking");
    	xstream.aliasField("Confirm",BookingRs.TransferOnly.Booking.class,"confirm");    	
    	xstream.aliasField("BookingType", BookingRs.TransferOnly.Booking.Confirm.class,"bookingType");
    	xstream.aliasField("VoucherInfo", BookingRs.TransferOnly.Booking.Confirm.class,"voucherInfo");
    	for (Field f:VoucherInfo.class.getDeclaredFields()){
    		String newName = f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1);    		
    		xstream.aliasField(newName,BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.class,f.getName());    		
    	}
    	for (Field f:Client.class.getDeclaredFields()){
    		String newName = f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1);    		
    		xstream.aliasField(newName,Client.class,f.getName());    		
    	}
    	for (Field f:OutboundTransferDetails.class.getDeclaredFields()){
    		String newName = f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1);    		
    		xstream.aliasField(newName,OutboundTransferDetails.class,f.getName());    		
    	}
    	for (Field f:ReturnTransferDetails.class.getDeclaredFields()){
    		String newName = f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1);    		
    		xstream.aliasField(newName,ReturnTransferDetails.class,f.getName());    		
    	}
    	for (Field f:JoiningIns.class.getDeclaredFields()){
    		String newName = f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1);    		
    		xstream.aliasField(newName,JoiningIns.class,f.getName());    		
    	}    	    	    	
    	xstream.useAttributeFor(AvailRq.class, "version");    	
    	return xstream.toXML(this);    	
    }
	
}
