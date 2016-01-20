//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 03:48:50 PM CET 
//


package at.austriapro.mappings.ebinterface4p2.generated;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebinterface.at/schema/4p2/}AbstractPartyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}InvoiceRecipientsBillerID" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/extensions/ext}BillerExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillerType", propOrder = {
    "invoiceRecipientsBillerID",
    "billerExtension"
})
@XmlRootElement(name = "Biller")
public class Biller
    extends AbstractPartyType
    implements Serializable
{

    @XmlElement(name = "InvoiceRecipientsBillerID")
    protected String invoiceRecipientsBillerID;
    @XmlElement(name = "BillerExtension", namespace = "http://www.ebinterface.at/schema/4p2/extensions/ext")
    protected BillerExtension billerExtension;

    /**
     * Gets the value of the invoiceRecipientsBillerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceRecipientsBillerID() {
        return invoiceRecipientsBillerID;
    }

    /**
     * Sets the value of the invoiceRecipientsBillerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceRecipientsBillerID(String value) {
        this.invoiceRecipientsBillerID = value;
    }

    /**
     * Gets the value of the billerExtension property.
     * 
     * @return
     *     possible object is
     *     {@link BillerExtension }
     *     
     */
    public BillerExtension getBillerExtension() {
        return billerExtension;
    }

    /**
     * Sets the value of the billerExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerExtension }
     *     
     */
    public void setBillerExtension(BillerExtension value) {
        this.billerExtension = value;
    }

    public Biller withInvoiceRecipientsBillerID(String value) {
        setInvoiceRecipientsBillerID(value);
        return this;
    }

    public Biller withBillerExtension(BillerExtension value) {
        setBillerExtension(value);
        return this;
    }

    @Override
    public Biller withVATIdentificationNumber(String value) {
        setVATIdentificationNumber(value);
        return this;
    }

    @Override
    public Biller withFurtherIdentifications(FurtherIdentification... values) {
        if (values!= null) {
            for (FurtherIdentification value: values) {
                getFurtherIdentifications().add(value);
            }
        }
        return this;
    }

    @Override
    public Biller withFurtherIdentifications(Collection<FurtherIdentification> values) {
        if (values!= null) {
            getFurtherIdentifications().addAll(values);
        }
        return this;
    }

    @Override
    public Biller withOrderReference(OrderReferenceType value) {
        setOrderReference(value);
        return this;
    }

    @Override
    public Biller withAddress(Address value) {
        setAddress(value);
        return this;
    }

}
