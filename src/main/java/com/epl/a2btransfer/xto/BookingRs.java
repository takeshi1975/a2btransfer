//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.21 a las 07:24:07 PM CEST 
//

package com.epl.a2btransfer.xto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransferOnly"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Booking"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Confirm"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="BookingType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="VoucherInfo"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="BookingRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="DeparturePointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="ArrivalPointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Client"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                                                           &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                                                           &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="UserReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                 &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                 &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                 &lt;element name="TransferDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="HolidayValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                                 &lt;element name="CommissionValue" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                 &lt;element name="VATValue"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;byte"&gt;
 *                                                         &lt;attribute name="SelfBill" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="InvoiceValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                                 &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PriceBreakdown"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="PriceLine"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                     &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="AccommodationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="AccommodationAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="SpecialRequest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OutboundTransferDetails"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="OutboundOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="OutboundDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="DepInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                           &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="ReturnTransferDetails"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="ReturnOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="ReturnDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="RetInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="RetDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="RetTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                           &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="JoiningIns"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Joinline" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "transferOnly", "breakdown" })
@XmlRootElement(name = "TCOML")
public class BookingRs {

	@XmlElement(name = "TransferOnly", required = true)
	protected BookingRs.TransferOnly transferOnly;
	@XmlAttribute(name = "version")
	protected Float version;
	@XmlAttribute(name = "cancelFee", required = false)
	protected Float cancelFee;
	@XmlElement(name="breakdown", required=false)
	protected static List<String> breakdown;
		
	public List<String> getBreakdown() {
		if (breakdown==null)
			breakdown=new ArrayList<String>();
		return breakdown;
	}

	public void setBreakdown(List<String> pbreakdown) {
		breakdown = pbreakdown;
	}

	/**
	 * Obtiene el valor de la propiedad transferOnly.
	 * 
	 * @return possible object is {@link BookingRs.TransferOnly }
	 * 
	 */
	public BookingRs.TransferOnly getTransferOnly() {
		return transferOnly;
	}

	/**
	 * Define el valor de la propiedad transferOnly.
	 * 
	 * @param value
	 *            allowed object is {@link BookingRs.TransferOnly }
	 * 
	 */
	public void setTransferOnly(BookingRs.TransferOnly value) {
		this.transferOnly = value;
	}

	/**
	 * Obtiene el valor de la propiedad version.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getVersion() {
		return version;
	}

	/**
	 * Define el valor de la propiedad version.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setVersion(Float value) {
		this.version = value;
	}

	public Float getCancelFee() {
		return cancelFee;
	}

	public void setCancelFee(Float cancelFee) {
		this.cancelFee = cancelFee;
	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera
	 * que haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;sequence&gt;
	 *         &lt;element name="Booking"&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                 &lt;sequence&gt;
	 *                   &lt;element name="Confirm"&gt;
	 *                     &lt;complexType&gt;
	 *                       &lt;complexContent&gt;
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                           &lt;sequence&gt;
	 *                             &lt;element name="BookingType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                             &lt;element name="VoucherInfo"&gt;
	 *                               &lt;complexType&gt;
	 *                                 &lt;complexContent&gt;
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                                     &lt;sequence&gt;
	 *                                       &lt;element name="BookingRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="DeparturePointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="ArrivalPointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="Client"&gt;
	 *                                         &lt;complexType&gt;
	 *                                           &lt;complexContent&gt;
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                                               &lt;sequence&gt;
	 *                                                 &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
	 *                                                 &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
	 *                                                 &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                               &lt;/sequence&gt;
	 *                                             &lt;/restriction&gt;
	 *                                           &lt;/complexContent&gt;
	 *                                         &lt;/complexType&gt;
	 *                                       &lt;/element&gt;
	 *                                       &lt;element name="UserReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                       &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                       &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                       &lt;element name="TransferDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="HolidayValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
	 *                                       &lt;element name="CommissionValue" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                       &lt;element name="VATValue"&gt;
	 *                                         &lt;complexType&gt;
	 *                                           &lt;simpleContent&gt;
	 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;byte"&gt;
	 *                                               &lt;attribute name="SelfBill" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
	 *                                             &lt;/extension&gt;
	 *                                           &lt;/simpleContent&gt;
	 *                                         &lt;/complexType&gt;
	 *                                       &lt;/element&gt;
	 *                                       &lt;element name="InvoiceValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
	 *                                       &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="PriceBreakdown"&gt;
	 *                                         &lt;complexType&gt;
	 *                                           &lt;complexContent&gt;
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                                               &lt;sequence&gt;
	 *                                                 &lt;element name="PriceLine"&gt;
	 *                                                   &lt;complexType&gt;
	 *                                                     &lt;complexContent&gt;
	 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                                                         &lt;sequence&gt;
	 *                                                           &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                           &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
	 *                                                         &lt;/sequence&gt;
	 *                                                       &lt;/restriction&gt;
	 *                                                     &lt;/complexContent&gt;
	 *                                                   &lt;/complexType&gt;
	 *                                                 &lt;/element&gt;
	 *                                               &lt;/sequence&gt;
	 *                                             &lt;/restriction&gt;
	 *                                           &lt;/complexContent&gt;
	 *                                         &lt;/complexType&gt;
	 *                                       &lt;/element&gt;
	 *                                       &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="AccommodationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="AccommodationAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="SpecialRequest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="OutboundTransferDetails"&gt;
	 *                                         &lt;complexType&gt;
	 *                                           &lt;complexContent&gt;
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                                               &lt;sequence&gt;
	 *                                                 &lt;element name="OutboundOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="OutboundDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="DepInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                                 &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                               &lt;/sequence&gt;
	 *                                             &lt;/restriction&gt;
	 *                                           &lt;/complexContent&gt;
	 *                                         &lt;/complexType&gt;
	 *                                       &lt;/element&gt;
	 *                                       &lt;element name="ReturnTransferDetails"&gt;
	 *                                         &lt;complexType&gt;
	 *                                           &lt;complexContent&gt;
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                                               &lt;sequence&gt;
	 *                                                 &lt;element name="ReturnOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="ReturnDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="RetInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="RetDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="RetTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                                 &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                                 &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                               &lt;/sequence&gt;
	 *                                             &lt;/restriction&gt;
	 *                                           &lt;/complexContent&gt;
	 *                                         &lt;/complexType&gt;
	 *                                       &lt;/element&gt;
	 *                                       &lt;element name="JoiningIns"&gt;
	 *                                         &lt;complexType&gt;
	 *                                           &lt;complexContent&gt;
	 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                                               &lt;sequence&gt;
	 *                                                 &lt;element name="Joinline" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
	 *                                               &lt;/sequence&gt;
	 *                                             &lt;/restriction&gt;
	 *                                           &lt;/complexContent&gt;
	 *                                         &lt;/complexType&gt;
	 *                                       &lt;/element&gt;
	 *                                     &lt;/sequence&gt;
	 *                                   &lt;/restriction&gt;
	 *                                 &lt;/complexContent&gt;
	 *                               &lt;/complexType&gt;
	 *                             &lt;/element&gt;
	 *                           &lt;/sequence&gt;
	 *                         &lt;/restriction&gt;
	 *                       &lt;/complexContent&gt;
	 *                     &lt;/complexType&gt;
	 *                   &lt;/element&gt;
	 *                 &lt;/sequence&gt;
	 *               &lt;/restriction&gt;
	 *             &lt;/complexContent&gt;
	 *           &lt;/complexType&gt;
	 *         &lt;/element&gt;
	 *       &lt;/sequence&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "booking", "errors" })
	public static class TransferOnly {

		@XmlElement(name = "Booking", required = false)
		protected BookingRs.TransferOnly.Booking booking;

		@XmlElement(name = "errors", required = false)
		protected Errors errors;

		public Errors getErrors() {
			return errors;
		}

		public void setErrors(Errors errors) {
			this.errors = errors;
		}

		/**
		 * Obtiene el valor de la propiedad booking.
		 * 
		 * @return possible object is {@link BookingRs.TransferOnly.Booking }
		 * 
		 */
		public BookingRs.TransferOnly.Booking getBooking() {
			return booking;
		}

		/**
		 * Define el valor de la propiedad booking.
		 * 
		 * @param value
		 *            allowed object is {@link BookingRs.TransferOnly.Booking }
		 * 
		 */
		public void setBooking(BookingRs.TransferOnly.Booking value) {
			this.booking = value;
		}

		/**
		 * <p>
		 * Clase Java para anonymous complex type.
		 * 
		 * <p>
		 * El siguiente fragmento de esquema especifica el contenido que se
		 * espera que haya en esta clase.
		 * 
		 * <pre>
		 * &lt;complexType&gt;
		 *   &lt;complexContent&gt;
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *       &lt;sequence&gt;
		 *         &lt;element name="Confirm"&gt;
		 *           &lt;complexType&gt;
		 *             &lt;complexContent&gt;
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                 &lt;sequence&gt;
		 *                   &lt;element name="BookingType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                   &lt;element name="VoucherInfo"&gt;
		 *                     &lt;complexType&gt;
		 *                       &lt;complexContent&gt;
		 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                           &lt;sequence&gt;
		 *                             &lt;element name="BookingRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="DeparturePointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="ArrivalPointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="Client"&gt;
		 *                               &lt;complexType&gt;
		 *                                 &lt;complexContent&gt;
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                                     &lt;sequence&gt;
		 *                                       &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
		 *                                       &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
		 *                                       &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                     &lt;/sequence&gt;
		 *                                   &lt;/restriction&gt;
		 *                                 &lt;/complexContent&gt;
		 *                               &lt;/complexType&gt;
		 *                             &lt;/element&gt;
		 *                             &lt;element name="UserReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
		 *                             &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
		 *                             &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
		 *                             &lt;element name="TransferDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="HolidayValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
		 *                             &lt;element name="CommissionValue" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
		 *                             &lt;element name="VATValue"&gt;
		 *                               &lt;complexType&gt;
		 *                                 &lt;simpleContent&gt;
		 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;byte"&gt;
		 *                                     &lt;attribute name="SelfBill" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
		 *                                   &lt;/extension&gt;
		 *                                 &lt;/simpleContent&gt;
		 *                               &lt;/complexType&gt;
		 *                             &lt;/element&gt;
		 *                             &lt;element name="InvoiceValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
		 *                             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="PriceBreakdown"&gt;
		 *                               &lt;complexType&gt;
		 *                                 &lt;complexContent&gt;
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                                     &lt;sequence&gt;
		 *                                       &lt;element name="PriceLine"&gt;
		 *                                         &lt;complexType&gt;
		 *                                           &lt;complexContent&gt;
		 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                                               &lt;sequence&gt;
		 *                                                 &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                                 &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
		 *                                               &lt;/sequence&gt;
		 *                                             &lt;/restriction&gt;
		 *                                           &lt;/complexContent&gt;
		 *                                         &lt;/complexType&gt;
		 *                                       &lt;/element&gt;
		 *                                     &lt;/sequence&gt;
		 *                                   &lt;/restriction&gt;
		 *                                 &lt;/complexContent&gt;
		 *                               &lt;/complexType&gt;
		 *                             &lt;/element&gt;
		 *                             &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="AccommodationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="AccommodationAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="SpecialRequest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                             &lt;element name="OutboundTransferDetails"&gt;
		 *                               &lt;complexType&gt;
		 *                                 &lt;complexContent&gt;
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                                     &lt;sequence&gt;
		 *                                       &lt;element name="OutboundOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="OutboundDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="DepInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
		 *                                       &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                     &lt;/sequence&gt;
		 *                                   &lt;/restriction&gt;
		 *                                 &lt;/complexContent&gt;
		 *                               &lt;/complexType&gt;
		 *                             &lt;/element&gt;
		 *                             &lt;element name="ReturnTransferDetails"&gt;
		 *                               &lt;complexType&gt;
		 *                                 &lt;complexContent&gt;
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                                     &lt;sequence&gt;
		 *                                       &lt;element name="ReturnOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="ReturnDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="RetInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="RetDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="RetTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                       &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
		 *                                       &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
		 *                                     &lt;/sequence&gt;
		 *                                   &lt;/restriction&gt;
		 *                                 &lt;/complexContent&gt;
		 *                               &lt;/complexType&gt;
		 *                             &lt;/element&gt;
		 *                             &lt;element name="JoiningIns"&gt;
		 *                               &lt;complexType&gt;
		 *                                 &lt;complexContent&gt;
		 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *                                     &lt;sequence&gt;
		 *                                       &lt;element name="Joinline" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
		 *                                     &lt;/sequence&gt;
		 *                                   &lt;/restriction&gt;
		 *                                 &lt;/complexContent&gt;
		 *                               &lt;/complexType&gt;
		 *                             &lt;/element&gt;
		 *                           &lt;/sequence&gt;
		 *                         &lt;/restriction&gt;
		 *                       &lt;/complexContent&gt;
		 *                     &lt;/complexType&gt;
		 *                   &lt;/element&gt;
		 *                 &lt;/sequence&gt;
		 *               &lt;/restriction&gt;
		 *             &lt;/complexContent&gt;
		 *           &lt;/complexType&gt;
		 *         &lt;/element&gt;
		 *       &lt;/sequence&gt;
		 *     &lt;/restriction&gt;
		 *   &lt;/complexContent&gt;
		 * &lt;/complexType&gt;
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "confirm" })
		public static class Booking {

			@XmlElement(name = "Confirm", required = true)
			protected BookingRs.TransferOnly.Booking.Confirm confirm;

			/**
			 * Obtiene el valor de la propiedad confirm.
			 * 
			 * @return possible object is
			 *         {@link BookingRs.TransferOnly.Booking.Confirm }
			 * 
			 */
			public BookingRs.TransferOnly.Booking.Confirm getConfirm() {
				return confirm;
			}

			/**
			 * Define el valor de la propiedad confirm.
			 * 
			 * @param value
			 *            allowed object is
			 *            {@link BookingRs.TransferOnly.Booking.Confirm }
			 * 
			 */
			public void setConfirm(BookingRs.TransferOnly.Booking.Confirm value) {
				this.confirm = value;
			}

			/**
			 * <p>
			 * Clase Java para anonymous complex type.
			 * 
			 * <p>
			 * El siguiente fragmento de esquema especifica el contenido que se
			 * espera que haya en esta clase.
			 * 
			 * <pre>
			 * &lt;complexType&gt;
			 *   &lt;complexContent&gt;
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *       &lt;sequence&gt;
			 *         &lt;element name="BookingType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *         &lt;element name="VoucherInfo"&gt;
			 *           &lt;complexType&gt;
			 *             &lt;complexContent&gt;
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *                 &lt;sequence&gt;
			 *                   &lt;element name="BookingRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="DeparturePointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="ArrivalPointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="Client"&gt;
			 *                     &lt;complexType&gt;
			 *                       &lt;complexContent&gt;
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *                           &lt;sequence&gt;
			 *                             &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
			 *                             &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
			 *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                           &lt;/sequence&gt;
			 *                         &lt;/restriction&gt;
			 *                       &lt;/complexContent&gt;
			 *                     &lt;/complexType&gt;
			 *                   &lt;/element&gt;
			 *                   &lt;element name="UserReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                   &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                   &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                   &lt;element name="TransferDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="HolidayValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
			 *                   &lt;element name="CommissionValue" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                   &lt;element name="VATValue"&gt;
			 *                     &lt;complexType&gt;
			 *                       &lt;simpleContent&gt;
			 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;byte"&gt;
			 *                           &lt;attribute name="SelfBill" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
			 *                         &lt;/extension&gt;
			 *                       &lt;/simpleContent&gt;
			 *                     &lt;/complexType&gt;
			 *                   &lt;/element&gt;
			 *                   &lt;element name="InvoiceValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
			 *                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="PriceBreakdown"&gt;
			 *                     &lt;complexType&gt;
			 *                       &lt;complexContent&gt;
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *                           &lt;sequence&gt;
			 *                             &lt;element name="PriceLine"&gt;
			 *                               &lt;complexType&gt;
			 *                                 &lt;complexContent&gt;
			 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *                                     &lt;sequence&gt;
			 *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
			 *                                     &lt;/sequence&gt;
			 *                                   &lt;/restriction&gt;
			 *                                 &lt;/complexContent&gt;
			 *                               &lt;/complexType&gt;
			 *                             &lt;/element&gt;
			 *                           &lt;/sequence&gt;
			 *                         &lt;/restriction&gt;
			 *                       &lt;/complexContent&gt;
			 *                     &lt;/complexType&gt;
			 *                   &lt;/element&gt;
			 *                   &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="AccommodationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="AccommodationAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="SpecialRequest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="OutboundTransferDetails"&gt;
			 *                     &lt;complexType&gt;
			 *                       &lt;complexContent&gt;
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *                           &lt;sequence&gt;
			 *                             &lt;element name="OutboundOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="OutboundDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="DepInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                             &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                           &lt;/sequence&gt;
			 *                         &lt;/restriction&gt;
			 *                       &lt;/complexContent&gt;
			 *                     &lt;/complexType&gt;
			 *                   &lt;/element&gt;
			 *                   &lt;element name="ReturnTransferDetails"&gt;
			 *                     &lt;complexType&gt;
			 *                       &lt;complexContent&gt;
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *                           &lt;sequence&gt;
			 *                             &lt;element name="ReturnOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="ReturnDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="RetInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="RetDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="RetTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                             &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                             &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                           &lt;/sequence&gt;
			 *                         &lt;/restriction&gt;
			 *                       &lt;/complexContent&gt;
			 *                     &lt;/complexType&gt;
			 *                   &lt;/element&gt;
			 *                   &lt;element name="JoiningIns"&gt;
			 *                     &lt;complexType&gt;
			 *                       &lt;complexContent&gt;
			 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *                           &lt;sequence&gt;
			 *                             &lt;element name="Joinline" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
			 *                           &lt;/sequence&gt;
			 *                         &lt;/restriction&gt;
			 *                       &lt;/complexContent&gt;
			 *                     &lt;/complexType&gt;
			 *                   &lt;/element&gt;
			 *                 &lt;/sequence&gt;
			 *               &lt;/restriction&gt;
			 *             &lt;/complexContent&gt;
			 *           &lt;/complexType&gt;
			 *         &lt;/element&gt;
			 *       &lt;/sequence&gt;
			 *     &lt;/restriction&gt;
			 *   &lt;/complexContent&gt;
			 * &lt;/complexType&gt;
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "bookingType", "voucherInfo" })
			public static class Confirm {

				@XmlElement(name = "BookingType", required = true)
				protected String bookingType;
				@XmlElement(name = "VoucherInfo", required = true)
				protected BookingRs.TransferOnly.Booking.Confirm.VoucherInfo voucherInfo;

				/**
				 * Obtiene el valor de la propiedad bookingType.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getBookingType() {
					return bookingType;
				}

				/**
				 * Define el valor de la propiedad bookingType.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setBookingType(String value) {
					this.bookingType = value;
				}

				/**
				 * Obtiene el valor de la propiedad voucherInfo.
				 * 
				 * @return possible object is
				 *         {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo }
				 * 
				 */
				public BookingRs.TransferOnly.Booking.Confirm.VoucherInfo getVoucherInfo() {
					return voucherInfo;
				}

				/**
				 * Define el valor de la propiedad voucherInfo.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo }
				 * 
				 */
				public void setVoucherInfo(BookingRs.TransferOnly.Booking.Confirm.VoucherInfo value) {
					this.voucherInfo = value;
				}

				/**
				 * <p>
				 * Clase Java para anonymous complex type.
				 * 
				 * <p>
				 * El siguiente fragmento de esquema especifica el contenido que
				 * se espera que haya en esta clase.
				 * 
				 * <pre>
				 * &lt;complexType&gt;
				 *   &lt;complexContent&gt;
				 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
				 *       &lt;sequence&gt;
				 *         &lt;element name="BookingRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="DeparturePointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="ArrivalPointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="Client"&gt;
				 *           &lt;complexType&gt;
				 *             &lt;complexContent&gt;
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
				 *                 &lt;sequence&gt;
				 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
				 *                   &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
				 *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                 &lt;/sequence&gt;
				 *               &lt;/restriction&gt;
				 *             &lt;/complexContent&gt;
				 *           &lt;/complexType&gt;
				 *         &lt;/element&gt;
				 *         &lt;element name="UserReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *         &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *         &lt;element name="TransferDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="HolidayValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
				 *         &lt;element name="CommissionValue" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *         &lt;element name="VATValue"&gt;
				 *           &lt;complexType&gt;
				 *             &lt;simpleContent&gt;
				 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;byte"&gt;
				 *                 &lt;attribute name="SelfBill" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
				 *               &lt;/extension&gt;
				 *             &lt;/simpleContent&gt;
				 *           &lt;/complexType&gt;
				 *         &lt;/element&gt;
				 *         &lt;element name="InvoiceValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
				 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="PriceBreakdown"&gt;
				 *           &lt;complexType&gt;
				 *             &lt;complexContent&gt;
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
				 *                 &lt;sequence&gt;
				 *                   &lt;element name="PriceLine"&gt;
				 *                     &lt;complexType&gt;
				 *                       &lt;complexContent&gt;
				 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
				 *                           &lt;sequence&gt;
				 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
				 *                           &lt;/sequence&gt;
				 *                         &lt;/restriction&gt;
				 *                       &lt;/complexContent&gt;
				 *                     &lt;/complexType&gt;
				 *                   &lt;/element&gt;
				 *                 &lt;/sequence&gt;
				 *               &lt;/restriction&gt;
				 *             &lt;/complexContent&gt;
				 *           &lt;/complexType&gt;
				 *         &lt;/element&gt;
				 *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="AccommodationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="AccommodationAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="SpecialRequest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="OutboundTransferDetails"&gt;
				 *           &lt;complexType&gt;
				 *             &lt;complexContent&gt;
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
				 *                 &lt;sequence&gt;
				 *                   &lt;element name="OutboundOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="OutboundDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="DepInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *                   &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                 &lt;/sequence&gt;
				 *               &lt;/restriction&gt;
				 *             &lt;/complexContent&gt;
				 *           &lt;/complexType&gt;
				 *         &lt;/element&gt;
				 *         &lt;element name="ReturnTransferDetails"&gt;
				 *           &lt;complexType&gt;
				 *             &lt;complexContent&gt;
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
				 *                 &lt;sequence&gt;
				 *                   &lt;element name="ReturnOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="ReturnDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="RetInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="RetDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="RetTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                   &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *                   &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *                 &lt;/sequence&gt;
				 *               &lt;/restriction&gt;
				 *             &lt;/complexContent&gt;
				 *           &lt;/complexType&gt;
				 *         &lt;/element&gt;
				 *         &lt;element name="JoiningIns"&gt;
				 *           &lt;complexType&gt;
				 *             &lt;complexContent&gt;
				 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
				 *                 &lt;sequence&gt;
				 *                   &lt;element name="Joinline" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
				 *                 &lt;/sequence&gt;
				 *               &lt;/restriction&gt;
				 *             &lt;/complexContent&gt;
				 *           &lt;/complexType&gt;
				 *         &lt;/element&gt;
				 *       &lt;/sequence&gt;
				 *     &lt;/restriction&gt;
				 *   &lt;/complexContent&gt;
				 * &lt;/complexType&gt;
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "bookingRef", "bookingDate", "bookingStatus", "departurePointCode",
						"arrivalPointCode", "sectorType", "client", "userReference", "adults", "children", "infants",
						"transferDescription", "holidayValue", "commissionValue", "vatValue", "invoiceValue",
						"currencyCode", "priceBreakdown", "propertyName", "accommodationAddress",
						"accommodationAddress2", "specialRequest", "supplierName", "outboundTransferDetails",
						"returnTransferDetails", "joiningIns" })
				public static class VoucherInfo {

					@XmlElement(name = "BookingRef", required = true)
					protected String bookingRef;
					@XmlElement(name = "BookingDate", required = true)
					protected String bookingDate;
					@XmlElement(name = "BookingStatus", required = true)
					protected String bookingStatus;
					@XmlElement(name = "DeparturePointCode", required = true)
					protected String departurePointCode;
					@XmlElement(name = "ArrivalPointCode", required = true)
					protected String arrivalPointCode;
					@XmlElement(name = "SectorType", required = true)
					protected String sectorType;
					@XmlElement(name = "Client", required = true)
					protected BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.Client client;
					@XmlElement(name = "UserReference", required = true)
					protected String userReference;
					@XmlElement(name = "Adults")
					protected byte adults;
					@XmlElement(name = "Children")
					protected byte children;
					@XmlElement(name = "Infants")
					protected byte infants;
					@XmlElement(name = "TransferDescription", required = true)
					protected String transferDescription;
					@XmlElement(name = "HolidayValue")
					protected float holidayValue;
					@XmlElement(name = "CommissionValue")
					protected byte commissionValue;
					@XmlElement(name = "VATValue", required = true)
					protected BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.VATValue vatValue;
					@XmlElement(name = "InvoiceValue")
					protected float invoiceValue;
					@XmlElement(name = "CurrencyCode", required = true)
					protected String currencyCode;
					@XmlElement(name = "PriceBreakdown", required = true)
					protected BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown priceBreakdown;
					@XmlElement(name = "PropertyName", required = true)
					protected String propertyName;
					@XmlElement(name = "AccommodationAddress", required = true)
					protected String accommodationAddress;
					@XmlElement(name = "AccommodationAddress2", required = true)
					protected String accommodationAddress2;
					@XmlElement(name = "SpecialRequest", required = true)
					protected String specialRequest;
					@XmlElement(name = "SupplierName", required = true)
					protected String supplierName;
					@XmlElement(name = "OutboundTransferDetails", required = true)
					protected BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.OutboundTransferDetails outboundTransferDetails;
					@XmlElement(name = "ReturnTransferDetails", required = true)
					protected BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.ReturnTransferDetails returnTransferDetails;
					@XmlElement(name = "JoiningIns", required = true)
					protected BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.JoiningIns joiningIns;

					/**
					 * Obtiene el valor de la propiedad bookingRef.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getBookingRef() {
						return bookingRef;
					}

					/**
					 * Define el valor de la propiedad bookingRef.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setBookingRef(String value) {
						this.bookingRef = value;
					}

					/**
					 * Obtiene el valor de la propiedad bookingDate.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getBookingDate() {
						return bookingDate;
					}

					/**
					 * Define el valor de la propiedad bookingDate.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setBookingDate(String value) {
						this.bookingDate = value;
					}

					/**
					 * Obtiene el valor de la propiedad bookingStatus.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getBookingStatus() {
						return bookingStatus;
					}

					/**
					 * Define el valor de la propiedad bookingStatus.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setBookingStatus(String value) {
						this.bookingStatus = value;
					}

					/**
					 * Obtiene el valor de la propiedad departurePointCode.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getDeparturePointCode() {
						return departurePointCode;
					}

					/**
					 * Define el valor de la propiedad departurePointCode.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setDeparturePointCode(String value) {
						this.departurePointCode = value;
					}

					/**
					 * Obtiene el valor de la propiedad arrivalPointCode.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getArrivalPointCode() {
						return arrivalPointCode;
					}

					/**
					 * Define el valor de la propiedad arrivalPointCode.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setArrivalPointCode(String value) {
						this.arrivalPointCode = value;
					}

					/**
					 * Obtiene el valor de la propiedad sectorType.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getSectorType() {
						return sectorType;
					}

					/**
					 * Define el valor de la propiedad sectorType.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setSectorType(String value) {
						this.sectorType = value;
					}

					/**
					 * Obtiene el valor de la propiedad client.
					 * 
					 * @return possible object is
					 *         {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.Client }
					 * 
					 */
					public BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.Client getClient() {
						return client;
					}

					/**
					 * Define el valor de la propiedad client.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.Client }
					 * 
					 */
					public void setClient(BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.Client value) {
						this.client = value;
					}

					/**
					 * Obtiene el valor de la propiedad userReference.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getUserReference() {
						return userReference;
					}

					/**
					 * Define el valor de la propiedad userReference.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setUserReference(String value) {
						this.userReference = value;
					}

					/**
					 * Obtiene el valor de la propiedad adults.
					 * 
					 */
					public byte getAdults() {
						return adults;
					}

					/**
					 * Define el valor de la propiedad adults.
					 * 
					 */
					public void setAdults(byte value) {
						this.adults = value;
					}

					/**
					 * Obtiene el valor de la propiedad children.
					 * 
					 */
					public byte getChildren() {
						return children;
					}

					/**
					 * Define el valor de la propiedad children.
					 * 
					 */
					public void setChildren(byte value) {
						this.children = value;
					}

					/**
					 * Obtiene el valor de la propiedad infants.
					 * 
					 */
					public byte getInfants() {
						return infants;
					}

					/**
					 * Define el valor de la propiedad infants.
					 * 
					 */
					public void setInfants(byte value) {
						this.infants = value;
					}

					/**
					 * Obtiene el valor de la propiedad transferDescription.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getTransferDescription() {
						return transferDescription;
					}

					/**
					 * Define el valor de la propiedad transferDescription.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setTransferDescription(String value) {
						this.transferDescription = value;
					}

					/**
					 * Obtiene el valor de la propiedad holidayValue.
					 * 
					 */
					public float getHolidayValue() {
						return holidayValue;
					}

					/**
					 * Define el valor de la propiedad holidayValue.
					 * 
					 */
					public void setHolidayValue(float value) {
						this.holidayValue = value;
					}

					/**
					 * Obtiene el valor de la propiedad commissionValue.
					 * 
					 */
					public byte getCommissionValue() {
						return commissionValue;
					}

					/**
					 * Define el valor de la propiedad commissionValue.
					 * 
					 */
					public void setCommissionValue(byte value) {
						this.commissionValue = value;
					}

					/**
					 * Obtiene el valor de la propiedad vatValue.
					 * 
					 * @return possible object is
					 *         {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.VATValue }
					 * 
					 */
					public BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.VATValue getVATValue() {
						return vatValue;
					}

					/**
					 * Define el valor de la propiedad vatValue.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.VATValue }
					 * 
					 */
					public void setVATValue(BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.VATValue value) {
						this.vatValue = value;
					}

					/**
					 * Obtiene el valor de la propiedad invoiceValue.
					 * 
					 */
					public float getInvoiceValue() {
						return invoiceValue;
					}

					/**
					 * Define el valor de la propiedad invoiceValue.
					 * 
					 */
					public void setInvoiceValue(float value) {
						this.invoiceValue = value;
					}

					/**
					 * Obtiene el valor de la propiedad currencyCode.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getCurrencyCode() {
						return currencyCode;
					}

					/**
					 * Define el valor de la propiedad currencyCode.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setCurrencyCode(String value) {
						this.currencyCode = value;
					}

					/**
					 * Obtiene el valor de la propiedad priceBreakdown.
					 * 
					 * @return possible object is
					 *         {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown }
					 * 
					 */
					public BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown getPriceBreakdown() {
						return priceBreakdown;
					}

					/**
					 * Define el valor de la propiedad priceBreakdown.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown }
					 * 
					 */
					public void setPriceBreakdown(
							BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown value) {
						this.priceBreakdown = value;
					}

					/**
					 * Obtiene el valor de la propiedad propertyName.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getPropertyName() {
						return propertyName;
					}

					/**
					 * Define el valor de la propiedad propertyName.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setPropertyName(String value) {
						this.propertyName = value;
					}

					/**
					 * Obtiene el valor de la propiedad accommodationAddress.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getAccommodationAddress() {
						return accommodationAddress;
					}

					/**
					 * Define el valor de la propiedad accommodationAddress.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setAccommodationAddress(String value) {
						this.accommodationAddress = value;
					}

					/**
					 * Obtiene el valor de la propiedad accommodationAddress2.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getAccommodationAddress2() {
						return accommodationAddress2;
					}

					/**
					 * Define el valor de la propiedad accommodationAddress2.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setAccommodationAddress2(String value) {
						this.accommodationAddress2 = value;
					}

					/**
					 * Obtiene el valor de la propiedad specialRequest.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getSpecialRequest() {
						return specialRequest;
					}

					/**
					 * Define el valor de la propiedad specialRequest.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setSpecialRequest(String value) {
						this.specialRequest = value;
					}

					/**
					 * Obtiene el valor de la propiedad supplierName.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getSupplierName() {
						return supplierName;
					}

					/**
					 * Define el valor de la propiedad supplierName.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setSupplierName(String value) {
						this.supplierName = value;
					}

					/**
					 * Obtiene el valor de la propiedad outboundTransferDetails.
					 * 
					 * @return possible object is
					 *         {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.OutboundTransferDetails }
					 * 
					 */
					public BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.OutboundTransferDetails getOutboundTransferDetails() {
						return outboundTransferDetails;
					}

					/**
					 * Define el valor de la propiedad outboundTransferDetails.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.OutboundTransferDetails }
					 * 
					 */
					public void setOutboundTransferDetails(
							BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.OutboundTransferDetails value) {
						this.outboundTransferDetails = value;
					}

					/**
					 * Obtiene el valor de la propiedad returnTransferDetails.
					 * 
					 * @return possible object is
					 *         {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.ReturnTransferDetails }
					 * 
					 */
					public BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.ReturnTransferDetails getReturnTransferDetails() {
						return returnTransferDetails;
					}

					/**
					 * Define el valor de la propiedad returnTransferDetails.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.ReturnTransferDetails }
					 * 
					 */
					public void setReturnTransferDetails(
							BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.ReturnTransferDetails value) {
						this.returnTransferDetails = value;
					}

					/**
					 * Obtiene el valor de la propiedad joiningIns.
					 * 
					 * @return possible object is
					 *         {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.JoiningIns }
					 * 
					 */
					public BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.JoiningIns getJoiningIns() {
						return joiningIns;
					}

					/**
					 * Define el valor de la propiedad joiningIns.
					 * 
					 * @param value
					 *            allowed object is
					 *            {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.JoiningIns }
					 * 
					 */
					public void setJoiningIns(BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.JoiningIns value) {
						this.joiningIns = value;
					}

					/**
					 * <p>
					 * Clase Java para anonymous complex type.
					 * 
					 * <p>
					 * El siguiente fragmento de esquema especifica el contenido
					 * que se espera que haya en esta clase.
					 * 
					 * <pre>
					 * &lt;complexType&gt;
					 *   &lt;complexContent&gt;
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
					 *       &lt;sequence&gt;
					 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
					 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
					 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *       &lt;/sequence&gt;
					 *     &lt;/restriction&gt;
					 *   &lt;/complexContent&gt;
					 * &lt;/complexType&gt;
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "lastName", "firstName", "title", "phone", "mobile",
							"countryCode", "email" })
					public static class Client {

						@XmlElement(name = "LastName", required = true)
						protected String lastName;
						@XmlElement(name = "FirstName", required = true)
						protected String firstName;
						@XmlElement(name = "Title", required = true)
						protected String title;
						@XmlElement(name = "Phone")
						protected long phone;
						@XmlElement(name = "Mobile")
						protected long mobile;
						@XmlElement(name = "CountryCode", required = true)
						protected String countryCode;
						@XmlElement(name = "Email", required = true)
						protected String email;

						/**
						 * Obtiene el valor de la propiedad lastName.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getLastName() {
							return lastName;
						}

						/**
						 * Define el valor de la propiedad lastName.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setLastName(String value) {
							this.lastName = value;
						}

						/**
						 * Obtiene el valor de la propiedad firstName.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getFirstName() {
							return firstName;
						}

						/**
						 * Define el valor de la propiedad firstName.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setFirstName(String value) {
							this.firstName = value;
						}

						/**
						 * Obtiene el valor de la propiedad title.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getTitle() {
							return title;
						}

						/**
						 * Define el valor de la propiedad title.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setTitle(String value) {
							this.title = value;
						}

						/**
						 * Obtiene el valor de la propiedad phone.
						 * 
						 */
						public long getPhone() {
							return phone;
						}

						/**
						 * Define el valor de la propiedad phone.
						 * 
						 */
						public void setPhone(long value) {
							this.phone = value;
						}

						/**
						 * Obtiene el valor de la propiedad mobile.
						 * 
						 */
						public long getMobile() {
							return mobile;
						}

						/**
						 * Define el valor de la propiedad mobile.
						 * 
						 */
						public void setMobile(long value) {
							this.mobile = value;
						}

						/**
						 * Obtiene el valor de la propiedad countryCode.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getCountryCode() {
							return countryCode;
						}

						/**
						 * Define el valor de la propiedad countryCode.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setCountryCode(String value) {
							this.countryCode = value;
						}

						/**
						 * Obtiene el valor de la propiedad email.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getEmail() {
							return email;
						}

						/**
						 * Define el valor de la propiedad email.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setEmail(String value) {
							this.email = value;
						}

					}

					/**
					 * <p>
					 * Clase Java para anonymous complex type.
					 * 
					 * <p>
					 * El siguiente fragmento de esquema especifica el contenido
					 * que se espera que haya en esta clase.
					 * 
					 * <pre>
					 * &lt;complexType&gt;
					 *   &lt;complexContent&gt;
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
					 *       &lt;sequence&gt;
					 *         &lt;element name="Joinline" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
					 *       &lt;/sequence&gt;
					 *     &lt;/restriction&gt;
					 *   &lt;/complexContent&gt;
					 * &lt;/complexType&gt;
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "joinLine" })
					public static class JoiningIns {

						@XmlElement(name = "JoinLine")
						protected List<String> joinLine;

						/**
						 * Gets the value of the joinline property.
						 * 
						 * <p>
						 * This accessor method returns a reference to the live
						 * list, not a snapshot. Therefore any modification you
						 * make to the returned list will be present inside the
						 * JAXB object. This is why there is not a
						 * <CODE>set</CODE> method for the joinline property.
						 * 
						 * <p>
						 * For example, to add a new item, do as follows:
						 * 
						 * <pre>
						 * getJoinline().add(newItem);
						 * </pre>
						 * 
						 * 
						 * <p>
						 * Objects of the following type(s) are allowed in the
						 * list {@link String }
						 * 
						 * 
						 */
						public List<String> getJoinLine() {
							if (joinLine == null) {
								joinLine = new ArrayList<String>();
							}
							return this.joinLine;
						}

					}

					/**
					 * <p>
					 * Clase Java para anonymous complex type.
					 * 
					 * <p>
					 * El siguiente fragmento de esquema especifica el contenido
					 * que se espera que haya en esta clase.
					 * 
					 * <pre>
					 * &lt;complexType&gt;
					 *   &lt;complexContent&gt;
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
					 *       &lt;sequence&gt;
					 *         &lt;element name="OutboundOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="OutboundDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="DepInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
					 *         &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *       &lt;/sequence&gt;
					 *     &lt;/restriction&gt;
					 *   &lt;/complexContent&gt;
					 * &lt;/complexType&gt;
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "outboundOrigin", "outboundDestination", "depInfo", "arrDate",
							"arrTime", "numUnits", "vehicle" })
					public static class OutboundTransferDetails {

						@XmlElement(name = "OutboundOrigin", required = true)
						protected String outboundOrigin;
						@XmlElement(name = "OutboundDestination", required = true)
						protected String outboundDestination;
						@XmlElement(name = "DepInfo", required = true)
						protected String depInfo;
						@XmlElement(name = "ArrDate", required = true)
						protected String arrDate;
						@XmlElement(name = "ArrTime", required = true)
						protected String arrTime;
						@XmlElement(name = "NumUnits")
						protected byte numUnits;
						@XmlElement(name = "Vehicle", required = true)
						protected String vehicle;

						/**
						 * Obtiene el valor de la propiedad outboundOrigin.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getOutboundOrigin() {
							return outboundOrigin;
						}

						/**
						 * Define el valor de la propiedad outboundOrigin.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setOutboundOrigin(String value) {
							this.outboundOrigin = value;
						}

						/**
						 * Obtiene el valor de la propiedad outboundDestination.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getOutboundDestination() {
							return outboundDestination;
						}

						/**
						 * Define el valor de la propiedad outboundDestination.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setOutboundDestination(String value) {
							this.outboundDestination = value;
						}

						/**
						 * Obtiene el valor de la propiedad depInfo.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getDepInfo() {
							return depInfo;
						}

						/**
						 * Define el valor de la propiedad depInfo.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setDepInfo(String value) {
							this.depInfo = value;
						}

						/**
						 * Obtiene el valor de la propiedad arrDate.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getArrDate() {
							return arrDate;
						}

						/**
						 * Define el valor de la propiedad arrDate.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setArrDate(String value) {
							this.arrDate = value;
						}

						/**
						 * Obtiene el valor de la propiedad arrTime.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getArrTime() {
							return arrTime;
						}

						/**
						 * Define el valor de la propiedad arrTime.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setArrTime(String value) {
							this.arrTime = value;
						}

						/**
						 * Obtiene el valor de la propiedad numUnits.
						 * 
						 */
						public byte getNumUnits() {
							return numUnits;
						}

						/**
						 * Define el valor de la propiedad numUnits.
						 * 
						 */
						public void setNumUnits(byte value) {
							this.numUnits = value;
						}

						/**
						 * Obtiene el valor de la propiedad vehicle.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getVehicle() {
							return vehicle;
						}

						/**
						 * Define el valor de la propiedad vehicle.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setVehicle(String value) {
							this.vehicle = value;
						}

					}

					/**
					 * <p>
					 * Clase Java para anonymous complex type.
					 * 
					 * <p>
					 * El siguiente fragmento de esquema especifica el contenido
					 * que se espera que haya en esta clase.
					 * 
					 * <pre>
					 * &lt;complexType&gt;
					 *   &lt;complexContent&gt;
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
					 *       &lt;sequence&gt;
					 *         &lt;element name="PriceLine"&gt;
					 *           &lt;complexType&gt;
					 *             &lt;complexContent&gt;
					 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
					 *                 &lt;sequence&gt;
					 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
					 *                 &lt;/sequence&gt;
					 *               &lt;/restriction&gt;
					 *             &lt;/complexContent&gt;
					 *           &lt;/complexType&gt;
					 *         &lt;/element&gt;
					 *       &lt;/sequence&gt;
					 *     &lt;/restriction&gt;
					 *   &lt;/complexContent&gt;
					 * &lt;/complexType&gt;
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "priceLine" })
					public static class PriceBreakdown {

						@XmlElement(name = "PriceLine", required = true)
						protected BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown.PriceLine priceLine;

						/**
						 * Obtiene el valor de la propiedad priceLine.
						 * 
						 * @return possible object is
						 *         {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown.PriceLine }
						 * 
						 */
						public BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown.PriceLine getPriceLine() {
							return priceLine;
						}

						/**
						 * Define el valor de la propiedad priceLine.
						 * 
						 * @param value
						 *            allowed object is
						 *            {@link BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown.PriceLine }
						 * 
						 */
						public void setPriceLine(
								BookingRs.TransferOnly.Booking.Confirm.VoucherInfo.PriceBreakdown.PriceLine value) {
							this.priceLine = value;
						}

						/**
						 * <p>
						 * Clase Java para anonymous complex type.
						 * 
						 * <p>
						 * El siguiente fragmento de esquema especifica el
						 * contenido que se espera que haya en esta clase.
						 * 
						 * <pre>
						 * &lt;complexType&gt;
						 *   &lt;complexContent&gt;
						 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
						 *       &lt;sequence&gt;
						 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
						 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
						 *       &lt;/sequence&gt;
						 *     &lt;/restriction&gt;
						 *   &lt;/complexContent&gt;
						 * &lt;/complexType&gt;
						 * </pre>
						 * 
						 * 
						 */
						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "description", "amount" })
						public static class PriceLine {

							@XmlElement(name = "Description", required = true)
							protected String description;
							@XmlElement(name = "Amount")
							protected float amount;

							/**
							 * Obtiene el valor de la propiedad description.
							 * 
							 * @return possible object is {@link String }
							 * 
							 */
							public String getDescription() {
								return description;
							}

							/**
							 * Define el valor de la propiedad description.
							 * 
							 * @param value
							 *            allowed object is {@link String }
							 * 
							 */
							public void setDescription(String value) {
								this.description = value;
							}

							/**
							 * Obtiene el valor de la propiedad amount.
							 * 
							 */
							public float getAmount() {
								return amount;
							}

							/**
							 * Define el valor de la propiedad amount.
							 * 
							 */
							public void setAmount(float value) {
								this.amount = value;
							}

						}

					}

					/**
					 * <p>
					 * Clase Java para anonymous complex type.
					 * 
					 * <p>
					 * El siguiente fragmento de esquema especifica el contenido
					 * que se espera que haya en esta clase.
					 * 
					 * <pre>
					 * &lt;complexType&gt;
					 *   &lt;complexContent&gt;
					 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
					 *       &lt;sequence&gt;
					 *         &lt;element name="ReturnOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="ReturnDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="RetInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="RetDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="RetTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *         &lt;element name="NumUnits" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
					 *         &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
					 *       &lt;/sequence&gt;
					 *     &lt;/restriction&gt;
					 *   &lt;/complexContent&gt;
					 * &lt;/complexType&gt;
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "returnOrigin", "returnDestination", "retInfo", "retDate",
							"retTime", "numUnits", "vehicle" })
					public static class ReturnTransferDetails {

						@XmlElement(name = "ReturnOrigin", required = true)
						protected String returnOrigin;
						@XmlElement(name = "ReturnDestination", required = true)
						protected String returnDestination;
						@XmlElement(name = "RetInfo", required = true)
						protected String retInfo;
						@XmlElement(name = "RetDate", required = true)
						protected String retDate;
						@XmlElement(name = "RetTime", required = true)
						protected String retTime;
						@XmlElement(name = "NumUnits")
						protected byte numUnits;
						@XmlElement(name = "Vehicle", required = true)
						protected String vehicle;

						/**
						 * Obtiene el valor de la propiedad returnOrigin.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getReturnOrigin() {
							return returnOrigin;
						}

						/**
						 * Define el valor de la propiedad returnOrigin.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setReturnOrigin(String value) {
							this.returnOrigin = value;
						}

						/**
						 * Obtiene el valor de la propiedad returnDestination.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getReturnDestination() {
							return returnDestination;
						}

						/**
						 * Define el valor de la propiedad returnDestination.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setReturnDestination(String value) {
							this.returnDestination = value;
						}

						/**
						 * Obtiene el valor de la propiedad retInfo.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getRetInfo() {
							return retInfo;
						}

						/**
						 * Define el valor de la propiedad retInfo.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setRetInfo(String value) {
							this.retInfo = value;
						}

						/**
						 * Obtiene el valor de la propiedad retDate.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getRetDate() {
							return retDate;
						}

						/**
						 * Define el valor de la propiedad retDate.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setRetDate(String value) {
							this.retDate = value;
						}

						/**
						 * Obtiene el valor de la propiedad retTime.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getRetTime() {
							return retTime;
						}

						/**
						 * Define el valor de la propiedad retTime.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setRetTime(String value) {
							this.retTime = value;
						}

						/**
						 * Obtiene el valor de la propiedad numUnits.
						 * 
						 */
						public byte getNumUnits() {
							return numUnits;
						}

						/**
						 * Define el valor de la propiedad numUnits.
						 * 
						 */
						public void setNumUnits(byte value) {
							this.numUnits = value;
						}

						/**
						 * Obtiene el valor de la propiedad vehicle.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getVehicle() {
							return vehicle;
						}

						/**
						 * Define el valor de la propiedad vehicle.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setVehicle(String value) {
							this.vehicle = value;
						}

					}

					/**
					 * <p>
					 * Clase Java para anonymous complex type.
					 * 
					 * <p>
					 * El siguiente fragmento de esquema especifica el contenido
					 * que se espera que haya en esta clase.
					 * 
					 * <pre>
					 * &lt;complexType&gt;
					 *   &lt;simpleContent&gt;
					 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;byte"&gt;
					 *       &lt;attribute name="SelfBill" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
					 *     &lt;/extension&gt;
					 *   &lt;/simpleContent&gt;
					 * &lt;/complexType&gt;
					 * </pre>
					 * 
					 * 
					 */
					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "value" })
					public static class VATValue {

						@XmlValue
						protected byte value;
						@XmlAttribute(name = "SelfBill")
						protected String selfBill;

						/**
						 * Obtiene el valor de la propiedad value.
						 * 
						 */
						public byte getValue() {
							return value;
						}

						/**
						 * Define el valor de la propiedad value.
						 * 
						 */
						public void setValue(byte value) {
							this.value = value;
						}

						/**
						 * Obtiene el valor de la propiedad selfBill.
						 * 
						 * @return possible object is {@link String }
						 * 
						 */
						public String getSelfBill() {
							return selfBill;
						}

						/**
						 * Define el valor de la propiedad selfBill.
						 * 
						 * @param value
						 *            allowed object is {@link String }
						 * 
						 */
						public void setSelfBill(String value) {
							this.selfBill = value;
						}

					}

				}

			}

		}

	}

}
