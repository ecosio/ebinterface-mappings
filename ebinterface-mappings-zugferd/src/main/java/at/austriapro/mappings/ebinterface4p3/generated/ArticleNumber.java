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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ArticleNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArticleNumberType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute ref="{http://www.ebinterface.at/schema/4p3/}ArticleNumberType"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArticleNumberType", propOrder = {
    "value"
})
@XmlRootElement(name = "ArticleNumber")
public class ArticleNumber
    implements Serializable
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ArticleNumberType", namespace = "http://www.ebinterface.at/schema/4p3/")
    protected ArticleNumberTypeType articleNumberType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the articleNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleNumberTypeType }
     *     
     */
    public ArticleNumberTypeType getArticleNumberType() {
        return articleNumberType;
    }

    /**
     * Sets the value of the articleNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleNumberTypeType }
     *     
     */
    public void setArticleNumberType(ArticleNumberTypeType value) {
        this.articleNumberType = value;
    }

    public ArticleNumber withValue(String value) {
        setValue(value);
        return this;
    }

    public ArticleNumber withArticleNumberType(ArticleNumberTypeType value) {
        setArticleNumberType(value);
        return this;
    }

}