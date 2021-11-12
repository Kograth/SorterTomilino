
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SendExitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SendBarcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SendProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OutputParameters" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_return",
    "sendExitNumber",
    "sendBarcode",
    "sendProductCode",
    "outputParameters"
})
@XmlRootElement(name = "GetDataPushExitResponse")
public class GetDataPushExitResponse {

    @XmlElement(name = "return", required = true)
    protected String _return;
    @XmlElement(name = "SendExitNumber", required = true, nillable = true)
    protected String sendExitNumber;
    @XmlElement(name = "SendBarcode", required = true, nillable = true)
    protected String sendBarcode;
    @XmlElement(name = "SendProductCode", required = true, nillable = true)
    protected String sendProductCode;
    @XmlElement(name = "OutputParameters", required = true, type = Integer.class, nillable = true)
    protected Integer outputParameters;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturn(String value) {
        this._return = value;
    }

    /**
     * Gets the value of the sendExitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendExitNumber() {
        return sendExitNumber;
    }

    /**
     * Sets the value of the sendExitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendExitNumber(String value) {
        this.sendExitNumber = value;
    }

    /**
     * Gets the value of the sendBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendBarcode() {
        return sendBarcode;
    }

    /**
     * Sets the value of the sendBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendBarcode(String value) {
        this.sendBarcode = value;
    }

    /**
     * Gets the value of the sendProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendProductCode() {
        return sendProductCode;
    }

    /**
     * Sets the value of the sendProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendProductCode(String value) {
        this.sendProductCode = value;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutputParameters() {
        return outputParameters;
    }

    /**
     * Sets the value of the outputParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutputParameters(Integer value) {
        this.outputParameters = value;
    }

}
