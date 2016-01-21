//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 03:48:50 PM CET 
//


package at.austriapro.mappings.ebinterface4p2.generated;

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
 * <p>Java class for TaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}VAT"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}OtherTax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/extensions/ext}TaxExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "vat",
    "otherTaxes",
    "taxExtension"
})
@XmlRootElement(name = "Tax")
public class Tax
    implements Serializable
{

    @XmlElement(name = "VAT", required = true)
    protected VAT vat;
    @XmlElement(name = "OtherTax")
    protected List<OtherTax> otherTaxes;
    @XmlElement(name = "TaxExtension", namespace = "http://www.ebinterface.at/schema/4p2/extensions/ext")
    protected TaxExtension taxExtension;

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link VAT }
     *     
     */
    public VAT getVAT() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VAT }
     *     
     */
    public void setVAT(VAT value) {
        this.vat = value;
    }

    /**
     * Gets the value of the otherTaxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherTaxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherTax }
     * 
     * 
     */
    public List<OtherTax> getOtherTaxes() {
        if (otherTaxes == null) {
            otherTaxes = new ArrayList<OtherTax>();
        }
        return this.otherTaxes;
    }

    /**
     * Gets the value of the taxExtension property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExtension }
     *     
     */
    public TaxExtension getTaxExtension() {
        return taxExtension;
    }

    /**
     * Sets the value of the taxExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExtension }
     *     
     */
    public void setTaxExtension(TaxExtension value) {
        this.taxExtension = value;
    }

    public Tax withVAT(VAT value) {
        setVAT(value);
        return this;
    }

    public Tax withOtherTaxes(OtherTax... values) {
        if (values!= null) {
            for (OtherTax value: values) {
                getOtherTaxes().add(value);
            }
        }
        return this;
    }

    public Tax withOtherTaxes(Collection<OtherTax> values) {
        if (values!= null) {
            getOtherTaxes().addAll(values);
        }
        return this;
    }

    public Tax withTaxExtension(TaxExtension value) {
        setTaxExtension(value);
        return this;
    }

}
