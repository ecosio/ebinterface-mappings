//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.20 at 05:47:04 PM CET 
//


package at.austriapro.mappings.ebinterface4p3.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReductionAndSurchargeDetailsExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReductionAndSurchargeDetailsExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p3/extensions/sv}ReductionAndSurchargeDetailsExtension" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p3/extensions/ext}Custom" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReductionAndSurchargeDetailsExtensionType", namespace = "http://www.ebinterface.at/schema/4p3/extensions/ext", propOrder = {
    "reductionAndSurchargeDetailsExtension",
    "custom"
})
@XmlRootElement(name = "ReductionAndSurchargeDetailsExtension", namespace = "http://www.ebinterface.at/schema/4p3/extensions/ext")
public class ReductionAndSurchargeDetailsExtension
    implements Serializable
{

    @XmlElement(name = "ReductionAndSurchargeDetailsExtension", namespace = "http://www.ebinterface.at/schema/4p3/extensions/sv")
    protected ReductionAndSurchargeDetailsExtension_sv reductionAndSurchargeDetailsExtension;
    @XmlElement(name = "Custom")
    protected Custom custom;

    /**
     * Gets the value of the reductionAndSurchargeDetailsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ReductionAndSurchargeDetailsExtension_sv }
     *     
     */
    public ReductionAndSurchargeDetailsExtension_sv getReductionAndSurchargeDetailsExtension() {
        return reductionAndSurchargeDetailsExtension;
    }

    /**
     * Sets the value of the reductionAndSurchargeDetailsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReductionAndSurchargeDetailsExtension_sv }
     *     
     */
    public void setReductionAndSurchargeDetailsExtension(ReductionAndSurchargeDetailsExtension_sv value) {
        this.reductionAndSurchargeDetailsExtension = value;
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

    public ReductionAndSurchargeDetailsExtension withReductionAndSurchargeDetailsExtension(ReductionAndSurchargeDetailsExtension_sv value) {
        setReductionAndSurchargeDetailsExtension(value);
        return this;
    }

    public ReductionAndSurchargeDetailsExtension withCustom(Custom value) {
        setCustom(value);
        return this;
    }

}
