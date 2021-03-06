//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 06:18:31 PM CET 
//


package at.austriapro.mappings.ebinterface4p1.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReductionAndSurchargeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReductionAndSurchargeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Reduction" minOccurs="0"/>
 *           &lt;element ref="{http://www.ebinterface.at/schema/4p1/}Surcharge" minOccurs="0"/>
 *           &lt;element ref="{http://www.ebinterface.at/schema/4p1/}OtherVATableTax" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/extensions/ext}ReductionAndSurchargeDetailsExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReductionAndSurchargeDetailsType", propOrder = {
    "reductionsAndSurchargesAndOtherVATableTaxes",
    "reductionAndSurchargeDetailsExtension"
})
@XmlRootElement(name = "ReductionAndSurchargeDetails")
public class ReductionAndSurchargeDetails
    implements Serializable
{

    @XmlElementRefs({
        @XmlElementRef(name = "Reduction", namespace = "http://www.ebinterface.at/schema/4p1/", type = JAXBElement.class),
        @XmlElementRef(name = "OtherVATableTax", namespace = "http://www.ebinterface.at/schema/4p1/", type = OtherVATableTax.class),
        @XmlElementRef(name = "Surcharge", namespace = "http://www.ebinterface.at/schema/4p1/", type = JAXBElement.class)
    })
    protected List<Serializable> reductionsAndSurchargesAndOtherVATableTaxes;
    @XmlElement(name = "ReductionAndSurchargeDetailsExtension", namespace = "http://www.ebinterface.at/schema/4p1/extensions/ext")
    protected ReductionAndSurchargeDetailsExtension reductionAndSurchargeDetailsExtension;

    /**
     * Gets the value of the reductionsAndSurchargesAndOtherVATableTaxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reductionsAndSurchargesAndOtherVATableTaxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReductionsAndSurchargesAndOtherVATableTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ReductionAndSurchargeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReductionAndSurchargeType }{@code >}
     * {@link OtherVATableTax }
     * 
     * 
     */
    public List<Serializable> getReductionsAndSurchargesAndOtherVATableTaxes() {
        if (reductionsAndSurchargesAndOtherVATableTaxes == null) {
            reductionsAndSurchargesAndOtherVATableTaxes = new ArrayList<Serializable>();
        }
        return this.reductionsAndSurchargesAndOtherVATableTaxes;
    }

    /**
     * Gets the value of the reductionAndSurchargeDetailsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ReductionAndSurchargeDetailsExtension }
     *     
     */
    public ReductionAndSurchargeDetailsExtension getReductionAndSurchargeDetailsExtension() {
        return reductionAndSurchargeDetailsExtension;
    }

    /**
     * Sets the value of the reductionAndSurchargeDetailsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReductionAndSurchargeDetailsExtension }
     *     
     */
    public void setReductionAndSurchargeDetailsExtension(ReductionAndSurchargeDetailsExtension value) {
        this.reductionAndSurchargeDetailsExtension = value;
    }

    public ReductionAndSurchargeDetails withReductionsAndSurchargesAndOtherVATableTaxes(Serializable... values) {
        if (values!= null) {
            for (Serializable value: values) {
                getReductionsAndSurchargesAndOtherVATableTaxes().add(value);
            }
        }
        return this;
    }

    public ReductionAndSurchargeDetails withReductionsAndSurchargesAndOtherVATableTaxes(Collection<Serializable> values) {
        if (values!= null) {
            getReductionsAndSurchargesAndOtherVATableTaxes().addAll(values);
        }
        return this;
    }

    public ReductionAndSurchargeDetails withReductionAndSurchargeDetailsExtension(ReductionAndSurchargeDetailsExtension value) {
        setReductionAndSurchargeDetailsExtension(value);
        return this;
    }

}
