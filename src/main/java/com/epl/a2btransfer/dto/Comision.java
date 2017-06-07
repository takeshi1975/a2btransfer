package com.epl.a2btransfer.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="A2B_TRANSFER_COMISSION")
public class Comision {
	
	//	SELECT T2.ID, T2.CODIGO, MARGEN, COMI FROM POLITICA_COMERCIAL_MEDIDA T1
	//	  LEFT JOIN TIPO_SERVICIO T2 ON (T1.TIPO_SERVICIO_ID=T2.ID)
	//	  LEFT JOIN INTEGRACION T3 ON (T1.INTEGRACION_ID=T3.ID)
	//	  WHERE  (T3.CODIGO='A2B' AND T2.CODIGO='TRAS');
	@Id
	@Column
	private long id;
	@Column(name="margen")
	private Double margen;
	@Column(name="comi")
	private String comision;
	@Column(name="fecha_inicio")
	private Date fecha1;
	@Column(name="fecha_fin")
	private Date fecha2;
	
	private Comision(){
		// inherited
	}
	
	private Comision(long id,  Double margen, String comision, Date fecha1, Date fecha2){
		this.setId(id);
		this.setMargen(margen);
		this.setComision(comision);
		this.setFecha1(fecha1);
		this.setFecha2(fecha2);
	}
			
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public Double getMargen() {
		return margen;
	}
	
	public void setMargen(Double margen) {
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
	
	
}
