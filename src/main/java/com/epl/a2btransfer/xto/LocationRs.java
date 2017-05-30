//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.05.26 a las 12:22:07 PM CEST 
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
 *                   &lt;element name="Locations"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Location" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                       &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
@XmlRootElement(name = "LocationRs")
public class LocationRs {

    @XmlElement(name = "TransferOnly", required = true)
    protected LocationRs.TransferOnly transferOnly;
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
     *     {@link LocationRs.TransferOnly }
     *     
     */
    public LocationRs.TransferOnly getTransferOnly() {
        return transferOnly;
    }

    /**
     * Define el valor de la propiedad transferOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationRs.TransferOnly }
     *     
     */
    public void setTransferOnly(LocationRs.TransferOnly value) {
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
     *         &lt;element name="Locations"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Location" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                             &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
        "locations"
    })
    public static class TransferOnly {

        @XmlElement(name = "Locations", required = true)
        protected LocationRs.TransferOnly.Locations locations;

        /**
         * Obtiene el valor de la propiedad locations.
         * 
         * @return
         *     possible object is
         *     {@link LocationRs.TransferOnly.Locations }
         *     
         */
        public LocationRs.TransferOnly.Locations getLocations() {
            return locations;
        }

        /**
         * Define el valor de la propiedad locations.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationRs.TransferOnly.Locations }
         *     
         */
        public void setLocations(LocationRs.TransferOnly.Locations value) {
            this.locations = value;
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
         *         &lt;element name="Location" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *                   &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
            "location"
        })
        public static class Locations {

            @XmlElement(name = "Location")
            protected List<LocationRs.TransferOnly.Locations.Location> location;

            /**
             * Gets the value of the location property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the location property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLocation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LocationRs.TransferOnly.Locations.Location }
             * 
             * 
             */
            public List<LocationRs.TransferOnly.Locations.Location> getLocation() {
                if (location == null) {
                    location = new ArrayList<LocationRs.TransferOnly.Locations.Location>();
                }
                return this.location;
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
             *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
             *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
                "code",
                "locationName",
                "locationType",
                "countryCode",
                "country",
                "latitude",
                "longitude"
            })
            public static class Location {

                @XmlElement(name = "Code", required = true)
                protected String code;
                @XmlElement(name = "LocationName", required = true)
                protected String locationName;
                @XmlElement(name = "LocationType", required = true)
                protected String locationType;
                @XmlElement(name = "CountryCode", required = true)
                protected String countryCode;
                @XmlElement(name = "Country", required = true)
                protected String country;
                @XmlElement(name = "Latitude")
                protected float latitude;
                @XmlElement(name = "Longitude")
                protected float longitude;

                /**
                 * Obtiene el valor de la propiedad code.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Define el valor de la propiedad code.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Obtiene el valor de la propiedad locationName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationName() {
                    return locationName;
                }

                /**
                 * Define el valor de la propiedad locationName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationName(String value) {
                    this.locationName = value;
                }

                /**
                 * Obtiene el valor de la propiedad locationType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationType() {
                    return locationType;
                }

                /**
                 * Define el valor de la propiedad locationType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationType(String value) {
                    this.locationType = value;
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
                 * Obtiene el valor de la propiedad country.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Define el valor de la propiedad country.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

                /**
                 * Obtiene el valor de la propiedad latitude.
                 * 
                 */
                public float getLatitude() {
                    return latitude;
                }

                /**
                 * Define el valor de la propiedad latitude.
                 * 
                 */
                public void setLatitude(float value) {
                    this.latitude = value;
                }

                /**
                 * Obtiene el valor de la propiedad longitude.
                 * 
                 */
                public float getLongitude() {
                    return longitude;
                }

                /**
                 * Define el valor de la propiedad longitude.
                 * 
                 */
                public void setLongitude(float value) {
                    this.longitude = value;
                }

            }

        }

    }

}
