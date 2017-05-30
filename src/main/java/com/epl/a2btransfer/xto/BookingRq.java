//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.21 a las 07:24:06 PM CEST 
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
 *                             &lt;element name="Confirm"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TransacNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="AgentBref" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="AccommodationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="AccommodationAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="DepPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="RetPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="DepInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="RetInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="DepExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="RetExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                                       &lt;element name="SendEmailToCustomer" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                       &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ChaseID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sess" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
public class BookingRq {

    @XmlElement(name = "TransferOnly", required = true)
    protected BookingRq.TransferOnly transferOnly;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "sess")
    protected String sess;

    /**
     * Obtiene el valor de la propiedad transferOnly.
     * 
     * @return
     *     possible object is
     *     {@link BookingRq.TransferOnly }
     *     
     */
    public BookingRq.TransferOnly getTransferOnly() {
        return transferOnly;
    }

    /**
     * Define el valor de la propiedad transferOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingRq.TransferOnly }
     *     
     */
    public void setTransferOnly(BookingRq.TransferOnly value) {
        this.transferOnly = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad sess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSess() {
        return sess;
    }

    /**
     * Define el valor de la propiedad sess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSess(String value) {
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
     *                   &lt;element name="Confirm"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TransacNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="AgentBref" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="AccommodationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="AccommodationAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="DepPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="RetPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="DepInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="RetInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="DepExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="RetExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                             &lt;element name="SendEmailToCustomer" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *                             &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ChaseID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        protected BookingRq.TransferOnly.Booking booking;

        /**
         * Obtiene el valor de la propiedad booking.
         * 
         * @return
         *     possible object is
         *     {@link BookingRq.TransferOnly.Booking }
         *     
         */
        public BookingRq.TransferOnly.Booking getBooking() {
            return booking;
        }

        /**
         * Define el valor de la propiedad booking.
         * 
         * @param value
         *     allowed object is
         *     {@link BookingRq.TransferOnly.Booking }
         *     
         */
        public void setBooking(BookingRq.TransferOnly.Booking value) {
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
         *         &lt;element name="Confirm"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TransacNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="AgentBref" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="AccommodationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="AccommodationAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="DepPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="RetPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="DepInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="RetInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="DepExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="RetExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *                   &lt;element name="SendEmailToCustomer" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
         *                   &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ChaseID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "confirm"
        })
        public static class Booking {

            @XmlElement(name = "Confirm", required = true)
            protected BookingRq.TransferOnly.Booking.Confirm confirm;

            /**
             * Obtiene el valor de la propiedad confirm.
             * 
             * @return
             *     possible object is
             *     {@link BookingRq.TransferOnly.Booking.Confirm }
             *     
             */
            public BookingRq.TransferOnly.Booking.Confirm getConfirm() {
                return confirm;
            }

            /**
             * Define el valor de la propiedad confirm.
             * 
             * @param value
             *     allowed object is
             *     {@link BookingRq.TransferOnly.Booking.Confirm }
             *     
             */
            public void setConfirm(BookingRq.TransferOnly.Booking.Confirm value) {
                this.confirm = value;
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
             *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="AgentBref" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="AccommodationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="AccommodationAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="DepPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="RetPoint" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="DepInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="RetInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="DepExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="RetExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
             *         &lt;element name="SendEmailToCustomer" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
             *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ChaseID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "username",
                "password",
                "agentBref",
                "propertyName",
                "accommodationAddress",
                "accommodationAddress2",
                "depPoint",
                "retPoint",
                "depInfo",
                "retInfo",
                "depExtraInfo",
                "retExtraInfo",
                "client",
                "sendEmailToCustomer",
                "remark",
                "chaseID"
            })
            public static class Confirm {

                @XmlElement(name = "TransacNo")
                protected int transacNo;
                @XmlElement(name = "Username", required = true)
                protected String username;
                @XmlElement(name = "Password", required = true)
                protected String password;
                @XmlElement(name = "AgentBref", required = true)
                protected String agentBref;
                @XmlElement(name = "PropertyName", required = true)
                protected String propertyName;
                @XmlElement(name = "AccommodationAddress", required = true)
                protected String accommodationAddress;
                @XmlElement(name = "AccommodationAddress2", required = true)
                protected String accommodationAddress2;
                @XmlElement(name = "DepPoint", required = true)
                protected String depPoint;
                @XmlElement(name = "RetPoint", required = true)
                protected String retPoint;
                @XmlElement(name = "DepInfo", required = true)
                protected String depInfo;
                @XmlElement(name = "RetInfo", required = true)
                protected String retInfo;
                @XmlElement(name = "DepExtraInfo", required = true)
                protected String depExtraInfo;
                @XmlElement(name = "RetExtraInfo", required = true)
                protected String retExtraInfo;
                @XmlElement(name = "Client", required = true)
                protected BookingRq.TransferOnly.Booking.Confirm.Client client;
                @XmlElement(name = "SendEmailToCustomer")
                protected byte sendEmailToCustomer;
                @XmlElement(name = "Remark", required = true)
                protected String remark;
                @XmlElement(name = "ChaseID", required = true)
                protected String chaseID;

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
                 * Obtiene el valor de la propiedad username.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUsername() {
                    return username;
                }

                /**
                 * Define el valor de la propiedad username.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUsername(String value) {
                    this.username = value;
                }

                /**
                 * Obtiene el valor de la propiedad password.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassword() {
                    return password;
                }

                /**
                 * Define el valor de la propiedad password.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassword(String value) {
                    this.password = value;
                }

                /**
                 * Obtiene el valor de la propiedad agentBref.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgentBref() {
                    return agentBref;
                }

                /**
                 * Define el valor de la propiedad agentBref.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgentBref(String value) {
                    this.agentBref = value;
                }

                /**
                 * Obtiene el valor de la propiedad propertyName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPropertyName() {
                    return propertyName;
                }

                /**
                 * Define el valor de la propiedad propertyName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPropertyName(String value) {
                    this.propertyName = value;
                }

                /**
                 * Obtiene el valor de la propiedad accommodationAddress.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccommodationAddress() {
                    return accommodationAddress;
                }

                /**
                 * Define el valor de la propiedad accommodationAddress.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccommodationAddress(String value) {
                    this.accommodationAddress = value;
                }

                /**
                 * Obtiene el valor de la propiedad accommodationAddress2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccommodationAddress2() {
                    return accommodationAddress2;
                }

                /**
                 * Define el valor de la propiedad accommodationAddress2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccommodationAddress2(String value) {
                    this.accommodationAddress2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad depPoint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDepPoint() {
                    return depPoint;
                }

                /**
                 * Define el valor de la propiedad depPoint.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDepPoint(String value) {
                    this.depPoint = value;
                }

                /**
                 * Obtiene el valor de la propiedad retPoint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRetPoint() {
                    return retPoint;
                }

                /**
                 * Define el valor de la propiedad retPoint.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRetPoint(String value) {
                    this.retPoint = value;
                }

                /**
                 * Obtiene el valor de la propiedad depInfo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDepInfo() {
                    return depInfo;
                }

                /**
                 * Define el valor de la propiedad depInfo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDepInfo(String value) {
                    this.depInfo = value;
                }

                /**
                 * Obtiene el valor de la propiedad retInfo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRetInfo() {
                    return retInfo;
                }

                /**
                 * Define el valor de la propiedad retInfo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRetInfo(String value) {
                    this.retInfo = value;
                }

                /**
                 * Obtiene el valor de la propiedad depExtraInfo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDepExtraInfo() {
                    return depExtraInfo;
                }

                /**
                 * Define el valor de la propiedad depExtraInfo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDepExtraInfo(String value) {
                    this.depExtraInfo = value;
                }

                /**
                 * Obtiene el valor de la propiedad retExtraInfo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRetExtraInfo() {
                    return retExtraInfo;
                }

                /**
                 * Define el valor de la propiedad retExtraInfo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRetExtraInfo(String value) {
                    this.retExtraInfo = value;
                }

                /**
                 * Obtiene el valor de la propiedad client.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BookingRq.TransferOnly.Booking.Confirm.Client }
                 *     
                 */
                public BookingRq.TransferOnly.Booking.Confirm.Client getClient() {
                    return client;
                }

                /**
                 * Define el valor de la propiedad client.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BookingRq.TransferOnly.Booking.Confirm.Client }
                 *     
                 */
                public void setClient(BookingRq.TransferOnly.Booking.Confirm.Client value) {
                    this.client = value;
                }

                /**
                 * Obtiene el valor de la propiedad sendEmailToCustomer.
                 * 
                 */
                public byte getSendEmailToCustomer() {
                    return sendEmailToCustomer;
                }

                /**
                 * Define el valor de la propiedad sendEmailToCustomer.
                 * 
                 */
                public void setSendEmailToCustomer(byte value) {
                    this.sendEmailToCustomer = value;
                }

                /**
                 * Obtiene el valor de la propiedad remark.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRemark() {
                    return remark;
                }

                /**
                 * Define el valor de la propiedad remark.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRemark(String value) {
                    this.remark = value;
                }

                /**
                 * Obtiene el valor de la propiedad chaseID.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChaseID() {
                    return chaseID;
                }

                /**
                 * Define el valor de la propiedad chaseID.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChaseID(String value) {
                    this.chaseID = value;
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
                @XmlType(name = "", propOrder = {
                    "lastName",
                    "firstName",
                    "title",
                    "phone",
                    "mobile",
                    "countryCode",
                    "email"
                })
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLastName() {
                        return lastName;
                    }

                    /**
                     * Define el valor de la propiedad lastName.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLastName(String value) {
                        this.lastName = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad firstName.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFirstName() {
                        return firstName;
                    }

                    /**
                     * Define el valor de la propiedad firstName.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFirstName(String value) {
                        this.firstName = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad title.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTitle() {
                        return title;
                    }

                    /**
                     * Define el valor de la propiedad title.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Define el valor de la propiedad countryCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountryCode(String value) {
                        this.countryCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad email.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmail() {
                        return email;
                    }

                    /**
                     * Define el valor de la propiedad email.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmail(String value) {
                        this.email = value;
                    }

                }

            }

        }

    }

}
