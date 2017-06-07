//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.05.26 a las 12:22:07 PM CEST 
//


package com.epl.a2btransfer.xto;

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
@XmlType( propOrder = {
    "transferOnly"
})
@XmlRootElement(name = "TCOML")
public class CancelFeeRs {

    @XmlElement(name = "TransferOnly", required = true)
    protected CancelFeeRs.TransferOnly transferOnly;
    @XmlAttribute(name = "version")
    protected Float version;

    /**
     * Obtiene el valor de la propiedad transferOnly.
     * 
     * @return
     *     possible object is
     *     {@link CancelFeeRs.TransferOnly }
     *     
     */
    public CancelFeeRs.TransferOnly getTransferOnly() {
        return transferOnly;
    }

    /**
     * Define el valor de la propiedad transferOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelFeeRs.TransferOnly }
     *     
     */
    public void setTransferOnly(CancelFeeRs.TransferOnly value) {
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
        protected CancelFeeRs.TransferOnly.Booking booking;

        /**
         * Obtiene el valor de la propiedad booking.
         * 
         * @return
         *     possible object is
         *     {@link CancelFeeRs.TransferOnly.Booking }
         *     
         */
        public CancelFeeRs.TransferOnly.Booking getBooking() {
            return booking;
        }

        /**
         * Define el valor de la propiedad booking.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelFeeRs.TransferOnly.Booking }
         *     
         */
        public void setBooking(CancelFeeRs.TransferOnly.Booking value) {
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
            "cancelFees"
        })
        public static class Booking {

            @XmlElement(name = "BookingRef", required = true)
            protected String bookingRef;
            @XmlElement(name = "CancelFees")
            protected float cancelFees;

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

        }

    }

}
