//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.05 at 03:52:26 PM CEST 
//


package at.austriapro.mappings.zugferd.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxRegistrationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TaxRegistrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}IDType"
 * minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRegistrationType", propOrder = {
    "id"
})
public class TaxRegistrationType {

  @XmlElement(name = "ID")
  protected IDType id;

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link IDType }
   */
  public IDType getID() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link IDType }
   */
  public void setID(IDType value) {
    this.id = value;
  }

  public TaxRegistrationType withID(IDType value) {
    setID(value);
    return this;
  }

}