package com.epl.a2btransfer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="A2BT_ROUTE")
public class Route {
	
	@Id
	@Column(name="ROUTE_ID")
	private long id;
	@Column(name="ROUTE_CODE_FROM", nullable=false, length=3)
	private String codeFrom;
	@Column(name="ROUTE_CODE_TO", nullable=false, length=3)
	private String codeTo;	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodeFrom() {
		return codeFrom;
	}
	
	public void setCodeFrom(String codeFrom) {
		this.codeFrom = codeFrom;
	}
	
	public String getCodeTo() {
		return codeTo;
	}
	
	public void setCodeTo(String codeTo) {
		this.codeTo = codeTo;
	}	
	
	@Override
	public String toString(){
		return "Route [ "+codeFrom + " -> " + codeTo+ " ]";
	}
	
}
