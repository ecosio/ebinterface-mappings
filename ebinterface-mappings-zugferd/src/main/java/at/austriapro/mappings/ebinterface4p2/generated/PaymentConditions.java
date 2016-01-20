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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>Java class for PaymentConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentConditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}DueDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}Discount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}MinimumPayment" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}Comment" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/extensions/ext}PaymentConditionsExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentConditionsType", propOrder = {
    "dueDate",
    "discounts",
    "minimumPayment",
    "comment",
    "paymentConditionsExtension"
})
@XmlRootElement(name = "PaymentConditions")
public class PaymentConditions
    implements Serializable
{

    @XmlElement(name = "DueDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected DateTime dueDate;
    @XmlElement(name = "Discount")
    protected List<Discount> discounts;
    @XmlElement(name = "MinimumPayment")
    protected BigDecimal minimumPayment;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "PaymentConditionsExtension", namespace = "http://www.ebinterface.at/schema/4p2/extensions/ext")
    protected PaymentConditionsExtension paymentConditionsExtension;

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(DateTime value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the discounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discount }
     * 
     * 
     */
    public List<Discount> getDiscounts() {
        if (discounts == null) {
            discounts = new ArrayList<Discount>();
        }
        return this.discounts;
    }

    /**
     * Gets the value of the minimumPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPayment() {
        return minimumPayment;
    }

    /**
     * Sets the value of the minimumPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPayment(BigDecimal value) {
        this.minimumPayment = value;
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
     * Gets the value of the paymentConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentConditionsExtension }
     *     
     */
    public PaymentConditionsExtension getPaymentConditionsExtension() {
        return paymentConditionsExtension;
    }

    /**
     * Sets the value of the paymentConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentConditionsExtension }
     *     
     */
    public void setPaymentConditionsExtension(PaymentConditionsExtension value) {
        this.paymentConditionsExtension = value;
    }

    public PaymentConditions withDueDate(DateTime value) {
        setDueDate(value);
        return this;
    }

    public PaymentConditions withDiscounts(Discount... values) {
        if (values!= null) {
            for (Discount value: values) {
                getDiscounts().add(value);
            }
        }
        return this;
    }

    public PaymentConditions withDiscounts(Collection<Discount> values) {
        if (values!= null) {
            getDiscounts().addAll(values);
        }
        return this;
    }

    public PaymentConditions withMinimumPayment(BigDecimal value) {
        setMinimumPayment(value);
        return this;
    }

    public PaymentConditions withComment(String value) {
        setComment(value);
        return this;
    }

    public PaymentConditions withPaymentConditionsExtension(PaymentConditionsExtension value) {
        setPaymentConditionsExtension(value);
        return this;
    }

}
