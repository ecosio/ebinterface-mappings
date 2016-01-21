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
 * <p>Java class for ReferencedProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencedProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GlobalID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SellerAssignedID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}IDType" minOccurs="0"/>
 *         &lt;element name="BuyerAssignedID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}IDType" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}QuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedProductType", propOrder = {
    "globalID",
    "sellerAssignedID",
    "buyerAssignedID",
    "name",
    "description",
    "unitQuantity"
})
public class ReferencedProductType {

    @XmlElement(name = "GlobalID")
    protected List<IDType> globalID;
    @XmlElement(name = "SellerAssignedID")
    protected IDType sellerAssignedID;
    @XmlElement(name = "BuyerAssignedID")
    protected IDType buyerAssignedID;
    @XmlElement(name = "Name")
    protected List<TextType> name;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "UnitQuantity")
    protected List<QuantityType> unitQuantity;

    /**
     * Gets the value of the globalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getGlobalID() {
        if (globalID == null) {
            globalID = new ArrayList<IDType>();
        }
        return this.globalID;
    }

    /**
     * Gets the value of the sellerAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSellerAssignedID() {
        return sellerAssignedID;
    }

    /**
     * Sets the value of the sellerAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSellerAssignedID(IDType value) {
        this.sellerAssignedID = value;
    }

    /**
     * Gets the value of the buyerAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getBuyerAssignedID() {
        return buyerAssignedID;
    }

    /**
     * Sets the value of the buyerAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setBuyerAssignedID(IDType value) {
        this.buyerAssignedID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getName() {
        if (name == null) {
            name = new ArrayList<TextType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDescription() {
        if (description == null) {
            description = new ArrayList<TextType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the unitQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getUnitQuantity() {
        if (unitQuantity == null) {
            unitQuantity = new ArrayList<QuantityType>();
        }
        return this.unitQuantity;
    }

    public ReferencedProductType withGlobalID(IDType... values) {
        if (values!= null) {
            for (IDType value: values) {
                getGlobalID().add(value);
            }
        }
        return this;
    }

    public ReferencedProductType withGlobalID(Collection<IDType> values) {
        if (values!= null) {
            getGlobalID().addAll(values);
        }
        return this;
    }

    public ReferencedProductType withSellerAssignedID(IDType value) {
        setSellerAssignedID(value);
        return this;
    }

    public ReferencedProductType withBuyerAssignedID(IDType value) {
        setBuyerAssignedID(value);
        return this;
    }

    public ReferencedProductType withName(TextType... values) {
        if (values!= null) {
            for (TextType value: values) {
                getName().add(value);
            }
        }
        return this;
    }

    public ReferencedProductType withName(Collection<TextType> values) {
        if (values!= null) {
            getName().addAll(values);
        }
        return this;
    }

    public ReferencedProductType withDescription(TextType... values) {
        if (values!= null) {
            for (TextType value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public ReferencedProductType withDescription(Collection<TextType> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public ReferencedProductType withUnitQuantity(QuantityType... values) {
        if (values!= null) {
            for (QuantityType value: values) {
                getUnitQuantity().add(value);
            }
        }
        return this;
    }

    public ReferencedProductType withUnitQuantity(Collection<QuantityType> values) {
        if (values!= null) {
            getUnitQuantity().addAll(values);
        }
        return this;
    }

}
