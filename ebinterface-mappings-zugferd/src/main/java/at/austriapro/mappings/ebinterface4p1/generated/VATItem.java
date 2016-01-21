//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 06:18:31 PM CET 
//


package at.austriapro.mappings.ebinterface4p1.generated;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VATItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VATItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}TaxedAmount"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.ebinterface.at/schema/4p1/}TaxExemption"/>
 *           &lt;element ref="{http://www.ebinterface.at/schema/4p1/}VATRate"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Amount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VATItemType", propOrder = {
    "taxedAmount",
    "vatRate",
    "taxExemption",
    "amount"
})
@XmlRootElement(name = "VATItem")
public class VATItem
    implements Serializable
{

    @XmlElement(name = "TaxedAmount", required = true)
    protected BigDecimal taxedAmount;
    @XmlElement(name = "VATRate")
    protected VATRate vatRate;
    @XmlElement(name = "TaxExemption")
    protected TaxExemption taxExemption;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;

    /**
     * Gets the value of the taxedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxedAmount() {
        return taxedAmount;
    }

    /**
     * Sets the value of the taxedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxedAmount(BigDecimal value) {
        this.taxedAmount = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link VATRate }
     *     
     */
    public VATRate getVATRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VATRate }
     *     
     */
    public void setVATRate(VATRate value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemption }
     *     
     */
    public TaxExemption getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemption }
     *     
     */
    public void setTaxExemption(TaxExemption value) {
        this.taxExemption = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    public VATItem withTaxedAmount(BigDecimal value) {
        setTaxedAmount(value);
        return this;
    }

    public VATItem withVATRate(VATRate value) {
        setVATRate(value);
        return this;
    }

    public VATItem withTaxExemption(TaxExemption value) {
        setTaxExemption(value);
        return this;
    }

    public VATItem withAmount(BigDecimal value) {
        setAmount(value);
        return this;
    }

}
