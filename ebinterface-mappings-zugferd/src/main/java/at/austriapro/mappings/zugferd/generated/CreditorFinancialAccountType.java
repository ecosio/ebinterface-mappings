//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 03:17:09 PM CET 
//


package at.austriapro.mappings.zugferd.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditorFinancialAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorFinancialAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IBANID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}IDType" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}TextType" minOccurs="0"/>
 *         &lt;element name="ProprietaryID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}IDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorFinancialAccountType", propOrder = {
    "ibanid",
    "accountName",
    "proprietaryID"
})
public class CreditorFinancialAccountType {

    @XmlElement(name = "IBANID")
    protected IDType ibanid;
    @XmlElement(name = "AccountName")
    protected TextType accountName;
    @XmlElement(name = "ProprietaryID")
    protected IDType proprietaryID;

    /**
     * Gets the value of the ibanid property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getIBANID() {
        return ibanid;
    }

    /**
     * Sets the value of the ibanid property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setIBANID(IDType value) {
        this.ibanid = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAccountName(TextType value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the proprietaryID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getProprietaryID() {
        return proprietaryID;
    }

    /**
     * Sets the value of the proprietaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setProprietaryID(IDType value) {
        this.proprietaryID = value;
    }

    public CreditorFinancialAccountType withIBANID(IDType value) {
        setIBANID(value);
        return this;
    }

    public CreditorFinancialAccountType withAccountName(TextType value) {
        setAccountName(value);
        return this;
    }

    public CreditorFinancialAccountType withProprietaryID(IDType value) {
        setProprietaryID(value);
        return this;
    }

}
