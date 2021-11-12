
package ru.cse.Meashuring.Service1c;

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
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="inLogin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "number",
    "length",
    "height",
    "width",
    "weight",
    "inLogin"
})
@XmlRootElement(name = "Measurement")
public class Measurement {

    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "Length", required = true, type = Float.class, nillable = true)
    protected Float length;
    @XmlElement(name = "Height", required = true, type = Float.class, nillable = true)
    protected Float height;
    @XmlElement(name = "Width", required = true, type = Float.class, nillable = true)
    protected Float width;
    @XmlElement(name = "Weight", required = true, type = Float.class, nillable = true)
    protected Float weight;
    @XmlElement(required = true, nillable = true)
    protected String inLogin;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLength(Float value) {
        this.length = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWidth(Float value) {
        this.width = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the inLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogin() {
        return inLogin;
    }

    /**
     * Sets the value of the inLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogin(String value) {
        this.inLogin = value;
    }

}
