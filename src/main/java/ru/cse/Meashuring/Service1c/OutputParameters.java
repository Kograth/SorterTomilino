
package ru.cse.Meashuring.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InputBarcodeString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OutputBarcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputParameters", namespace = "http://www.cargoSort.ru", propOrder = {
    "errorCode",
    "errorText",
    "inputBarcodeString",
    "outputBarcode"
})
public class OutputParameters {

    @XmlElement(name = "ErrorCode")
    protected int errorCode;
    @XmlElement(name = "ErrorText", required = true)
    protected String errorText;
    @XmlElement(name = "InputBarcodeString", required = true)
    protected String inputBarcodeString;
    @XmlElement(name = "OutputBarcode", required = true)
    protected String outputBarcode;

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Gets the value of the inputBarcodeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputBarcodeString() {
        return inputBarcodeString;
    }

    /**
     * Sets the value of the inputBarcodeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputBarcodeString(String value) {
        this.inputBarcodeString = value;
    }

    /**
     * Gets the value of the outputBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputBarcode() {
        return outputBarcode;
    }

    /**
     * Sets the value of the outputBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputBarcode(String value) {
        this.outputBarcode = value;
    }

}
