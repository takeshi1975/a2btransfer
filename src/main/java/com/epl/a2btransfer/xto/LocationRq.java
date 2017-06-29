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
 *                   &lt;element name="CacheLocations"&gt;
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
public class LocationRq {

    @XmlElement(name = "TransferOnly", required = true)
    protected LocationRq.TransferOnly transferOnly;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Obtiene el valor de la propiedad transferOnly.
     * 
     * @return
     *     possible object is
     *     {@link LocationRq.TransferOnly }
     *     
     */
    public LocationRq.TransferOnly getTransferOnly() {
        return transferOnly;
    }

    /**
     * Define el valor de la propiedad transferOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationRq.TransferOnly }
     *     
     */
    public void setTransferOnly(LocationRq.TransferOnly value) {
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
     *         &lt;element name="CacheLocations"&gt;
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
        "cacheLocations"
    })
    public static class TransferOnly {

        @XmlElement(name = "CacheLocations", required = true)
        protected LocationRq.TransferOnly.CacheLocations cacheLocations;

        /**
         * Obtiene el valor de la propiedad cacheLocations.
         * 
         * @return
         *     possible object is
         *     {@link LocationRq.TransferOnly.CacheLocations }
         *     
         */
        public LocationRq.TransferOnly.CacheLocations getCacheLocations() {
            return cacheLocations;
        }

        /**
         * Define el valor de la propiedad cacheLocations.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationRq.TransferOnly.CacheLocations }
         *     
         */
        public void setCacheLocations(LocationRq.TransferOnly.CacheLocations value) {
            this.cacheLocations = value;
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
        public static class CacheLocations {

            @XmlElement(name = "Request", required = true)
            protected LocationRq.TransferOnly.CacheLocations.Request request;

            /**
             * Obtiene el valor de la propiedad request.
             * 
             * @return
             *     possible object is
             *     {@link LocationRq.TransferOnly.CacheLocations.Request }
             *     
             */
            public LocationRq.TransferOnly.CacheLocations.Request getRequest() {
                return request;
            }

            /**
             * Define el valor de la propiedad request.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationRq.TransferOnly.CacheLocations.Request }
             *     
             */
            public void setRequest(LocationRq.TransferOnly.CacheLocations.Request value) {
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
                "lang"
            })
            public static class Request {

                @XmlElement(name = "Username", required = true)
                protected String username;
                @XmlElement(name = "Password", required = true)
                protected String password;
                @XmlElement(name = "Lang", required = true)
                protected String lang;

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

            }

        }

    }

}
