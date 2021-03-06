//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 06:18:31 PM CET 
//


package at.austriapro.mappings.ebinterface4p1.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}AddressIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Salutation" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Name"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Street"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}POBox" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Town"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}ZIP"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Country"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Phone" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Email" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Contact" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}AddressExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressIdentifiers",
    "salutation",
    "name",
    "street",
    "poBox",
    "town",
    "zip",
    "country",
    "phone",
    "email",
    "contact",
    "addressExtensions"
})
@XmlRootElement(name = "Address")
public class Address
    implements Serializable
{

    @XmlElement(name = "AddressIdentifier")
    protected List<AddressIdentifier> addressIdentifiers;
    @XmlElement(name = "Salutation")
    protected String salutation;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "POBox")
    protected String poBox;
    @XmlElement(name = "Town", required = true)
    protected String town;
    @XmlElement(name = "ZIP", required = true)
    protected String zip;
    @XmlElement(name = "Country", required = true)
    protected Country country;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "AddressExtension")
    protected List<String> addressExtensions;

    /**
     * Gets the value of the addressIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressIdentifier }
     * 
     * 
     */
    public List<AddressIdentifier> getAddressIdentifiers() {
        if (addressIdentifiers == null) {
            addressIdentifiers = new ArrayList<AddressIdentifier>();
        }
        return this.addressIdentifiers;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the poBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBox(String value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIP() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIP(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
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
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the addressExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddressExtensions() {
        if (addressExtensions == null) {
            addressExtensions = new ArrayList<String>();
        }
        return this.addressExtensions;
    }

    public Address withAddressIdentifiers(AddressIdentifier... values) {
        if (values!= null) {
            for (AddressIdentifier value: values) {
                getAddressIdentifiers().add(value);
            }
        }
        return this;
    }

    public Address withAddressIdentifiers(Collection<AddressIdentifier> values) {
        if (values!= null) {
            getAddressIdentifiers().addAll(values);
        }
        return this;
    }

    public Address withSalutation(String value) {
        setSalutation(value);
        return this;
    }

    public Address withName(String value) {
        setName(value);
        return this;
    }

    public Address withStreet(String value) {
        setStreet(value);
        return this;
    }

    public Address withPOBox(String value) {
        setPOBox(value);
        return this;
    }

    public Address withTown(String value) {
        setTown(value);
        return this;
    }

    public Address withZIP(String value) {
        setZIP(value);
        return this;
    }

    public Address withCountry(Country value) {
        setCountry(value);
        return this;
    }

    public Address withPhone(String value) {
        setPhone(value);
        return this;
    }

    public Address withEmail(String value) {
        setEmail(value);
        return this;
    }

    public Address withContact(String value) {
        setContact(value);
        return this;
    }

    public Address withAddressExtensions(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAddressExtensions().add(value);
            }
        }
        return this;
    }

    public Address withAddressExtensions(Collection<String> values) {
        if (values!= null) {
            getAddressExtensions().addAll(values);
        }
        return this;
    }

}
