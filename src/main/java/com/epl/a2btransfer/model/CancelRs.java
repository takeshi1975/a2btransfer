//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.21 a las 07:24:09 PM CEST 
//


package com.epl.a2btransfer.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *                             &lt;element name="BookingRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CancelFees" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = {
    "transferOnly"
})
@XmlRootElement(name = "TCOML")
public class CancelRs {

    @XmlElement(name = "TransferOnly", required = true)
    protected CancelRs.TransferOnly transferOnly;
    @XmlAttribute(name = "version")
    protected Float version;
    @XmlAttribute(name = "company")
    protected String company;
    @XmlAttribute(name = "sess")
    protected BigInteger sess;

    /**
     * Obtiene el valor de la propiedad transferOnly.
     * 
     * @return
     *     possible object is
     *     {@link CancelRs.TransferOnly }
     *     
     */
    public CancelRs.TransferOnly getTransferOnly() {
        return transferOnly;
    }

    /**
     * Define el valor de la propiedad transferOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelRs.TransferOnly }
     *     
     */
    public void setTransferOnly(CancelRs.TransferOnly value) {
        this.transferOnly = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVersion(Float value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Define el valor de la propiedad company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Obtiene el valor de la propiedad sess.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSess() {
        return sess;
    }

    /**
     * Define el valor de la propiedad sess.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSess(BigInteger value) {
        this.sess = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     *                   &lt;element name="BookingRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CancelFees" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                   &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    @XmlType(name = "", propOrder = {
        "booking"
    })
    public static class TransferOnly {

        @XmlElement(name = "Booking", required = true)
        protected CancelRs.TransferOnly.Booking booking;

        /**
         * Obtiene el valor de la propiedad booking.
         * 
         * @return
         *     possible object is
         *     {@link CancelRs.TransferOnly.Booking }
         *     
         */
        public CancelRs.TransferOnly.Booking getBooking() {
            return booking;
        }

        /**
         * Define el valor de la propiedad booking.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelRs.TransferOnly.Booking }
         *     
         */
        public void setBooking(CancelRs.TransferOnly.Booking value) {
            this.booking = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="BookingRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CancelFees" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *         &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bookingRef",
            "cancelFees",
            "bookingStatus"
        })
        public static class Booking {

            @XmlElement(name = "BookingRef", required = true)
            protected String bookingRef;
            @XmlElement(name = "CancelFees")
            protected float cancelFees;
            @XmlElement(name = "BookingStatus", required = true)
            protected String bookingStatus;

            /**
             * Obtiene el valor de la propiedad bookingRef.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookingRef() {
                return bookingRef;
            }

            /**
             * Define el valor de la propiedad bookingRef.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookingRef(String value) {
                this.bookingRef = value;
            }

            /**
             * Obtiene el valor de la propiedad cancelFees.
             * 
             */
            public float getCancelFees() {
                return cancelFees;
            }

            /**
             * Define el valor de la propiedad cancelFees.
             * 
             */
            public void setCancelFees(float value) {
                this.cancelFees = value;
            }

            /**
             * Obtiene el valor de la propiedad bookingStatus.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookingStatus() {
                return bookingStatus;
            }

            /**
             * Define el valor de la propiedad bookingStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookingStatus(String value) {
                this.bookingStatus = value;
            }

        }

    }

}
