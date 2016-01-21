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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReductionAndSurchargeListLineItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReductionAndSurchargeListLineItemDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}ReductionListLineItem" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}SurchargeListLineItem" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p1/}OtherVATableTaxListLineItem" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReductionAndSurchargeListLineItemDetailsType", propOrder = {
    "reductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems"
})
@XmlRootElement(name = "ReductionAndSurchargeListLineItemDetails")
public class ReductionAndSurchargeListLineItemDetails
    implements Serializable
{

    @XmlElementRefs({
        @XmlElementRef(name = "ReductionListLineItem", namespace = "http://www.ebinterface.at/schema/4p1/", type = JAXBElement.class),
        @XmlElementRef(name = "SurchargeListLineItem", namespace = "http://www.ebinterface.at/schema/4p1/", type = JAXBElement.class),
        @XmlElementRef(name = "OtherVATableTaxListLineItem", namespace = "http://www.ebinterface.at/schema/4p1/", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> reductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems;

    /**
     * Gets the value of the reductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ReductionAndSurchargeBaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReductionAndSurchargeBaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherVATableTaxBaseType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getReductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems() {
        if (reductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems == null) {
            reductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.reductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems;
    }

    public ReductionAndSurchargeListLineItemDetails withReductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems(JAXBElement<? extends Serializable> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends Serializable> value: values) {
                getReductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems().add(value);
            }
        }
        return this;
    }

    public ReductionAndSurchargeListLineItemDetails withReductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems(Collection<JAXBElement<? extends Serializable>> values) {
        if (values!= null) {
            getReductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems().addAll(values);
        }
        return this;
    }

}
