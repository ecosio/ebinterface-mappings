//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 03:48:50 PM CET 
//


package at.austriapro.mappings.ebinterface4p2.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.joda.time.DateTime;


/**
 * <p>Java class for OrderReferenceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderReferenceDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebinterface.at/schema/4p2/}OrderReferenceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p2/}OrderPositionNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReferenceDetailType", propOrder = {
    "orderPositionNumber"
})
public class OrderReferenceDetailType
    extends OrderReferenceType
    implements Serializable
{

    @XmlElement(name = "OrderPositionNumber")
    protected String orderPositionNumber;

    /**
     * Gets the value of the orderPositionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPositionNumber() {
        return orderPositionNumber;
    }

    /**
     * Sets the value of the orderPositionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPositionNumber(String value) {
        this.orderPositionNumber = value;
    }

    public OrderReferenceDetailType withOrderPositionNumber(String value) {
        setOrderPositionNumber(value);
        return this;
    }

    @Override
    public OrderReferenceDetailType withOrderID(String value) {
        setOrderID(value);
        return this;
    }

    @Override
    public OrderReferenceDetailType withReferenceDate(DateTime value) {
        setReferenceDate(value);
        return this;
    }

    @Override
    public OrderReferenceDetailType withDescription(String value) {
        setDescription(value);
        return this;
    }

}
