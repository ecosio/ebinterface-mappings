//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 03:48:50 PM CET 
//


package at.austriapro.mappings.ebinterface4p2.generated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}InvoiceNumber"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}InvoiceDate"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}CancelledOriginalDocument" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}RelatedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}Delivery" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}Biller"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}InvoiceRecipient"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}OrderingParty" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}Details"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}ReductionAndSurchargeDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}Tax"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}TotalGrossAmount"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}PayableAmount"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}PaymentMethod" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}PaymentConditions" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}PresentationDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}Comment" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/extensions/ext}InvoiceRootExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p2/}GeneratingSystem use="required""/>
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p2/}DocumentType use="required""/>
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p2/}InvoiceCurrency use="required""/>
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p2/}ManualProcessing"/>
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p2/}DocumentTitle"/>
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p2/}Language"/>
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p2/}IsDuplicate"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceType", propOrder = {
    "signature",
    "invoiceNumber",
    "invoiceDate",
    "cancelledOriginalDocument",
    "relatedDocuments",
    "delivery",
    "biller",
    "invoiceRecipient",
    "orderingParty",
    "details",
    "reductionAndSurchargeDetails",
    "tax",
    "totalGrossAmount",
    "payableAmount",
    "paymentMethod",
    "paymentConditions",
    "presentationDetails",
    "comment",
    "invoiceRootExtension"
})
@XmlRootElement(name = "Invoice")
public class Invoice
    implements Serializable
{

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected Signature signature;
    @XmlElement(name = "InvoiceNumber", required = true)
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected DateTime invoiceDate;
    @XmlElement(name = "CancelledOriginalDocument")
    protected CancelledOriginalDocument cancelledOriginalDocument;
    @XmlElement(name = "RelatedDocument")
    protected List<RelatedDocument> relatedDocuments;
    @XmlElement(name = "Delivery")
    protected Delivery delivery;
    @XmlElement(name = "Biller", required = true)
    protected Biller biller;
    @XmlElement(name = "InvoiceRecipient", required = true)
    protected InvoiceRecipient invoiceRecipient;
    @XmlElement(name = "OrderingParty")
    protected OrderingParty orderingParty;
    @XmlElement(name = "Details", required = true)
    protected Details details;
    @XmlElement(name = "ReductionAndSurchargeDetails")
    protected ReductionAndSurchargeDetails reductionAndSurchargeDetails;
    @XmlElement(name = "Tax", required = true)
    protected Tax tax;
    @XmlElement(name = "TotalGrossAmount", required = true)
    protected BigDecimal totalGrossAmount;
    @XmlElement(name = "PayableAmount", required = true)
    protected BigDecimal payableAmount;
    @XmlElement(name = "PaymentMethod")
    protected PaymentMethod paymentMethod;
    @XmlElement(name = "PaymentConditions")
    protected PaymentConditions paymentConditions;
    @XmlElement(name = "PresentationDetails")
    protected PresentationDetails presentationDetails;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "InvoiceRootExtension", namespace = "http://www.ebinterface.at/schema/4p2/extensions/ext")
    protected InvoiceRootExtension invoiceRootExtension;
    @XmlAttribute(name = "GeneratingSystem", namespace = "http://www.ebinterface.at/schema/4p2/", required = true)
    protected String generatingSystem;
    @XmlAttribute(name = "DocumentType", namespace = "http://www.ebinterface.at/schema/4p2/", required = true)
    protected DocumentTypeType documentType;
    @XmlAttribute(name = "InvoiceCurrency", namespace = "http://www.ebinterface.at/schema/4p2/", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String invoiceCurrency;
    @XmlAttribute(name = "ManualProcessing", namespace = "http://www.ebinterface.at/schema/4p2/")
    protected Boolean manualProcessing;
    @XmlAttribute(name = "DocumentTitle", namespace = "http://www.ebinterface.at/schema/4p2/")
    protected String documentTitle;
    @XmlAttribute(name = "Language", namespace = "http://www.ebinterface.at/schema/4p2/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "IsDuplicate", namespace = "http://www.ebinterface.at/schema/4p2/")
    protected Boolean isDuplicate;

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setSignature(Signature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(DateTime value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the cancelledOriginalDocument property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledOriginalDocument }
     *     
     */
    public CancelledOriginalDocument getCancelledOriginalDocument() {
        return cancelledOriginalDocument;
    }

    /**
     * Sets the value of the cancelledOriginalDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledOriginalDocument }
     *     
     */
    public void setCancelledOriginalDocument(CancelledOriginalDocument value) {
        this.cancelledOriginalDocument = value;
    }

    /**
     * Gets the value of the relatedDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedDocument }
     * 
     * 
     */
    public List<RelatedDocument> getRelatedDocuments() {
        if (relatedDocuments == null) {
            relatedDocuments = new ArrayList<RelatedDocument>();
        }
        return this.relatedDocuments;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link Delivery }
     *     
     */
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery }
     *     
     */
    public void setDelivery(Delivery value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the biller property.
     * 
     * @return
     *     possible object is
     *     {@link Biller }
     *     
     */
    public Biller getBiller() {
        return biller;
    }

    /**
     * Sets the value of the biller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Biller }
     *     
     */
    public void setBiller(Biller value) {
        this.biller = value;
    }

    /**
     * Gets the value of the invoiceRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceRecipient }
     *     
     */
    public InvoiceRecipient getInvoiceRecipient() {
        return invoiceRecipient;
    }

    /**
     * Sets the value of the invoiceRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceRecipient }
     *     
     */
    public void setInvoiceRecipient(InvoiceRecipient value) {
        this.invoiceRecipient = value;
    }

    /**
     * Gets the value of the orderingParty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderingParty }
     *     
     */
    public OrderingParty getOrderingParty() {
        return orderingParty;
    }

    /**
     * Sets the value of the orderingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderingParty }
     *     
     */
    public void setOrderingParty(OrderingParty value) {
        this.orderingParty = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link Details }
     *     
     */
    public Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link Details }
     *     
     */
    public void setDetails(Details value) {
        this.details = value;
    }

    /**
     * Gets the value of the reductionAndSurchargeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReductionAndSurchargeDetails }
     *     
     */
    public ReductionAndSurchargeDetails getReductionAndSurchargeDetails() {
        return reductionAndSurchargeDetails;
    }

    /**
     * Sets the value of the reductionAndSurchargeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReductionAndSurchargeDetails }
     *     
     */
    public void setReductionAndSurchargeDetails(ReductionAndSurchargeDetails value) {
        this.reductionAndSurchargeDetails = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Tax }
     *     
     */
    public Tax getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax }
     *     
     */
    public void setTax(Tax value) {
        this.tax = value;
    }

    /**
     * Gets the value of the totalGrossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGrossAmount() {
        return totalGrossAmount;
    }

    /**
     * Sets the value of the totalGrossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGrossAmount(BigDecimal value) {
        this.totalGrossAmount = value;
    }

    /**
     * Gets the value of the payableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    /**
     * Sets the value of the payableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayableAmount(BigDecimal value) {
        this.payableAmount = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentConditions property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentConditions }
     *     
     */
    public PaymentConditions getPaymentConditions() {
        return paymentConditions;
    }

    /**
     * Sets the value of the paymentConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentConditions }
     *     
     */
    public void setPaymentConditions(PaymentConditions value) {
        this.paymentConditions = value;
    }

    /**
     * Gets the value of the presentationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationDetails }
     *     
     */
    public PresentationDetails getPresentationDetails() {
        return presentationDetails;
    }

    /**
     * Sets the value of the presentationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationDetails }
     *     
     */
    public void setPresentationDetails(PresentationDetails value) {
        this.presentationDetails = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the invoiceRootExtension property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceRootExtension }
     *     
     */
    public InvoiceRootExtension getInvoiceRootExtension() {
        return invoiceRootExtension;
    }

    /**
     * Sets the value of the invoiceRootExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceRootExtension }
     *     
     */
    public void setInvoiceRootExtension(InvoiceRootExtension value) {
        this.invoiceRootExtension = value;
    }

    /**
     * Gets the value of the generatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratingSystem() {
        return generatingSystem;
    }

    /**
     * Sets the value of the generatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratingSystem(String value) {
        this.generatingSystem = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeType }
     *     
     */
    public DocumentTypeType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeType }
     *     
     */
    public void setDocumentType(DocumentTypeType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the invoiceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceCurrency() {
        return invoiceCurrency;
    }

    /**
     * Sets the value of the invoiceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceCurrency(String value) {
        this.invoiceCurrency = value;
    }

    /**
     * Gets the value of the manualProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getManualProcessing() {
        return manualProcessing;
    }

    /**
     * Sets the value of the manualProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualProcessing(Boolean value) {
        this.manualProcessing = value;
    }

    /**
     * Gets the value of the documentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTitle() {
        return documentTitle;
    }

    /**
     * Sets the value of the documentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTitle(String value) {
        this.documentTitle = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the isDuplicate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsDuplicate() {
        return isDuplicate;
    }

    /**
     * Sets the value of the isDuplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDuplicate(Boolean value) {
        this.isDuplicate = value;
    }

    public Invoice withSignature(Signature value) {
        setSignature(value);
        return this;
    }

    public Invoice withInvoiceNumber(String value) {
        setInvoiceNumber(value);
        return this;
    }

    public Invoice withInvoiceDate(DateTime value) {
        setInvoiceDate(value);
        return this;
    }

    public Invoice withCancelledOriginalDocument(CancelledOriginalDocument value) {
        setCancelledOriginalDocument(value);
        return this;
    }

    public Invoice withRelatedDocuments(RelatedDocument... values) {
        if (values!= null) {
            for (RelatedDocument value: values) {
                getRelatedDocuments().add(value);
            }
        }
        return this;
    }

    public Invoice withRelatedDocuments(Collection<RelatedDocument> values) {
        if (values!= null) {
            getRelatedDocuments().addAll(values);
        }
        return this;
    }

    public Invoice withDelivery(Delivery value) {
        setDelivery(value);
        return this;
    }

    public Invoice withBiller(Biller value) {
        setBiller(value);
        return this;
    }

    public Invoice withInvoiceRecipient(InvoiceRecipient value) {
        setInvoiceRecipient(value);
        return this;
    }

    public Invoice withOrderingParty(OrderingParty value) {
        setOrderingParty(value);
        return this;
    }

    public Invoice withDetails(Details value) {
        setDetails(value);
        return this;
    }

    public Invoice withReductionAndSurchargeDetails(ReductionAndSurchargeDetails value) {
        setReductionAndSurchargeDetails(value);
        return this;
    }

    public Invoice withTax(Tax value) {
        setTax(value);
        return this;
    }

    public Invoice withTotalGrossAmount(BigDecimal value) {
        setTotalGrossAmount(value);
        return this;
    }

    public Invoice withPayableAmount(BigDecimal value) {
        setPayableAmount(value);
        return this;
    }

    public Invoice withPaymentMethod(PaymentMethod value) {
        setPaymentMethod(value);
        return this;
    }

    public Invoice withPaymentConditions(PaymentConditions value) {
        setPaymentConditions(value);
        return this;
    }

    public Invoice withPresentationDetails(PresentationDetails value) {
        setPresentationDetails(value);
        return this;
    }

    public Invoice withComment(String value) {
        setComment(value);
        return this;
    }

    public Invoice withInvoiceRootExtension(InvoiceRootExtension value) {
        setInvoiceRootExtension(value);
        return this;
    }

    public Invoice withGeneratingSystem(String value) {
        setGeneratingSystem(value);
        return this;
    }

    public Invoice withDocumentType(DocumentTypeType value) {
        setDocumentType(value);
        return this;
    }

    public Invoice withInvoiceCurrency(String value) {
        setInvoiceCurrency(value);
        return this;
    }

    public Invoice withManualProcessing(Boolean value) {
        setManualProcessing(value);
        return this;
    }

    public Invoice withDocumentTitle(String value) {
        setDocumentTitle(value);
        return this;
    }

    public Invoice withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public Invoice withIsDuplicate(Boolean value) {
        setIsDuplicate(value);
        return this;
    }

}
