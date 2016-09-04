//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 02:47:52 PM CEST 
//


package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplyChainTradeTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyChainTradeTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicableSupplyChainTradeAgreement" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}SupplyChainTradeAgreementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicableSupplyChainTradeDelivery" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}SupplyChainTradeDeliveryType" minOccurs="0"/>
 *         &lt;element name="ApplicableSupplyChainTradeSettlement" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}SupplyChainTradeSettlementType" minOccurs="0"/>
 *         &lt;element name="IncludedSupplyChainTradeLineItem" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}SupplyChainTradeLineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyChainTradeTransactionType", propOrder = {
    "applicableSupplyChainTradeAgreement",
    "applicableSupplyChainTradeDelivery",
    "applicableSupplyChainTradeSettlement",
    "includedSupplyChainTradeLineItem"
})
public class SupplyChainTradeTransactionType {

    @XmlElement(name = "ApplicableSupplyChainTradeAgreement")
    protected List<SupplyChainTradeAgreementType> applicableSupplyChainTradeAgreement;
    @XmlElement(name = "ApplicableSupplyChainTradeDelivery")
    protected SupplyChainTradeDeliveryType applicableSupplyChainTradeDelivery;
    @XmlElement(name = "ApplicableSupplyChainTradeSettlement")
    protected SupplyChainTradeSettlementType applicableSupplyChainTradeSettlement;
    @XmlElement(name = "IncludedSupplyChainTradeLineItem")
    protected List<SupplyChainTradeLineItemType> includedSupplyChainTradeLineItem;

    /**
     * Gets the value of the applicableSupplyChainTradeAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableSupplyChainTradeAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableSupplyChainTradeAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyChainTradeAgreementType }
     * 
     * 
     */
    public List<SupplyChainTradeAgreementType> getApplicableSupplyChainTradeAgreement() {
        if (applicableSupplyChainTradeAgreement == null) {
            applicableSupplyChainTradeAgreement = new ArrayList<SupplyChainTradeAgreementType>();
        }
        return this.applicableSupplyChainTradeAgreement;
    }

    /**
     * Gets the value of the applicableSupplyChainTradeDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyChainTradeDeliveryType }
     *     
     */
    public SupplyChainTradeDeliveryType getApplicableSupplyChainTradeDelivery() {
        return applicableSupplyChainTradeDelivery;
    }

    /**
     * Sets the value of the applicableSupplyChainTradeDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyChainTradeDeliveryType }
     *     
     */
    public void setApplicableSupplyChainTradeDelivery(SupplyChainTradeDeliveryType value) {
        this.applicableSupplyChainTradeDelivery = value;
    }

    /**
     * Gets the value of the applicableSupplyChainTradeSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyChainTradeSettlementType }
     *     
     */
    public SupplyChainTradeSettlementType getApplicableSupplyChainTradeSettlement() {
        return applicableSupplyChainTradeSettlement;
    }

    /**
     * Sets the value of the applicableSupplyChainTradeSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyChainTradeSettlementType }
     *     
     */
    public void setApplicableSupplyChainTradeSettlement(SupplyChainTradeSettlementType value) {
        this.applicableSupplyChainTradeSettlement = value;
    }

    /**
     * Gets the value of the includedSupplyChainTradeLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedSupplyChainTradeLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedSupplyChainTradeLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyChainTradeLineItemType }
     * 
     * 
     */
    public List<SupplyChainTradeLineItemType> getIncludedSupplyChainTradeLineItem() {
        if (includedSupplyChainTradeLineItem == null) {
            includedSupplyChainTradeLineItem = new ArrayList<SupplyChainTradeLineItemType>();
        }
        return this.includedSupplyChainTradeLineItem;
    }

}
