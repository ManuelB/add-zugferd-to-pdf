//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 02:47:52 PM CEST 
//


package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._15.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._15.TextType;


/**
 * <p>Java class for CreditorFinancialInstitutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorFinancialInstitutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BICID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}IDType" minOccurs="0"/>
 *         &lt;element name="GermanBankleitzahlID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}IDType" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorFinancialInstitutionType", propOrder = {
    "bicid",
    "germanBankleitzahlID",
    "name"
})
public class CreditorFinancialInstitutionType {

    @XmlElement(name = "BICID")
    protected IDType bicid;
    @XmlElement(name = "GermanBankleitzahlID")
    protected IDType germanBankleitzahlID;
    @XmlElement(name = "Name")
    protected TextType name;

    /**
     * Gets the value of the bicid property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getBICID() {
        return bicid;
    }

    /**
     * Sets the value of the bicid property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setBICID(IDType value) {
        this.bicid = value;
    }

    /**
     * Gets the value of the germanBankleitzahlID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getGermanBankleitzahlID() {
        return germanBankleitzahlID;
    }

    /**
     * Sets the value of the germanBankleitzahlID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setGermanBankleitzahlID(IDType value) {
        this.germanBankleitzahlID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setName(TextType value) {
        this.name = value;
    }

}
