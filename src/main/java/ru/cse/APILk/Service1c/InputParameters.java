
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodePLK" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Barcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StateWeight" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StateSize" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputParameters", namespace = "http://www.cargoSort.ru", propOrder = {
    "source",
    "codePLK",
    "barcode",
    "stateWeight",
    "weight",
    "length",
    "width",
    "height",
    "stateSize"
})
public class InputParameters {

    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "CodePLK", required = true)
    protected String codePLK;
    @XmlElement(name = "Barcode", required = true)
    protected String barcode;
    @XmlElement(name = "StateWeight")
    protected short stateWeight;
    @XmlElement(name = "Weight")
    protected float weight;
    @XmlElement(name = "Length")
    protected short length;
    @XmlElement(name = "Width")
    protected short width;
    @XmlElement(name = "Height")
    protected short height;
    @XmlElement(name = "StateSize")
    protected short stateSize;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the codePLK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePLK() {
        return codePLK;
    }

    /**
     * Sets the value of the codePLK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePLK(String value) {
        this.codePLK = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the stateWeight property.
     * 
     */
    public short getStateWeight() {
        return stateWeight;
    }

    /**
     * Sets the value of the stateWeight property.
     * 
     */
    public void setStateWeight(short value) {
        this.stateWeight = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public short getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(short value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public short getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(short value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public short getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(short value) {
        this.height = value;
    }

    /**
     * Gets the value of the stateSize property.
     * 
     */
    public short getStateSize() {
        return stateSize;
    }

    /**
     * Sets the value of the stateSize property.
     * 
     */
    public void setStateSize(short value) {
        this.stateSize = value;
    }

}
