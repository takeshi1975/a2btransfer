package com.epl.a2btransfer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE_MERCADO")
public class ClienteMercado {
	
	@Id
	@Column(name="CLIENTE_ID")	
	private long clienteId;
	
	@Column(name="MERCADO_ID")
	private long mercadoId;

	public long getClienteId() {
		return clienteId;
	}

	public void setClienteId(long clienteId) {
		this.clienteId = clienteId;
	}

	public long getMercadoId() {
		return mercadoId;
	}

	public void setMercadoId(long mercadoId) {
		this.mercadoId = mercadoId;
	}				
}
