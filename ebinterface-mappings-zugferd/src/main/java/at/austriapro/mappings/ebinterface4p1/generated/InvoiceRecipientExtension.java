//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 06:18:31 PM CET 
//


package at.austriapro.mappings.ebinterface4p1.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceRecipientExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceRecipientExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/extensions/sv}InvoiceRecipientExtension" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/extensions/ext}Custom" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceRecipientExtensionType", namespace = "http://www.ebinterface.at/schema/4p1/extensions/ext", propOrder = {
    "invoiceRecipientExtension",
    "custom"
})
@XmlRootElement(name = "InvoiceRecipientExtension", namespace = "http://www.ebinterface.at/schema/4p1/extensions/ext")
public class InvoiceRecipientExtension
    implements Serializable
{

    @XmlElement(name = "InvoiceRecipientExtension", namespace = "http://www.ebinterface.at/schema/4p1/extensions/sv")
    protected InvoiceRecipientExtension_sv invoiceRecipientExtension;
    @XmlElement(name = "Custom")
    protected Custom custom;

    /**
     * Gets the value of the invoiceRecipientExtension property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceRecipientExtension_sv }
     *     
     */
    public InvoiceRecipientExtension_sv getInvoiceRecipientExtension() {
        return invoiceRecipientExtension;
    }

    /**
     * Sets the value of the invoiceRecipientExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceRecipientExtension_sv }
     *     
     */
    public void setInvoiceRecipientExtension(InvoiceRecipientExtension_sv value) {
        this.invoiceRecipientExtension = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link Custom }
     *     
     */
    public Custom getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom }
     *     
     */
    public void setCustom(Custom value) {
        this.custom = value;
    }

    public InvoiceRecipientExtension withInvoiceRecipientExtension(InvoiceRecipientExtension_sv value) {
        setInvoiceRecipientExtension(value);
        return this;
    }

    public InvoiceRecipientExtension withCustom(Custom value) {
        setCustom(value);
        return this;
    }

}