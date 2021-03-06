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
 * <p>Java class for TradePaymentPenaltyTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradePaymentPenaltyTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasisDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}DateTimeType" minOccurs="0"/>
 *         &lt;element name="BasisPeriodMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}MeasureType" minOccurs="0"/>
 *         &lt;element name="BasisAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CalculationPercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}PercentType" minOccurs="0"/>
 *         &lt;element name="ActualPenaltyAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePaymentPenaltyTermsType", propOrder = {
    "basisDateTime",
    "basisPeriodMeasure",
    "basisAmount",
    "calculationPercent",
    "actualPenaltyAmount"
})
public class TradePaymentPenaltyTermsType {

    @XmlElement(name = "BasisDateTime")
    protected DateTimeType basisDateTime;
    @XmlElement(name = "BasisPeriodMeasure")
    protected MeasureType basisPeriodMeasure;
    @XmlElement(name = "BasisAmount")
    protected List<AmountType> basisAmount;
    @XmlElement(name = "CalculationPercent")
    protected PercentType calculationPercent;
    @XmlElement(name = "ActualPenaltyAmount")
    protected List<AmountType> actualPenaltyAmount;

    /**
     * Gets the value of the basisDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getBasisDateTime() {
        return basisDateTime;
    }

    /**
     * Sets the value of the basisDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setBasisDateTime(DateTimeType value) {
        this.basisDateTime = value;
    }

    /**
     * Gets the value of the basisPeriodMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getBasisPeriodMeasure() {
        return basisPeriodMeasure;
    }

    /**
     * Sets the value of the basisPeriodMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setBasisPeriodMeasure(MeasureType value) {
        this.basisPeriodMeasure = value;
    }

    /**
     * Gets the value of the basisAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basisAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasisAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getBasisAmount() {
        if (basisAmount == null) {
            basisAmount = new ArrayList<AmountType>();
        }
        return this.basisAmount;
    }

    /**
     * Gets the value of the calculationPercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getCalculationPercent() {
        return calculationPercent;
    }

    /**
     * Sets the value of the calculationPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setCalculationPercent(PercentType value) {
        this.calculationPercent = value;
    }

    /**
     * Gets the value of the actualPenaltyAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualPenaltyAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualPenaltyAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getActualPenaltyAmount() {
        if (actualPenaltyAmount == null) {
            actualPenaltyAmount = new ArrayList<AmountType>();
        }
        return this.actualPenaltyAmount;
    }

    public TradePaymentPenaltyTermsType withBasisDateTime(DateTimeType value) {
        setBasisDateTime(value);
        return this;
    }

    public TradePaymentPenaltyTermsType withBasisPeriodMeasure(MeasureType value) {
        setBasisPeriodMeasure(value);
        return this;
    }

    public TradePaymentPenaltyTermsType withBasisAmount(AmountType... values) {
        if (values!= null) {
            for (AmountType value: values) {
                getBasisAmount().add(value);
            }
        }
        return this;
    }

    public TradePaymentPenaltyTermsType withBasisAmount(Collection<AmountType> values) {
        if (values!= null) {
            getBasisAmount().addAll(values);
        }
        return this;
    }

    public TradePaymentPenaltyTermsType withCalculationPercent(PercentType value) {
        setCalculationPercent(value);
        return this;
    }

    public TradePaymentPenaltyTermsType withActualPenaltyAmount(AmountType... values) {
        if (values!= null) {
            for (AmountType value: values) {
                getActualPenaltyAmount().add(value);
            }
        }
        return this;
    }

    public TradePaymentPenaltyTermsType withActualPenaltyAmount(Collection<AmountType> values) {
        if (values!= null) {
            getActualPenaltyAmount().addAll(values);
        }
        return this;
    }

}
