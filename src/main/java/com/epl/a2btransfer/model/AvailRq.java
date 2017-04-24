//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.21 a las 07:24:04 PM CEST 
//


package com.epl.a2btransfer.model;

import java.lang.reflect.Field;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;


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
 *                   &lt;element name="Availability"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Request"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="DeparturePointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ArrivalPointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="RetDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="RetTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                       &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                       &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                       &lt;element name="Vehicletype" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                                       &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TTICode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="GIATA_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
public class AvailRq {

    @XmlElement(name = "TransferOnly", required = true)
    protected AvailRq.TransferOnly transferOnly;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Obtiene el valor de la propiedad transferOnly.
     * 
     * @return
     *     possible object is
     *     {@link AvailRq.TransferOnly }
     *     
     */
    public AvailRq.TransferOnly getTransferOnly() {
        return transferOnly;
    }

    /**
     * Define el valor de la propiedad transferOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailRq.TransferOnly }
     *     
     */
    public void setTransferOnly(AvailRq.TransferOnly value) {
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     *                   &lt;element name="Request"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="DeparturePointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ArrivalPointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="RetDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="RetTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *                             &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *                             &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *                             &lt;element name="Vehicletype" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *                             &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="TTICode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="GIATA_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "availability"
    })
    public static class TransferOnly {

        @XmlElement(name = "Availability", required = true)
        protected AvailRq.TransferOnly.Availability availability;

        /**
         * Obtiene el valor de la propiedad availability.
         * 
         * @return
         *     possible object is
         *     {@link AvailRq.TransferOnly.Availability }
         *     
         */
        public AvailRq.TransferOnly.Availability getAvailability() {
            return availability;
        }

        /**
         * Define el valor de la propiedad availability.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailRq.TransferOnly.Availability }
         *     
         */
        public void setAvailability(AvailRq.TransferOnly.Availability value) {
            this.availability = value;
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
         *         &lt;element name="Request"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="DeparturePointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ArrivalPointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="RetDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="RetTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
         *                   &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
         *                   &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
         *                   &lt;element name="Vehicletype" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
         *                   &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="TTICode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="GIATA_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "request"
        })
        public static class Availability {

            @XmlElement(name = "Request", required = true)
            protected AvailRq.TransferOnly.Availability.Request request;

            /**
             * Obtiene el valor de la propiedad request.
             * 
             * @return
             *     possible object is
             *     {@link AvailRq.TransferOnly.Availability.Request }
             *     
             */
            public AvailRq.TransferOnly.Availability.Request getRequest() {
                return request;
            }

            /**
             * Define el valor de la propiedad request.
             * 
             * @param value
             *     allowed object is
             *     {@link AvailRq.TransferOnly.Availability.Request }
             *     
             */
            public void setRequest(AvailRq.TransferOnly.Availability.Request value) {
                this.request = value;
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
             *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="DeparturePointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ArrivalPointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="SectorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="RetDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="RetTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
             *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
             *         &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
             *         &lt;element name="Vehicletype" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
             *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TTICode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="GIATA_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "username",
                "password",
                "lang",
                "departurePointCode",
                "arrivalPointCode",
                "sectorType",
                "arrDate",
                "arrTime",
                "retDate",
                "retTime",
                "adults",
                "children",
                "infants",
                "vehicletype",
                "latitude",
                "longitude",
                "ttiCode",
                "giataid"
            })
            public static class Request {

                @XmlElement(name = "Username", required = true)
                protected String username;
                @XmlElement(name = "Password", required = true)
                protected String password;
                @XmlElement(name = "Lang", required = true)
                protected String lang;
                @XmlElement(name = "DeparturePointCode", required = true)
                protected String departurePointCode;
                @XmlElement(name = "ArrivalPointCode", required = true)
                protected String arrivalPointCode;
                @XmlElement(name = "SectorType", required = true)
                protected String sectorType;
                @XmlElement(name = "ArrDate", required = true)
                protected String arrDate;
                @XmlElement(name = "ArrTime", required = true)
                protected String arrTime;
                @XmlElement(name = "RetDate", required = true)
                protected String retDate;
                @XmlElement(name = "RetTime", required = true)
                protected String retTime;
                @XmlElement(name = "Adults")
                protected byte adults;
                @XmlElement(name = "Children")
                protected byte children;
                @XmlElement(name = "Infants")
                protected byte infants;
                @XmlElement(name = "Vehicletype")
                protected byte vehicletype;
                @XmlElement(name = "Latitude", required = true)
                protected String latitude;
                @XmlElement(name = "Longitude", required = true)
                protected String longitude;
                @XmlElement(name = "TTICode", required = true)
                protected String ttiCode;
                @XmlElement(name = "GIATA_ID", required = true)
                protected String giataid;

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
                 * Obtiene el valor de la propiedad lang.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLang() {
                    return lang;
                }

                /**
                 * Define el valor de la propiedad lang.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLang(String value) {
                    this.lang = value;
                }

                /**
                 * Obtiene el valor de la propiedad departurePointCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDeparturePointCode() {
                    return departurePointCode;
                }

                /**
                 * Define el valor de la propiedad departurePointCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDeparturePointCode(String value) {
                    this.departurePointCode = value;
                }

                /**
                 * Obtiene el valor de la propiedad arrivalPointCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getArrivalPointCode() {
                    return arrivalPointCode;
                }

                /**
                 * Define el valor de la propiedad arrivalPointCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setArrivalPointCode(String value) {
                    this.arrivalPointCode = value;
                }

                /**
                 * Obtiene el valor de la propiedad sectorType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSectorType() {
                    return sectorType;
                }

                /**
                 * Define el valor de la propiedad sectorType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSectorType(String value) {
                    this.sectorType = value;
                }

                /**
                 * Obtiene el valor de la propiedad arrDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getArrDate() {
                    return arrDate;
                }

                /**
                 * Define el valor de la propiedad arrDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setArrDate(String value) {
                    this.arrDate = value;
                }

                /**
                 * Obtiene el valor de la propiedad arrTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getArrTime() {
                    return arrTime;
                }

                /**
                 * Define el valor de la propiedad arrTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setArrTime(String value) {
                    this.arrTime = value;
                }

                /**
                 * Obtiene el valor de la propiedad retDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRetDate() {
                    return retDate;
                }

                /**
                 * Define el valor de la propiedad retDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRetDate(String value) {
                    this.retDate = value;
                }

                /**
                 * Obtiene el valor de la propiedad retTime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRetTime() {
                    return retTime;
                }

                /**
                 * Define el valor de la propiedad retTime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRetTime(String value) {
                    this.retTime = value;
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
                 * Obtiene el valor de la propiedad vehicletype.
                 * 
                 */
                public byte getVehicletype() {
                    return vehicletype;
                }

                /**
                 * Define el valor de la propiedad vehicletype.
                 * 
                 */
                public void setVehicletype(byte value) {
                    this.vehicletype = value;
                }

                /**
                 * Obtiene el valor de la propiedad latitude.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLatitude() {
                    return latitude;
                }

                /**
                 * Define el valor de la propiedad latitude.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLatitude(String value) {
                    this.latitude = value;
                }

                /**
                 * Obtiene el valor de la propiedad longitude.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLongitude() {
                    return longitude;
                }

                /**
                 * Define el valor de la propiedad longitude.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLongitude(String value) {
                    this.longitude = value;
                }

                /**
                 * Obtiene el valor de la propiedad ttiCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTTICode() {
                    return ttiCode;
                }

                /**
                 * Define el valor de la propiedad ttiCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTTICode(String value) {
                    this.ttiCode = value;
                }

                /**
                 * Obtiene el valor de la propiedad giataid.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGIATAID() {
                    return giataid;
                }

                /**
                 * Define el valor de la propiedad giataid.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGIATAID(String value) {
                    this.giataid = value;
                }                                
            }

        }

    }

    public String toXML(){
    	XmlFriendlyReplacer xfr = new XmlFriendlyReplacer("$","_");  
    	XStream xstream = new XStream(new DomDriver("UTF-8",xfr));
    	xstream.alias("TCOML", this.getClass());    	
    	xstream.aliasField("TransferOnly",AvailRq.class,"transferOnly");
    	xstream.aliasField("Availability",TransferOnly.class,"availability");
    	xstream.aliasField("Request",TransferOnly.Availability.class,"request");    	
    	xstream.alias("Request", TransferOnly.Availability.Request.class);
    	for (Field f:TransferOnly.Availability.Request.class.getDeclaredFields()){
    		String newName = f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1);    		
    		xstream.aliasField(newName,TransferOnly.Availability.Request.class,f.getName());
    	}
    	xstream.useAttributeFor(AvailRq.class, "version");
    	xstream.aliasField("GIATA_ID", TransferOnly.Availability.Request.class, "giataid");
    	xstream.aliasField("TTICode", TransferOnly.Availability.Request.class, "ttiCode");
    	return xstream.toXML(this);    	
    }
}
