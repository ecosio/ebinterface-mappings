//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 03:48:50 PM CET 
//


package at.austriapro.mappings.ebinterface4p2.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SEPADirectDebitTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SEPADirectDebitTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="B2C"/>
 *     &lt;enumeration value="B2B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SEPADirectDebitTypeType")
@XmlEnum
public enum SEPADirectDebitTypeType {

    @XmlEnumValue("B2C")
    B_2_C("B2C"),
    @XmlEnumValue("B2B")
    B_2_B("B2B");
    private final String value;

    SEPADirectDebitTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SEPADirectDebitTypeType fromValue(String v) {
        for (SEPADirectDebitTypeType c: SEPADirectDebitTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}