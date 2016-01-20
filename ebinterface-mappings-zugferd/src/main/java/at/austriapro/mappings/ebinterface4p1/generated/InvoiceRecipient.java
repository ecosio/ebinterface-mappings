//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 06:18:31 PM CET 
//


package at.austriapro.mappings.ebinterface4p1.generated;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceRecipientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceRecipientType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebinterface.at/schema/4p1/}AbstractPartyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}BillersInvoiceRecipientID" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}AccountingArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}SubOrganizationID" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/extensions/ext}InvoiceRecipientExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceRecipientType", propOrder = {
    "billersInvoiceRecipientID",
    "accountingArea",
    "subOrganizationID",
    "invoiceRecipientExtension"
})
@XmlRootElement(name = "InvoiceRecipient")
public class InvoiceRecipient
    extends AbstractPartyType
    implements Serializable
{

    @XmlElement(name = "BillersInvoiceRecipientID")
    protected String billersInvoiceRecipientID;
    @XmlElement(name = "AccountingArea")
    protected String accountingArea;
    @XmlElement(name = "SubOrganizationID")
    protected String subOrganizationID;
    @XmlElement(name = "InvoiceRecipientExtension", namespace = "http://www.ebinterface.at/schema/4p1/extensions/ext")
    protected InvoiceRecipientExtension invoiceRecipientExtension;

    /**
     * Gets the value of the billersInvoiceRecipientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillersInvoiceRecipientID() {
        return billersInvoiceRecipientID;
    }

    /**
     * Sets the value of the billersInvoiceRecipientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillersInvoiceRecipientID(String value) {
        this.billersInvoiceRecipientID = value;
    }

    /**
     * Gets the value of the accountingArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingArea() {
        return accountingArea;
    }

    /**
     * Sets the value of the accountingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingArea(String value) {
        this.accountingArea = value;
    }

    /**
     * Gets the value of the subOrganizationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubOrganizationID() {
        return subOrganizationID;
    }

    /**
     * Sets the value of the subOrganizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubOrganizationID(String value) {
        this.subOrganizationID = value;
    }

    /**
     * Gets the value of the invoiceRecipientExtension property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceRecipientExtension }
     *     
     */
    public InvoiceRecipientExtension getInvoiceRecipientExtension() {
        return invoiceRecipientExtension;
    }

    /**
     * Sets the value of the invoiceRecipientExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceRecipientExtension }
     *     
     */
    public void setInvoiceRecipientExtension(InvoiceRecipientExtension value) {
        this.invoiceRecipientExtension = value;
    }

    public InvoiceRecipient withBillersInvoiceRecipientID(String value) {
        setBillersInvoiceRecipientID(value);
        return this;
    }

    public InvoiceRecipient withAccountingArea(String value) {
        setAccountingArea(value);
        return this;
    }

    public InvoiceRecipient withSubOrganizationID(String value) {
        setSubOrganizationID(value);
        return this;
    }

    public InvoiceRecipient withInvoiceRecipientExtension(InvoiceRecipientExtension value) {
        setInvoiceRecipientExtension(value);
        return this;
    }

    @Override
    public InvoiceRecipient withVATIdentificationNumber(String value) {
        setVATIdentificationNumber(value);
        return this;
    }

    @Override
    public InvoiceRecipient withFurtherIdentifications(FurtherIdentification... values) {
        if (values!= null) {
            for (FurtherIdentification value: values) {
                getFurtherIdentifications().add(value);
            }
        }
        return this;
    }

    @Override
    public InvoiceRecipient withFurtherIdentifications(Collection<FurtherIdentification> values) {
        if (values!= null) {
            getFurtherIdentifications().addAll(values);
        }
        return this;
    }

    @Override
    public InvoiceRecipient withOrderReference(OrderReferenceType value) {
        setOrderReference(value);
        return this;
    }

    @Override
    public InvoiceRecipient withAddress(Address value) {
        setAddress(value);
        return this;
    }

}
