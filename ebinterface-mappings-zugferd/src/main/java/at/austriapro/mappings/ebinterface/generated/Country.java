//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.05 at 03:52:59 PM CEST 
//


package at.austriapro.mappings.ebinterface.generated;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for CountryType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CountryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p1/}CountryCode"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryType", propOrder = {
    "content"
})
@XmlRootElement(name = "Country")
public class Country
    implements Serializable {

  @XmlValue
  protected String content;
  @XmlAttribute(name = "CountryCode", namespace = "http://www.ebinterface.at/schema/4p1/")
  protected CountryCodeType countryCode;

  /**
   * Gets the value of the content property.
   *
   * @return possible object is {@link String }
   */
  public String getContent() {
    return content;
  }

  /**
   * Sets the value of the content property.
   *
   * @param value allowed object is {@link String }
   */
  public void setContent(String value) {
    this.content = value;
  }

  /**
   * Gets the value of the countryCode property.
   *
   * @return possible object is {@link CountryCodeType }
   */
  public CountryCodeType getCountryCode() {
    return countryCode;
  }

  /**
   * Sets the value of the countryCode property.
   *
   * @param value allowed object is {@link CountryCodeType }
   */
  public void setCountryCode(CountryCodeType value) {
    this.countryCode = value;
  }

  public Country withContent(String value) {
    setContent(value);
    return this;
  }

  public Country withCountryCode(CountryCodeType value) {
    setCountryCode(value);
    return this;
  }

}