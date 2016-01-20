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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniversalBankTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniversalBankTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}BeneficiaryAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}PaymentReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p2/}ConsolidatorPayable"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniversalBankTransactionType", propOrder = {
    "beneficiaryAccounts",
    "paymentReference"
})
@XmlRootElement(name = "UniversalBankTransaction")
public class UniversalBankTransaction
    implements Serializable
{

    @XmlElement(name = "BeneficiaryAccount")
    protected List<BeneficiaryAccount> beneficiaryAccounts;
    @XmlElement(name = "PaymentReference")
    protected PaymentReference paymentReference;
    @XmlAttribute(name = "ConsolidatorPayable", namespace = "http://www.ebinterface.at/schema/4p2/")
    protected Boolean consolidatorPayable;

    /**
     * Gets the value of the beneficiaryAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiaryAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiaryAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiaryAccount }
     * 
     * 
     */
    public List<BeneficiaryAccount> getBeneficiaryAccounts() {
        if (beneficiaryAccounts == null) {
            beneficiaryAccounts = new ArrayList<BeneficiaryAccount>();
        }
        return this.beneficiaryAccounts;
    }

    /**
     * Gets the value of the paymentReference property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReference }
     *     
     */
    public PaymentReference getPaymentReference() {
        return paymentReference;
    }

    /**
     * Sets the value of the paymentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReference }
     *     
     */
    public void setPaymentReference(PaymentReference value) {
        this.paymentReference = value;
    }

    /**
     * Gets the value of the consolidatorPayable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getConsolidatorPayable() {
        return consolidatorPayable;
    }

    /**
     * Sets the value of the consolidatorPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidatorPayable(Boolean value) {
        this.consolidatorPayable = value;
    }

    public UniversalBankTransaction withBeneficiaryAccounts(BeneficiaryAccount... values) {
        if (values!= null) {
            for (BeneficiaryAccount value: values) {
                getBeneficiaryAccounts().add(value);
            }
        }
        return this;
    }

    public UniversalBankTransaction withBeneficiaryAccounts(Collection<BeneficiaryAccount> values) {
        if (values!= null) {
            getBeneficiaryAccounts().addAll(values);
        }
        return this;
    }

    public UniversalBankTransaction withPaymentReference(PaymentReference value) {
        setPaymentReference(value);
        return this;
    }

    public UniversalBankTransaction withConsolidatorPayable(Boolean value) {
        setConsolidatorPayable(value);
        return this;
    }

}
