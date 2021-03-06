//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.20 at 05:47:04 PM CET 
//


package at.austriapro.mappings.ebinterface4p3.generated;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderingPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderingPartyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebinterface.at/schema/4p3/}AbstractPartyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p3/}BillersOrderingPartyID"/>
 *         &lt;element ref="{http://www.ebinterface.at/schema/4p3/extensions/ext}OrderingPartyExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderingPartyType", propOrder = {
    "billersOrderingPartyID",
    "orderingPartyExtension"
})
@XmlRootElement(name = "OrderingParty")
public class OrderingParty
    extends AbstractPartyType
    implements Serializable
{

    @XmlElement(name = "BillersOrderingPartyID", required = true)
    protected String billersOrderingPartyID;
    @XmlElement(name = "OrderingPartyExtension", namespace = "http://www.ebinterface.at/schema/4p3/extensions/ext")
    protected OrderingPartyExtension orderingPartyExtension;

    /**
     * Gets the value of the billersOrderingPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillersOrderingPartyID() {
        return billersOrderingPartyID;
    }

    /**
     * Sets the value of the billersOrderingPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillersOrderingPartyID(String value) {
        this.billersOrderingPartyID = value;
    }

    /**
     * Gets the value of the orderingPartyExtension property.
     * 
     * @return
     *     possible object is
     *     {@link OrderingPartyExtension }
     *     
     */
    public OrderingPartyExtension getOrderingPartyExtension() {
        return orderingPartyExtension;
    }

    /**
     * Sets the value of the orderingPartyExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderingPartyExtension }
     *     
     */
    public void setOrderingPartyExtension(OrderingPartyExtension value) {
        this.orderingPartyExtension = value;
    }

    public OrderingParty withBillersOrderingPartyID(String value) {
        setBillersOrderingPartyID(value);
        return this;
    }

    public OrderingParty withOrderingPartyExtension(OrderingPartyExtension value) {
        setOrderingPartyExtension(value);
        return this;
    }

    @Override
    public OrderingParty withVATIdentificationNumber(String value) {
        setVATIdentificationNumber(value);
        return this;
    }

    @Override
    public OrderingParty withFurtherIdentifications(FurtherIdentification... values) {
        if (values!= null) {
            for (FurtherIdentification value: values) {
                getFurtherIdentifications().add(value);
            }
        }
        return this;
    }

    @Override
    public OrderingParty withFurtherIdentifications(Collection<FurtherIdentification> values) {
        if (values!= null) {
            getFurtherIdentifications().addAll(values);
        }
        return this;
    }

    @Override
    public OrderingParty withOrderReference(OrderReferenceType value) {
        setOrderReference(value);
        return this;
    }

    @Override
    public OrderingParty withAddress(Address value) {
        setAddress(value);
        return this;
    }

}
