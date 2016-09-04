//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 02:47:52 PM CEST 
//


package ferd.crossindustrydocument.invoice._1p0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._12.ExchangedDocumentContextType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._12.ExchangedDocumentType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._12.SupplyChainTradeTransactionType;


/**
 * <p>Java class for CrossIndustryDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossIndustryDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecifiedExchangedDocumentContext" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}ExchangedDocumentContextType"/>
 *         &lt;element name="HeaderExchangedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}ExchangedDocumentType"/>
 *         &lt;element name="SpecifiedSupplyChainTradeTransaction" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:12}SupplyChainTradeTransactionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossIndustryDocumentType", propOrder = {
    "specifiedExchangedDocumentContext",
    "headerExchangedDocument",
    "specifiedSupplyChainTradeTransaction"
})
public class CrossIndustryDocumentType {

    @XmlElement(name = "SpecifiedExchangedDocumentContext", required = true)
    protected ExchangedDocumentContextType specifiedExchangedDocumentContext;
    @XmlElement(name = "HeaderExchangedDocument", required = true)
    protected ExchangedDocumentType headerExchangedDocument;
    @XmlElement(name = "SpecifiedSupplyChainTradeTransaction", required = true)
    protected SupplyChainTradeTransactionType specifiedSupplyChainTradeTransaction;

    /**
     * Gets the value of the specifiedExchangedDocumentContext property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangedDocumentContextType }
     *     
     */
    public ExchangedDocumentContextType getSpecifiedExchangedDocumentContext() {
        return specifiedExchangedDocumentContext;
    }

    /**
     * Sets the value of the specifiedExchangedDocumentContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangedDocumentContextType }
     *     
     */
    public void setSpecifiedExchangedDocumentContext(ExchangedDocumentContextType value) {
        this.specifiedExchangedDocumentContext = value;
    }

    /**
     * Gets the value of the headerExchangedDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangedDocumentType }
     *     
     */
    public ExchangedDocumentType getHeaderExchangedDocument() {
        return headerExchangedDocument;
    }

    /**
     * Sets the value of the headerExchangedDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangedDocumentType }
     *     
     */
    public void setHeaderExchangedDocument(ExchangedDocumentType value) {
        this.headerExchangedDocument = value;
    }

    /**
     * Gets the value of the specifiedSupplyChainTradeTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyChainTradeTransactionType }
     *     
     */
    public SupplyChainTradeTransactionType getSpecifiedSupplyChainTradeTransaction() {
        return specifiedSupplyChainTradeTransaction;
    }

    /**
     * Sets the value of the specifiedSupplyChainTradeTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyChainTradeTransactionType }
     *     
     */
    public void setSpecifiedSupplyChainTradeTransaction(SupplyChainTradeTransactionType value) {
        this.specifiedSupplyChainTradeTransaction = value;
    }

}
