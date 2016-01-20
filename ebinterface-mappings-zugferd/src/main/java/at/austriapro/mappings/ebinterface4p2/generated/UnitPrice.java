//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 03:48:50 PM CET 
//


package at.austriapro.mappings.ebinterface4p2.generated;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for UnitPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitPriceType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ebinterface.at/schema/4p2/>Decimal4Type">
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p2/}BaseQuantity"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitPriceType", propOrder = {
    "value"
})
@XmlRootElement(name = "UnitPrice")
public class UnitPrice
    implements Serializable
{

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "BaseQuantity", namespace = "http://www.ebinterface.at/schema/4p2/")
    protected BigDecimal baseQuantity;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the baseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseQuantity() {
        return baseQuantity;
    }

    /**
     * Sets the value of the baseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseQuantity(BigDecimal value) {
        this.baseQuantity = value;
    }

    public UnitPrice withValue(BigDecimal value) {
        setValue(value);
        return this;
    }

    public UnitPrice withBaseQuantity(BigDecimal value) {
        setBaseQuantity(value);
        return this;
    }

}
