package com.epl.a2btransfer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="A2BT_LOCATION")
public class Location {

	@Id
	@Column(name="LOCATION_CODE", length=3, nullable=false)
	private String code;
	@Column(name="LOCATION_NAME", length=100, nullable=false)
	private String name;
	@Column(name="LOCATION_TYPE", length=3, nullable=false)
	private String type;
	@Column(name="COUNTRY_CODE", length=3, nullable=false)
	private String countryCode;
	@Column(name="COUNTRY", length=50, nullable=false)
	private String country;
	@Column(name="LATITUDE")
	private float latitude;
	@Column(name="LONGITUDE")
	private float longitude;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public float getLatitude() {
		return latitude;
	}
	
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	
	public float getLongitude() {
		return longitude;
	}
	
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
}
