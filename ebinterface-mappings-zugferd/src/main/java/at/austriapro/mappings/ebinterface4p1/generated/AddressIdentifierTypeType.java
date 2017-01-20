//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.18 at 06:18:31 PM CET 
//


package at.austriapro.mappings.ebinterface4p1.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressIdentifierTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressIdentifierTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="GLN"/>
 *     &lt;enumeration value="DUNS"/>
 *     &lt;enumeration value="ProprietaryAddressID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressIdentifierTypeType")
@XmlEnum
public enum AddressIdentifierTypeType {

    GLN("GLN"),
    DUNS("DUNS"),
    @XmlEnumValue("ProprietaryAddressID")
    PROPRIETARY_ADDRESS_ID("ProprietaryAddressID");
    private final String value;

    AddressIdentifierTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressIdentifierTypeType fromValue(String v) {
        for (AddressIdentifierTypeType c: AddressIdentifierTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}