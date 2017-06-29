package com.epl.a2btransfer.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ComisionEPLId implements Serializable{

	private static final long serialVersionUID = -8318048287868214232L;
	private Long id;
	private String neto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNeto() {
		return neto;
	}
	public void setNeto(String neto) {
		this.neto = neto;
	}
	
	public ComisionEPLId() {
		// TODO Auto-generated constructor stub
	}
	
	public ComisionEPLId(long id, String neto) {
		this.id = id;
		this.neto = neto;
	}		
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComisionEPLId)) return false;
        ComisionEPLId other = (ComisionEPLId) o;
        return id.equals(other.id) && neto.equals(other.neto);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id.toString()+neto);
    }
	

}
