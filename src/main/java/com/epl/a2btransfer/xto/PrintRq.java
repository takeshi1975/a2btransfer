package com.epl.a2btransfer.xto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
	
	
	
}
