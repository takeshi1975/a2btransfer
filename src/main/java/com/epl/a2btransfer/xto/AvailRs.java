//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.21 a las 07:24:05 PM CEST 
//

package com.epl.a2btransfer.xto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

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
 *                   &lt;element name="Availability"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="A2BDeepLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                             &lt;element name="RHDeepLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                             &lt;element name="Avline" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PRID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="TransferCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TransferDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TransferPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                       &lt;element name="DeparturePointType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ArrivalPointType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="VehicleDetails"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="VehicleID" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *                                                 &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="VehicleCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                 &lt;element name="MinCapacity" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                 &lt;element name="MaxCapacity" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                 &lt;element name="MinStops" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                 &lt;element name="MaxStops" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                 &lt;element name="NumberOfBags" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                                 &lt;element name="NumberOfVehicles" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="DistanceKM" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                       &lt;element name="OutboundTransferDetails"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="OutboundOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OutboundDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OutboundJourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OutboundArrivalDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OutboundArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OutboundPickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OutboundPickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                                                 &lt;element name="ReturnJourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="ReturnDepartureDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="ReturnDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="ReturnPickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="ReturnPickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TransferTotalPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                       &lt;element name="Pricing" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                       &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                       &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
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
 *       &lt;attribute name="company" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sess" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "transferOnly" })
@XmlRootElement(name = "TCOML")
public class AvailRs {

	@XmlElement(name = "TransferOnly", required = true)
	protected AvailRs.TransferOnly transferOnly;
	@XmlAttribute(name = "version")
	protected Float version;
	@XmlAttribute(name = "company")
	protected String company;
	@XmlAttribute(name = "sess")
	protected BigInteger sess;

	/**
	 * Obtiene el valor de la propiedad transferOnly.
	 * 
	 * @return possible object is {@link AvailRs.TransferOnly }
	 * 
	 */
	public AvailRs.TransferOnly getTransferOnly() {
		return transferOnly;
	}

	/**
	 * Define el valor de la propiedad transferOnly.
	 * 
	 * @param value
	 *            allowed object is {@link AvailRs.TransferOnly }
	 * 
	 */
	public void setTransferOnly(AvailRs.TransferOnly value) {
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

	/**
	 * Obtiene el valor de la propiedad company.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * Define el valor de la propiedad company.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCompany(String value) {
		this.company = value;
	}

	/**
	 * Obtiene el valor de la propiedad sess.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getSess() {
		return sess;
	}

	/**
	 * Define el valor de la propiedad sess.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setSess(BigInteger value) {
		this.sess = value;
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
	 *         &lt;element name="Availability"&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                 &lt;sequence&gt;
	 *                   &lt;element name="A2BDeepLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
	 *                   &lt;element name="RHDeepLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
	 *                   &lt;element name="Avline" maxOccurs="unbounded" minOccurs="0"&gt;
	 *                     &lt;complexType&gt;
	 *                       &lt;complexContent&gt;
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                           &lt;sequence&gt;
	 *                             &lt;element name="PRID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
	 *                             &lt;element name="TransferCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                             &lt;element name="TransferDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                             &lt;element name="TransferPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
	 *                             &lt;element name="DeparturePointType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                             &lt;element name="ArrivalPointType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                             &lt;element name="VehicleDetails"&gt;
	 *                               &lt;complexType&gt;
	 *                                 &lt;complexContent&gt;
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                                     &lt;sequence&gt;
	 *                                       &lt;element name="VehicleID" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
	 *                                       &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="VehicleCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                       &lt;element name="MinCapacity" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                       &lt;element name="MaxCapacity" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                       &lt;element name="MinStops" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                       &lt;element name="MaxStops" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                       &lt;element name="NumberOfBags" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                       &lt;element name="NumberOfVehicles" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                                     &lt;/sequence&gt;
	 *                                   &lt;/restriction&gt;
	 *                                 &lt;/complexContent&gt;
	 *                               &lt;/complexType&gt;
	 *                             &lt;/element&gt;
	 *                             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                             &lt;element name="DistanceKM" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                             &lt;element name="OutboundTransferDetails"&gt;
	 *                               &lt;complexType&gt;
	 *                                 &lt;complexContent&gt;
	 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                                     &lt;sequence&gt;
	 *                                       &lt;element name="OutboundOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="OutboundDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="OutboundJourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="OutboundArrivalDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="OutboundArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="OutboundPickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="OutboundPickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
	 *                                       &lt;element name="ReturnJourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="ReturnDepartureDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="ReturnDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="ReturnPickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                       &lt;element name="ReturnPickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                                     &lt;/sequence&gt;
	 *                                   &lt;/restriction&gt;
	 *                                 &lt;/complexContent&gt;
	 *                               &lt;/complexType&gt;
	 *                             &lt;/element&gt;
	 *                             &lt;element name="TransferTotalPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
	 *                             &lt;element name="Pricing" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
	 *                             &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
	 *                             &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
	 *                             &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
	 *                           &lt;/sequence&gt;
	 *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
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
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "availability","errors" })
	public static class TransferOnly {
		/***** 									Juanjo 								****/
		
		@XmlElement(name = "Availability", required = false)
		protected AvailRs.TransferOnly.Availability availability;
		
		@XmlElement(name = "errors", required = false)	
		protected Errors errors;		

		public AvailRs.TransferOnly.Availability getAvailability() {
			return availability;
		}

		public void setAvailability(AvailRs.TransferOnly.Availability value) {
			this.availability = value;
		}		
		
		public Errors getErrors() {
			return errors;
		}

		public void setErrors(Errors errors) {
			this.errors = errors;
		}
		
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "a2BDeepLink", "rhDeepLink", "avline" })
		public static class Availability {

			@XmlElement(name = "A2BDeepLink", required = true)
			@XmlSchemaType(name = "anyURI")
			protected String a2BDeepLink;
			@XmlElement(name = "RHDeepLink", required = true)
			@XmlSchemaType(name = "anyURI")
			protected String rhDeepLink;
			@XmlElement(name = "Avline")
			protected List<AvailRs.TransferOnly.Availability.Avline> avline;

			/**
			 * Obtiene el valor de la propiedad a2BDeepLink.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getA2BDeepLink() {
				return a2BDeepLink;
			}

			/**
			 * Define el valor de la propiedad a2BDeepLink.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setA2BDeepLink(String value) {
				this.a2BDeepLink = value;
			}

			/**
			 * Obtiene el valor de la propiedad rhDeepLink.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRHDeepLink() {
				return rhDeepLink;
			}

			/**
			 * Define el valor de la propiedad rhDeepLink.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRHDeepLink(String value) {
				this.rhDeepLink = value;
			}

			/**
			 * Gets the value of the avline property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the avline property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getAvline().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link AvailRs.TransferOnly.Availability.Avline }
			 * 
			 * 
			 */
			public List<AvailRs.TransferOnly.Availability.Avline> getAvline() {
				if (avline == null) {
					avline = new ArrayList<AvailRs.TransferOnly.Availability.Avline>();
				}
				return this.avline;
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
			 *         &lt;element name="PRID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
			 *         &lt;element name="TransferCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *         &lt;element name="TransferDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *         &lt;element name="TransferPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
			 *         &lt;element name="DeparturePointType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *         &lt;element name="ArrivalPointType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *         &lt;element name="VehicleDetails"&gt;
			 *           &lt;complexType&gt;
			 *             &lt;complexContent&gt;
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *                 &lt;sequence&gt;
			 *                   &lt;element name="VehicleID" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
			 *                   &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="VehicleCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                   &lt;element name="MinCapacity" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                   &lt;element name="MaxCapacity" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                   &lt;element name="MinStops" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                   &lt;element name="MaxStops" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                   &lt;element name="NumberOfBags" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                   &lt;element name="NumberOfVehicles" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *                 &lt;/sequence&gt;
			 *               &lt;/restriction&gt;
			 *             &lt;/complexContent&gt;
			 *           &lt;/complexType&gt;
			 *         &lt;/element&gt;
			 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *         &lt;element name="DistanceKM" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *         &lt;element name="OutboundTransferDetails"&gt;
			 *           &lt;complexType&gt;
			 *             &lt;complexContent&gt;
			 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
			 *                 &lt;sequence&gt;
			 *                   &lt;element name="OutboundOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="OutboundDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="OutboundJourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="OutboundArrivalDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="OutboundArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="OutboundPickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="OutboundPickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
			 *                   &lt;element name="ReturnJourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="ReturnDepartureDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="ReturnDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="ReturnPickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                   &lt;element name="ReturnPickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *                 &lt;/sequence&gt;
			 *               &lt;/restriction&gt;
			 *             &lt;/complexContent&gt;
			 *           &lt;/complexType&gt;
			 *         &lt;/element&gt;
			 *         &lt;element name="TransferTotalPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
			 *         &lt;element name="Pricing" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
			 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
			 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
			 *         &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
			 *       &lt;/sequence&gt;
			 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
			 *     &lt;/restriction&gt;
			 *   &lt;/complexContent&gt;
			 * &lt;/complexType&gt;
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "prid", "transferCode", "transferDescription", "transferPrice",
					"departurePointType", "arrivalPointType", "vehicleDetails", "currencyCode", "distanceKM",
					"outboundTransferDetails", "returnTransferDetails", "transferTotalPrice", "pricing", "discount",
					"discountPercent", "disclaimer", "disclaimertxt" })
			public static class Avline {

				@XmlElement(name = "PRID")
				protected int prid;
				@XmlElement(name = "TransferCode", required = true)
				protected String transferCode;
				@XmlElement(name = "TransferDescription", required = true)
				protected String transferDescription;
				@XmlElement(name = "TransferPrice")
				protected float transferPrice;
				@XmlElement(name = "DeparturePointType", required = true)
				protected String departurePointType;
				@XmlElement(name = "ArrivalPointType", required = true)
				protected String arrivalPointType;
				@XmlElement(name = "VehicleDetails", required = true)
				protected AvailRs.TransferOnly.Availability.Avline.VehicleDetails vehicleDetails;
				@XmlElement(name = "CurrencyCode", required = true)
				protected String currencyCode;
				@XmlElement(name = "DistanceKM")
				protected byte distanceKM;
				@XmlElement(name = "OutboundTransferDetails", required = true)
				protected AvailRs.TransferOnly.Availability.Avline.OutboundTransferDetails outboundTransferDetails;
				@XmlElement(name = "ReturnTransferDetails", required = true)
				protected AvailRs.TransferOnly.Availability.Avline.ReturnTransferDetails returnTransferDetails;
				@XmlElement(name = "TransferTotalPrice")
				protected float transferTotalPrice;
				@XmlElement(name = "Pricing", required = true)
				protected String pricing;
				@XmlElement(name = "Discount")
				protected float discount;
				@XmlElement(name = "DiscountPercent")
				protected float discountPercent;
				@XmlElement(name = "Disclaimer")
				protected byte disclaimer;
				@XmlElement(name="DisclaimerTxt", required=false)
				protected String disclaimerTxt;
				@XmlElement(name="DisclaimerTitle", required=false)
				protected String disclaimerTitle;
				@XmlAttribute(name = "count")
				protected Byte count;

				/**
				 * Obtiene el valor de la propiedad prid.
				 * 
				 */
				public int getPrid() {
					return prid;
				}

				/**
				 * Define el valor de la propiedad prid.
				 * 
				 */
				public void setPrid(int value) {
					this.prid = value;
				}

				/**
				 * Obtiene el valor de la propiedad transferCode.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getTransferCode() {
					return transferCode;
				}

				/**
				 * Define el valor de la propiedad transferCode.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setTransferCode(String value) {
					this.transferCode = value;
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
				 * Obtiene el valor de la propiedad transferPrice.
				 * 
				 */
				public float getTransferPrice() {
					return transferPrice;
				}

				/**
				 * Define el valor de la propiedad transferPrice.
				 * 
				 */
				public void setTransferPrice(float value) {
					this.transferPrice = value;
				}

				/**
				 * Obtiene el valor de la propiedad departurePointType.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getDeparturePointType() {
					return departurePointType;
				}

				/**
				 * Define el valor de la propiedad departurePointType.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setDeparturePointType(String value) {
					this.departurePointType = value;
				}

				/**
				 * Obtiene el valor de la propiedad arrivalPointType.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getArrivalPointType() {
					return arrivalPointType;
				}

				/**
				 * Define el valor de la propiedad arrivalPointType.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setArrivalPointType(String value) {
					this.arrivalPointType = value;
				}

				/**
				 * Obtiene el valor de la propiedad vehicleDetails.
				 * 
				 * @return possible object is
				 *         {@link AvailRs.TransferOnly.Availability.Avline.VehicleDetails }
				 * 
				 */
				public AvailRs.TransferOnly.Availability.Avline.VehicleDetails getVehicleDetails() {
					return vehicleDetails;
				}

				/**
				 * Define el valor de la propiedad vehicleDetails.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link AvailRs.TransferOnly.Availability.Avline.VehicleDetails }
				 * 
				 */
				public void setVehicleDetails(AvailRs.TransferOnly.Availability.Avline.VehicleDetails value) {
					this.vehicleDetails = value;
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
				 * Obtiene el valor de la propiedad distanceKM.
				 * 
				 */
				public byte getDistanceKM() {
					return distanceKM;
				}

				/**
				 * Define el valor de la propiedad distanceKM.
				 * 
				 */
				public void setDistanceKM(byte value) {
					this.distanceKM = value;
				}

				/**
				 * Obtiene el valor de la propiedad outboundTransferDetails.
				 * 
				 * @return possible object is
				 *         {@link AvailRs.TransferOnly.Availability.Avline.OutboundTransferDetails }
				 * 
				 */
				public AvailRs.TransferOnly.Availability.Avline.OutboundTransferDetails getOutboundTransferDetails() {
					return outboundTransferDetails;
				}

				/**
				 * Define el valor de la propiedad outboundTransferDetails.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link AvailRs.TransferOnly.Availability.Avline.OutboundTransferDetails }
				 * 
				 */
				public void setOutboundTransferDetails(
						AvailRs.TransferOnly.Availability.Avline.OutboundTransferDetails value) {
					this.outboundTransferDetails = value;
				}

				/**
				 * Obtiene el valor de la propiedad returnTransferDetails.
				 * 
				 * @return possible object is
				 *         {@link AvailRs.TransferOnly.Availability.Avline.ReturnTransferDetails }
				 * 
				 */
				public AvailRs.TransferOnly.Availability.Avline.ReturnTransferDetails getReturnTransferDetails() {
					return returnTransferDetails;
				}

				/**
				 * Define el valor de la propiedad returnTransferDetails.
				 * 
				 * @param value
				 *            allowed object is
				 *            {@link AvailRs.TransferOnly.Availability.Avline.ReturnTransferDetails }
				 * 
				 */
				public void setReturnTransferDetails(
						AvailRs.TransferOnly.Availability.Avline.ReturnTransferDetails value) {
					this.returnTransferDetails = value;
				}

				/**
				 * Obtiene el valor de la propiedad transferTotalPrice.
				 * 
				 */
				public float getTransferTotalPrice() {
					return transferTotalPrice;
				}

				/**
				 * Define el valor de la propiedad transferTotalPrice.
				 * 
				 */
				public void setTransferTotalPrice(float value) {
					this.transferTotalPrice = value;
				}

				/**
				 * Obtiene el valor de la propiedad pricing.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getPricing() {
					return pricing;
				}

				/**
				 * Define el valor de la propiedad pricing.
				 * 
				 * @param value
				 *            allowed object is {@link String }
				 * 
				 */
				public void setPricing(String value) {
					this.pricing = value;
				}

				/**
				 * Obtiene el valor de la propiedad discount.
				 * 
				 */
				public float getDiscount() {
					return discount;
				}

				/**
				 * Define el valor de la propiedad discount.
				 * 
				 */
				public void setDiscount(float value) {
					this.discount = value;
				}

				/**
				 * Obtiene el valor de la propiedad discountPercent.
				 * 
				 */
				public float getDiscountPercent() {
					return discountPercent;
				}

				/**
				 * Define el valor de la propiedad discountPercent.
				 * 
				 */
				public void setDiscountPercent(float value) {
					this.discountPercent = value;
				}

				/**
				 * Obtiene el valor de la propiedad disclaimer.
				 * 
				 */
				public byte getDisclaimer() {
					return disclaimer;
				}

				/**
				 * Define el valor de la propiedad disclaimer.
				 * 
				 */
				public void setDisclaimer(byte value) {
					this.disclaimer = value;
				}												
				
				public String getDisclaimerTitle() {
					return disclaimerTitle;
				}

				public void setDisclaimerTitle(String disclaimerTitle) {
					this.disclaimerTitle = disclaimerTitle;
				}

				public String getDisclaimerTxt() {
					return disclaimerTxt;
				}

				public void setDisclaimerTxt(String disclaimerTxt) {
					this.disclaimerTxt = disclaimerTxt;
				}

				/**
				 * Obtiene el valor de la propiedad count.
				 * 
				 * @return possible object is {@link Byte }
				 * 
				 */
				public Byte getCount() {
					return count;
				}

				/**
				 * Define el valor de la propiedad count.
				 * 
				 * @param value
				 *            allowed object is {@link Byte }
				 * 
				 */
				public void setCount(Byte value) {
					this.count = value;
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
				 *         &lt;element name="OutboundOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="OutboundDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="OutboundJourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="OutboundArrivalDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="OutboundArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="OutboundPickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="OutboundPickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *       &lt;/sequence&gt;
				 *     &lt;/restriction&gt;
				 *   &lt;/complexContent&gt;
				 * &lt;/complexType&gt;
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "outboundOrigin", "outboundDestination", "outboundJourneyTime",
						"outboundArrivalDate", "outboundArrivalTime", "outboundPickupDate", "outboundPickupTime" })
				public static class OutboundTransferDetails {

					@XmlElement(name = "OutboundOrigin", required = true)
					protected String outboundOrigin;
					@XmlElement(name = "OutboundDestination", required = true)
					protected String outboundDestination;
					@XmlElement(name = "OutboundJourneyTime", required = true)
					protected String outboundJourneyTime;
					@XmlElement(name = "OutboundArrivalDate", required = true)
					protected String outboundArrivalDate;
					@XmlElement(name = "OutboundArrivalTime", required = true)
					protected String outboundArrivalTime;
					@XmlElement(name = "OutboundPickupDate", required = true)
					protected String outboundPickupDate;
					@XmlElement(name = "OutboundPickupTime", required = true)
					protected String outboundPickupTime;

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
					 * Obtiene el valor de la propiedad outboundJourneyTime.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getOutboundJourneyTime() {
						return outboundJourneyTime;
					}

					/**
					 * Define el valor de la propiedad outboundJourneyTime.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setOutboundJourneyTime(String value) {
						this.outboundJourneyTime = value;
					}

					/**
					 * Obtiene el valor de la propiedad outboundArrivalDate.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getOutboundArrivalDate() {
						return outboundArrivalDate;
					}

					/**
					 * Define el valor de la propiedad outboundArrivalDate.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setOutboundArrivalDate(String value) {
						this.outboundArrivalDate = value;
					}

					/**
					 * Obtiene el valor de la propiedad outboundArrivalTime.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getOutboundArrivalTime() {
						return outboundArrivalTime;
					}

					/**
					 * Define el valor de la propiedad outboundArrivalTime.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setOutboundArrivalTime(String value) {
						this.outboundArrivalTime = value;
					}

					/**
					 * Obtiene el valor de la propiedad outboundPickupDate.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getOutboundPickupDate() {
						return outboundPickupDate;
					}

					/**
					 * Define el valor de la propiedad outboundPickupDate.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setOutboundPickupDate(String value) {
						this.outboundPickupDate = value;
					}

					/**
					 * Obtiene el valor de la propiedad outboundPickupTime.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getOutboundPickupTime() {
						return outboundPickupTime;
					}

					/**
					 * Define el valor de la propiedad outboundPickupTime.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setOutboundPickupTime(String value) {
						this.outboundPickupTime = value;
					}

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
				 *         &lt;element name="ReturnOrigin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="ReturnDestination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="ReturnJourneyTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="ReturnDepartureDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="ReturnDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="ReturnPickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="ReturnPickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *       &lt;/sequence&gt;
				 *     &lt;/restriction&gt;
				 *   &lt;/complexContent&gt;
				 * &lt;/complexType&gt;
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "returnOrigin", "returnDestination", "returnJourneyTime",
						"returnDepartureDate", "returnDepartureTime", "returnPickupDate", "returnPickupTime" })
				public static class ReturnTransferDetails {

					@XmlElement(name = "ReturnOrigin", required = true)
					protected String returnOrigin;
					@XmlElement(name = "ReturnDestination", required = true)
					protected String returnDestination;
					@XmlElement(name = "ReturnJourneyTime", required = true)
					protected String returnJourneyTime;
					@XmlElement(name = "ReturnDepartureDate", required = true)
					protected String returnDepartureDate;
					@XmlElement(name = "ReturnDepartureTime", required = true)
					protected String returnDepartureTime;
					@XmlElement(name = "ReturnPickupDate", required = true)
					protected String returnPickupDate;
					@XmlElement(name = "ReturnPickupTime", required = true)
					protected String returnPickupTime;

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
					 * Obtiene el valor de la propiedad returnJourneyTime.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getReturnJourneyTime() {
						return returnJourneyTime;
					}

					/**
					 * Define el valor de la propiedad returnJourneyTime.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setReturnJourneyTime(String value) {
						this.returnJourneyTime = value;
					}

					/**
					 * Obtiene el valor de la propiedad returnDepartureDate.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getReturnDepartureDate() {
						return returnDepartureDate;
					}

					/**
					 * Define el valor de la propiedad returnDepartureDate.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setReturnDepartureDate(String value) {
						this.returnDepartureDate = value;
					}

					/**
					 * Obtiene el valor de la propiedad returnDepartureTime.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getReturnDepartureTime() {
						return returnDepartureTime;
					}

					/**
					 * Define el valor de la propiedad returnDepartureTime.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setReturnDepartureTime(String value) {
						this.returnDepartureTime = value;
					}

					/**
					 * Obtiene el valor de la propiedad returnPickupDate.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getReturnPickupDate() {
						return returnPickupDate;
					}

					/**
					 * Define el valor de la propiedad returnPickupDate.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setReturnPickupDate(String value) {
						this.returnPickupDate = value;
					}

					/**
					 * Obtiene el valor de la propiedad returnPickupTime.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getReturnPickupTime() {
						return returnPickupTime;
					}

					/**
					 * Define el valor de la propiedad returnPickupTime.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setReturnPickupTime(String value) {
						this.returnPickupTime = value;
					}

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
				 *         &lt;element name="VehicleID" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
				 *         &lt;element name="Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="VehicleCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
				 *         &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *         &lt;element name="MinCapacity" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *         &lt;element name="MaxCapacity" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *         &lt;element name="MinStops" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *         &lt;element name="MaxStops" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *         &lt;element name="NumberOfBags" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *         &lt;element name="NumberOfVehicles" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
				 *       &lt;/sequence&gt;
				 *     &lt;/restriction&gt;
				 *   &lt;/complexContent&gt;
				 * &lt;/complexType&gt;
				 * </pre>
				 * 
				 * 
				 */
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "vehicleID", "vehicle", "vehicleCode", "vehicleType", "minCapacity",
						"maxCapacity", "minStops", "maxStops", "numberOfBags", "numberOfVehicles" })
				public static class VehicleDetails {

					@XmlElement(name = "VehicleID")
					protected short vehicleID;
					@XmlElement(name = "Vehicle", required = true)
					protected String vehicle;
					@XmlElement(name = "VehicleCode", required = true)
					protected String vehicleCode;
					@XmlElement(name = "VehicleType")
					protected byte vehicleType;
					@XmlElement(name = "MinCapacity")
					protected byte minCapacity;
					@XmlElement(name = "MaxCapacity")
					protected byte maxCapacity;
					@XmlElement(name = "MinStops")
					protected byte minStops;
					@XmlElement(name = "MaxStops")
					protected byte maxStops;
					@XmlElement(name = "NumberOfBags")
					protected byte numberOfBags;
					@XmlElement(name = "NumberOfVehicles")
					protected byte numberOfVehicles;

					/**
					 * Obtiene el valor de la propiedad vehicleID.
					 * 
					 */
					public short getVehicleID() {
						return vehicleID;
					}

					/**
					 * Define el valor de la propiedad vehicleID.
					 * 
					 */
					public void setVehicleID(short value) {
						this.vehicleID = value;
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

					/**
					 * Obtiene el valor de la propiedad vehicleCode.
					 * 
					 * @return possible object is {@link String }
					 * 
					 */
					public String getVehicleCode() {
						return vehicleCode;
					}

					/**
					 * Define el valor de la propiedad vehicleCode.
					 * 
					 * @param value
					 *            allowed object is {@link String }
					 * 
					 */
					public void setVehicleCode(String value) {
						this.vehicleCode = value;
					}

					/**
					 * Obtiene el valor de la propiedad vehicleType.
					 * 
					 */
					public byte getVehicleType() {
						return vehicleType;
					}

					/**
					 * Define el valor de la propiedad vehicleType.
					 * 
					 */
					public void setVehicleType(byte value) {
						this.vehicleType = value;
					}

					/**
					 * Obtiene el valor de la propiedad minCapacity.
					 * 
					 */
					public byte getMinCapacity() {
						return minCapacity;
					}

					/**
					 * Define el valor de la propiedad minCapacity.
					 * 
					 */
					public void setMinCapacity(byte value) {
						this.minCapacity = value;
					}

					/**
					 * Obtiene el valor de la propiedad maxCapacity.
					 * 
					 */
					public byte getMaxCapacity() {
						return maxCapacity;
					}

					/**
					 * Define el valor de la propiedad maxCapacity.
					 * 
					 */
					public void setMaxCapacity(byte value) {
						this.maxCapacity = value;
					}

					/**
					 * Obtiene el valor de la propiedad minStops.
					 * 
					 */
					public byte getMinStops() {
						return minStops;
					}

					/**
					 * Define el valor de la propiedad minStops.
					 * 
					 */
					public void setMinStops(byte value) {
						this.minStops = value;
					}

					/**
					 * Obtiene el valor de la propiedad maxStops.
					 * 
					 */
					public byte getMaxStops() {
						return maxStops;
					}

					/**
					 * Define el valor de la propiedad maxStops.
					 * 
					 */
					public void setMaxStops(byte value) {
						this.maxStops = value;
					}

					/**
					 * Obtiene el valor de la propiedad numberOfBags.
					 * 
					 */
					public byte getNumberOfBags() {
						return numberOfBags;
					}

					/**
					 * Define el valor de la propiedad numberOfBags.
					 * 
					 */
					public void setNumberOfBags(byte value) {
						this.numberOfBags = value;
					}

					/**
					 * Obtiene el valor de la propiedad numberOfVehicles.
					 * 
					 */
					public byte getNumberOfVehicles() {
						return numberOfVehicles;
					}

					/**
					 * Define el valor de la propiedad numberOfVehicles.
					 * 
					 */
					public void setNumberOfVehicles(byte value) {
						this.numberOfVehicles = value;
					}

				}

			}

		}

	}

}
