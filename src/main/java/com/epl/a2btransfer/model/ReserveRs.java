//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.21 a las 07:24:11 PM CEST 
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
 *                             &lt;element name="Reserve"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TransacNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="HolidayValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                       &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
public class ReserveRs {

    @XmlElement(name = "TransferOnly", required = true)
    protected ReserveRs.TransferOnly transferOnly;
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
     *     {@link ReserveRs.TransferOnly }
     *     
     */
    public ReserveRs.TransferOnly getTransferOnly() {
        return transferOnly;
    }

    /**
     * Define el valor de la propiedad transferOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link ReserveRs.TransferOnly }
     *     
     */
    public void setTransferOnly(ReserveRs.TransferOnly value) {
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
     *                   &lt;element name="Reserve"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TransacNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="HolidayValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    @XmlType(name = "", propOrder = {
        "booking"
    })
    public static class TransferOnly {

        @XmlElement(name = "Booking", required = true)
        protected ReserveRs.TransferOnly.Booking booking;

        /**
         * Obtiene el valor de la propiedad booking.
         * 
         * @return
         *     possible object is
         *     {@link ReserveRs.TransferOnly.Booking }
         *     
         */
        public ReserveRs.TransferOnly.Booking getBooking() {
            return booking;
        }

        /**
         * Define el valor de la propiedad booking.
         * 
         * @param value
         *     allowed object is
         *     {@link ReserveRs.TransferOnly.Booking }
         *     
         */
        public void setBooking(ReserveRs.TransferOnly.Booking value) {
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
         *         &lt;element name="Reserve"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TransacNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="HolidayValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "reserve"
        })
        public static class Booking {

            @XmlElement(name = "Reserve", required = true)
            protected ReserveRs.TransferOnly.Booking.Reserve reserve;

            /**
             * Obtiene el valor de la propiedad reserve.
             * 
             * @return
             *     possible object is
             *     {@link ReserveRs.TransferOnly.Booking.Reserve }
             *     
             */
            public ReserveRs.TransferOnly.Booking.Reserve getReserve() {
                return reserve;
            }

            /**
             * Define el valor de la propiedad reserve.
             * 
             * @param value
             *     allowed object is
             *     {@link ReserveRs.TransferOnly.Booking.Reserve }
             *     
             */
            public void setReserve(ReserveRs.TransferOnly.Booking.Reserve value) {
                this.reserve = value;
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
             *         &lt;element name="TransacNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="HolidayValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
             *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "transacNo",
                "holidayValue",
                "currencyCode"
            })
            public static class Reserve {

                @XmlElement(name = "TransacNo")
                protected int transacNo;
                @XmlElement(name = "HolidayValue")
                protected float holidayValue;
                @XmlElement(name = "CurrencyCode", required = true)
                protected String currencyCode;

                /**
                 * Obtiene el valor de la propiedad transacNo.
                 * 
                 */
                public int getTransacNo() {
                    return transacNo;
                }

                /**
                 * Define el valor de la propiedad transacNo.
                 * 
                 */
                public void setTransacNo(int value) {
                    this.transacNo = value;
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
                 * Obtiene el valor de la propiedad currencyCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * Define el valor de la propiedad currencyCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

            }

        }

    }

}
