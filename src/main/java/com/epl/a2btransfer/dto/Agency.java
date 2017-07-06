package com.epl.a2btransfer.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Agency {

	@Id
	private long id;
	@Column(name="NOMBRE_COMERCIAL")
	private String name;
	
	public enum Desglose{				
		COMISION_AGEN,IMPUESTO, TOTAL				
	}	
	
	@OneToOne
	@JoinColumn(name="IMPUESTO_ID")
	private Tax tax;
	
	@OneToMany(fetch= FetchType.EAGER, mappedBy="clienteId")	
	private List<Address> addresses;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
		
}
