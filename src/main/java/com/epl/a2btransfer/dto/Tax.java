package com.epl.a2btransfer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IMPUESTO")
public class Tax {	
	
	@Id
	private int id;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="valor")
	private float pct;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPct() {
		return pct;
	}
	
	public void setPct(float pct) {
		this.pct = pct;
	}

	
	
}
