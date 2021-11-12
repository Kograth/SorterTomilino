
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ru.cse.APILk.Service1c;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2021-11-12T10:30:20.911+03:00
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "SorterExchangePlanning",
                      portName = "SorterExchangePlanningSoap12",
                      targetNamespace = "http://www.cse-cargo.ru/client",
                      wsdlLocation = "http://adm-12/cse8_alexey/ws/SorterExchangePlanning?wsdl",
                      endpointInterface = "ru.cse.APILk.Service1c.SorterExchangePlanningPortType")
                      
public class SorterExchangePlanningSoap12Impl implements SorterExchangePlanningPortType {

    private static final Logger LOG = Logger.getLogger(SorterExchangePlanningSoap12Impl.class.getName());

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePlanningPortType#saveErrors(int errorCode, java.lang.String barcode, java.lang.String inLogin, java.lang.String outputStatus)*
     */
    public java.lang.String saveErrors(int errorCode, java.lang.String barcode, java.lang.String inLogin, javax.xml.ws.Holder<java.lang.String> outputStatus) { 
        LOG.info("Executing operation saveErrors");
        System.out.println(errorCode);
        System.out.println(barcode);
        System.out.println(inLogin);
        try {
            java.lang.String outputStatusValue = "";
            outputStatus.value = outputStatusValue;
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePlanningPortType#productDelivery(java.lang.String inParametrs, java.lang.String productCode, java.lang.String inLogin)*
     */
    public java.lang.String productDelivery(java.lang.String inParametrs, java.lang.String productCode, java.lang.String inLogin) { 
        LOG.info("Executing operation productDelivery");
        System.out.println(inParametrs);
        System.out.println(productCode);
        System.out.println(inLogin);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePlanningPortType#replacingTheBag(java.lang.String inParametrs, java.lang.String bagCode, java.lang.String exitNumber, java.lang.String inLogin, java.lang.String result)*
     */
    public java.lang.String replacingTheBag(java.lang.String inParametrs, java.lang.String bagCode, java.lang.String exitNumber, java.lang.String inLogin, javax.xml.ws.Holder<java.lang.String> result) { 
        LOG.info("Executing operation replacingTheBag");
        System.out.println(inParametrs);
        System.out.println(bagCode);
        System.out.println(exitNumber);
        System.out.println(inLogin);
        try {
            java.lang.String resultValue = "";
            result.value = resultValue;
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePlanningPortType#ping()*
     */
    public boolean ping() { 
        LOG.info("Executing operation ping");
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePlanningPortType#getDataPushExit(ru.cse.APILk.Service1c.InputParameters inParametrs, java.lang.String inLogin, java.lang.String sendExitNumber, java.lang.String sendBarcode, java.lang.String sendProductCode, java.lang.Integer outputParameters)*
     */
    public java.lang.String getDataPushExit(ru.cse.APILk.Service1c.InputParameters inParametrs, java.lang.String inLogin, javax.xml.ws.Holder<java.lang.String> sendExitNumber, javax.xml.ws.Holder<java.lang.String> sendBarcode, javax.xml.ws.Holder<java.lang.String> sendProductCode, javax.xml.ws.Holder<java.lang.Integer> outputParameters) { 
        LOG.info("Executing operation getDataPushExit");
        System.out.println(inParametrs);
        System.out.println(inLogin);
        try {
            java.lang.String sendExitNumberValue = "";
            sendExitNumber.value = sendExitNumberValue;
            java.lang.String sendBarcodeValue = "";
            sendBarcode.value = sendBarcodeValue;
            java.lang.String sendProductCodeValue = "";
            sendProductCode.value = sendProductCodeValue;
            java.lang.Integer outputParametersValue = null;
            outputParameters.value = outputParametersValue;
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePlanningPortType#productPurposeManualLoading(java.lang.String inParametrs, java.lang.String inLogin)*
     */
    public java.lang.String productPurposeManualLoading(java.lang.String inParametrs, java.lang.String inLogin) { 
        LOG.info("Executing operation productPurposeManualLoading");
        System.out.println(inParametrs);
        System.out.println(inLogin);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
