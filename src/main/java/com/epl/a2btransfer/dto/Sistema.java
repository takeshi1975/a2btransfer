package com.epl.a2btransfer.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SISTEMA")
public class Sistema {
	
	@Id
	private long id; 
	private String codigo;
	private String nombre;
	private String neto;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNeto() {
		return neto;
	}
	
	public void setNeto(String neto) {
		this.neto = neto;
	}		
	
	public boolean isNeto(){
		return neto.equals("S");
	}
	
}
