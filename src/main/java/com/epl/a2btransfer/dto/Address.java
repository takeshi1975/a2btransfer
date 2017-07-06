package com.epl.a2btransfer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DIRECCION")
public class Address {
	@Id
	private Long id;
	private String nombreVia;
	@Column(name="TELEFONO1")
	private String telefono;
	private Long clienteId;
	private String poblacion;
	private String provincia;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombreVia() {
		return nombreVia;
	}
	
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}		
	
}
