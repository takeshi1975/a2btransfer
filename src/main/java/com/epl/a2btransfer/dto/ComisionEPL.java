package com.epl.a2btransfer.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Mapeo de la comisión de EPL
 * @author Juanjo
 *
 */
@Entity
@Table(name="A2B_TRANSFER_COMISSION")
public class ComisionEPL {
	
	@Id
	@Column
	private Long id;
	private float margen;
	@Column(name="comi")
	private String comision; // S/N  
	@Column(name="fecha_inicio")
	private Date fecha1;
	@Column(name="fecha_fin")
	private Date fecha2;		
	@Column(name="cliente_id")
	private Long clienteId; // id de la agencia...
	@Column(name="sistema_id")
	private Long sistemaId; // id del sistema...
	@Column(name="mercado_id")
	private Long mercadoId; // id del mercado...
	private String neto;
	
	private ComisionEPL(){
		// inherited
	}
	
	private ComisionEPL(Long id,  float margen, String comision, Date fecha1, Date fecha2){
		this.setId(id);
		this.setMargen(margen);
		this.setComision(comision);
		this.setFecha1(fecha1);
		this.setFecha2(fecha2);
		this.setClienteId(clienteId);
		this.setSistemaId(sistemaId);
		this.setMercadoId(mercadoId);
	}
			
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getMargen() {
		return margen;
	}
	
	public void setMargen(float margen) {
		this.margen = margen;
	}
	
	public String getComision() {
		return comision;
	}
	
	public void setComision(String comision) {
		this.comision = comision;
	}
	
	public Date getFecha1() {
		return fecha1;
	}
	
	public void setFecha1(Date fecha1) {
		this.fecha1 = fecha1;
	}
	
	public Date getFecha2() {
		return fecha2;
	}
	
	public void setFecha2(Date fecha2) {
		this.fecha2 = fecha2;
	}		

	public float calculaComision(float base){
		return (comision.equals("S"))? base*this.getMargen()/100.0f:getMargen();		
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}			
	
	public Long getSistemaId() {
		return sistemaId;
	}

	public void setSistemaId(Long sistemaId) {
		this.sistemaId = sistemaId;
	}	

	public Long getMercadoId() {
		return mercadoId;
	}

	public void setMercadoId(Long mercadoId) {
		this.mercadoId = mercadoId;
	}

	@Override	
	public boolean equals(Object obj) {
	    ComisionEPL other = (ComisionEPL) obj;
		return (this.getClienteId() == other.getClienteId()) && 
			   (this.getMercadoId() == other.getMercadoId()) &&	
			   (this.getSistemaId() == other.getSistemaId());
	}
	
}


