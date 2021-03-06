//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 03:17:09 PM CET 
//


package at.austriapro.mappings.zugferd.generated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeSettlementPaymentMeansType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeSettlementPaymentMeansType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:12}PaymentMeansCodeType" minOccurs="0"/>
 *         &lt;element name="Information" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PayerPartyDebtorFinancialAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}DebtorFinancialAccountType" minOccurs="0"/>
 *         &lt;element name="PayeePartyCreditorFinancialAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}CreditorFinancialAccountType" minOccurs="0"/>
 *         &lt;element name="PayerSpecifiedDebtorFinancialInstitution" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}DebtorFinancialInstitutionType" minOccurs="0"/>
 *         &lt;element name="PayeeSpecifiedCreditorFinancialInstitution" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}CreditorFinancialInstitutionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSettlementPaymentMeansType", propOrder = {
    "typeCode",
    "information",
    "id",
    "payerPartyDebtorFinancialAccount",
    "payeePartyCreditorFinancialAccount",
    "payerSpecifiedDebtorFinancialInstitution",
    "payeeSpecifiedCreditorFinancialInstitution"
})
public class TradeSettlementPaymentMeansType {

    @XmlElement(name = "TypeCode")
    protected PaymentMeansCodeType typeCode;
    @XmlElement(name = "Information")
    protected List<TextType> information;
    @XmlElement(name = "ID")
    protected List<IDType> id;
    @XmlElement(name = "PayerPartyDebtorFinancialAccount")
    protected DebtorFinancialAccountType payerPartyDebtorFinancialAccount;
    @XmlElement(name = "PayeePartyCreditorFinancialAccount")
    protected CreditorFinancialAccountType payeePartyCreditorFinancialAccount;
    @XmlElement(name = "PayerSpecifiedDebtorFinancialInstitution")
    protected DebtorFinancialInstitutionType payerSpecifiedDebtorFinancialInstitution;
    @XmlElement(name = "PayeeSpecifiedCreditorFinancialInstitution")
    protected CreditorFinancialInstitutionType payeeSpecifiedCreditorFinancialInstitution;

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeansCodeType }
     *     
     */
    public PaymentMeansCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeansCodeType }
     *     
     */
    public void setTypeCode(PaymentMeansCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getInformation() {
        if (information == null) {
            information = new ArrayList<TextType>();
        }
        return this.information;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getID() {
        if (id == null) {
            id = new ArrayList<IDType>();
        }
        return this.id;
    }

    /**
     * Gets the value of the payerPartyDebtorFinancialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorFinancialAccountType }
     *     
     */
    public DebtorFinancialAccountType getPayerPartyDebtorFinancialAccount() {
        return payerPartyDebtorFinancialAccount;
    }

    /**
     * Sets the value of the payerPartyDebtorFinancialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorFinancialAccountType }
     *     
     */
    public void setPayerPartyDebtorFinancialAccount(DebtorFinancialAccountType value) {
        this.payerPartyDebtorFinancialAccount = value;
    }

    /**
     * Gets the value of the payeePartyCreditorFinancialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorFinancialAccountType }
     *     
     */
    public CreditorFinancialAccountType getPayeePartyCreditorFinancialAccount() {
        return payeePartyCreditorFinancialAccount;
    }

    /**
     * Sets the value of the payeePartyCreditorFinancialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorFinancialAccountType }
     *     
     */
    public void setPayeePartyCreditorFinancialAccount(CreditorFinancialAccountType value) {
        this.payeePartyCreditorFinancialAccount = value;
    }

    /**
     * Gets the value of the payerSpecifiedDebtorFinancialInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorFinancialInstitutionType }
     *     
     */
    public DebtorFinancialInstitutionType getPayerSpecifiedDebtorFinancialInstitution() {
        return payerSpecifiedDebtorFinancialInstitution;
    }

    /**
     * Sets the value of the payerSpecifiedDebtorFinancialInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorFinancialInstitutionType }
     *     
     */
    public void setPayerSpecifiedDebtorFinancialInstitution(DebtorFinancialInstitutionType value) {
        this.payerSpecifiedDebtorFinancialInstitution = value;
    }

    /**
     * Gets the value of the payeeSpecifiedCreditorFinancialInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorFinancialInstitutionType }
     *     
     */
    public CreditorFinancialInstitutionType getPayeeSpecifiedCreditorFinancialInstitution() {
        return payeeSpecifiedCreditorFinancialInstitution;
    }

    /**
     * Sets the value of the payeeSpecifiedCreditorFinancialInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorFinancialInstitutionType }
     *     
     */
    public void setPayeeSpecifiedCreditorFinancialInstitution(CreditorFinancialInstitutionType value) {
        this.payeeSpecifiedCreditorFinancialInstitution = value;
    }

    public TradeSettlementPaymentMeansType withTypeCode(PaymentMeansCodeType value) {
        setTypeCode(value);
        return this;
    }

    public TradeSettlementPaymentMeansType withInformation(TextType... values) {
        if (values!= null) {
            for (TextType value: values) {
                getInformation().add(value);
            }
        }
        return this;
    }

    public TradeSettlementPaymentMeansType withInformation(Collection<TextType> values) {
        if (values!= null) {
            getInformation().addAll(values);
        }
        return this;
    }

    public TradeSettlementPaymentMeansType withID(IDType... values) {
        if (values!= null) {
            for (IDType value: values) {
                getID().add(value);
            }
        }
        return this;
    }

    public TradeSettlementPaymentMeansType withID(Collection<IDType> values) {
        if (values!= null) {
            getID().addAll(values);
        }
        return this;
    }

    public TradeSettlementPaymentMeansType withPayerPartyDebtorFinancialAccount(DebtorFinancialAccountType value) {
        setPayerPartyDebtorFinancialAccount(value);
        return this;
    }

    public TradeSettlementPaymentMeansType withPayeePartyCreditorFinancialAccount(CreditorFinancialAccountType value) {
        setPayeePartyCreditorFinancialAccount(value);
        return this;
    }

    public TradeSettlementPaymentMeansType withPayerSpecifiedDebtorFinancialInstitution(DebtorFinancialInstitutionType value) {
        setPayerSpecifiedDebtorFinancialInstitution(value);
        return this;
    }

    public TradeSettlementPaymentMeansType withPayeeSpecifiedCreditorFinancialInstitution(CreditorFinancialInstitutionType value) {
        setPayeeSpecifiedCreditorFinancialInstitution(value);
        return this;
    }

}
