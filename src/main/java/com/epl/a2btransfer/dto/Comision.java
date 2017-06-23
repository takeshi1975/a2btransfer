package com.epl.a2btransfer.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ETOUR.COMISION")
public class Comision {

	@Id
	private int id;

	@Column(name = "COM")
	private float pct;

	@Column(name = "FECHA_INI_APL")
	private Date fechaIniApl;

	@Column(name = "FECHA_FIN_APL")
	private Date fechaFinApl;

	@Column(name = "FECHA_INI_RES")
	private Date fechaIniRes;

	@Column(name = "FECHA_FIN_RES")
	private Date fechaFinRes;
	
	@Column(name = "SISTEMA_ID")
	private String sistema;

	@OneToOne
	@JoinColumn(name = "CLIENTE_ID", nullable = false)
	private Agency agency;	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPct() {
		return pct;
	}

	public void setPct(float pct) {
		this.pct = pct;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public Date getFechaIniApl() {
		return fechaIniApl;
	}

	public void setFechaIniApl(Date fechaIniApl) {
		this.fechaIniApl = fechaIniApl;
	}

	public Date getFechaFinApl() {
		return fechaFinApl;
	}

	public void setFechaFinApl(Date fechaFinApl) {
		this.fechaFinApl = fechaFinApl;
	}

	public Date getFechaIniRes() {
		return fechaIniRes;
	}

	public void setFechaIniRes(Date fechaIniRes) {
		this.fechaIniRes = fechaIniRes;
	}

	public Date getFechaFinRes() {
		return fechaFinRes;
	}

	public void setFechaFinRes(Date fechaFinRes) {
		this.fechaFinRes = fechaFinRes;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	
}
