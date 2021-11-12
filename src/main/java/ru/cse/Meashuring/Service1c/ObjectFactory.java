
package ru.cse.Meashuring.Service1c;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.cse.Meashuring.Service1c package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResultStringValue_QNAME = new QName("http://www.cse-cargo.ru/MeasurerCargo", "Value");
    private final static QName _ResultStringErrorInfo_QNAME = new QName("http://www.cse-cargo.ru/MeasurerCargo", "ErrorInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.cse.Meashuring.Service1c
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Measurement }
     * 
     */
    public Measurement createMeasurement() {
        return new Measurement();
    }

    /**
     * Create an instance of {@link MeasurementResponse }
     * 
     */
    public MeasurementResponse createMeasurementResponse() {
        return new MeasurementResponse();
    }

    /**
     * Create an instance of {@link ResultString }
     * 
     */
    public ResultString createResultString() {
        return new ResultString();
    }

    /**
     * Create an instance of {@link FotoCargo }
     * 
     */
    public FotoCargo createFotoCargo() {
        return new FotoCargo();
    }

    /**
     * Create an instance of {@link FotoCargoResponse }
     * 
     */
    public FotoCargoResponse createFotoCargoResponse() {
        return new FotoCargoResponse();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link InputParameters }
     * 
     */
    public InputParameters createInputParameters() {
        return new InputParameters();
    }

    /**
     * Create an instance of {@link OutputParameters }
     * 
     */
    public OutputParameters createOutputParameters() {
        return new OutputParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/MeasurerCargo", name = "Value", scope = ResultString.class)
    public JAXBElement<String> createResultStringValue(String value) {
        return new JAXBElement<String>(_ResultStringValue_QNAME, String.class, ResultString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cse-cargo.ru/MeasurerCargo", name = "ErrorInfo", scope = ResultString.class)
    public JAXBElement<String> createResultStringErrorInfo(String value) {
        return new JAXBElement<String>(_ResultStringErrorInfo_QNAME, String.class, ResultString.class, value);
    }

}
