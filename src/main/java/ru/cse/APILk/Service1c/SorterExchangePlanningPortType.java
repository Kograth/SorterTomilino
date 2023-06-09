package ru.cse.APILk.Service1c;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2021-11-12T10:30:20.960+03:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://www.cse-cargo.ru/client", name = "SorterExchangePlanningPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface SorterExchangePlanningPortType {

    @WebMethod(operationName = "SaveErrors", action = "http://www.cse-cargo.ru/client#SorterExchangePlanning:SaveErrors")
    @RequestWrapper(localName = "SaveErrors", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.SaveErrors")
    @ResponseWrapper(localName = "SaveErrorsResponse", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.SaveErrorsResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/client")
    public java.lang.String saveErrors(
        @WebParam(name = "ErrorCode", targetNamespace = "http://www.cse-cargo.ru/client")
        int errorCode,
        @WebParam(name = "Barcode", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String barcode,
        @WebParam(name = "inLogin", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inLogin,
        @WebParam(mode = WebParam.Mode.OUT, name = "OutputStatus", targetNamespace = "http://www.cse-cargo.ru/client")
        javax.xml.ws.Holder<java.lang.String> outputStatus
    );

    @WebMethod(operationName = "ProductDelivery", action = "http://www.cse-cargo.ru/client#SorterExchangePlanning:ProductDelivery")
    @RequestWrapper(localName = "ProductDelivery", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ProductDelivery")
    @ResponseWrapper(localName = "ProductDeliveryResponse", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ProductDeliveryResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/client")
    public java.lang.String productDelivery(
        @WebParam(name = "InParametrs", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inParametrs,
        @WebParam(name = "ProductCode", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String productCode,
        @WebParam(name = "inLogin", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inLogin
    );

    @WebMethod(operationName = "ReplacingTheBag", action = "http://www.cse-cargo.ru/client#SorterExchangePlanning:ReplacingTheBag")
    @RequestWrapper(localName = "ReplacingTheBag", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ReplacingTheBag")
    @ResponseWrapper(localName = "ReplacingTheBagResponse", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ReplacingTheBagResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/client")
    public java.lang.String replacingTheBag(
        @WebParam(name = "InParametrs", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inParametrs,
        @WebParam(name = "BagCode", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String bagCode,
        @WebParam(name = "ExitNumber", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String exitNumber,
        @WebParam(name = "inLogin", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inLogin,
        @WebParam(mode = WebParam.Mode.OUT, name = "Result", targetNamespace = "http://www.cse-cargo.ru/client")
        javax.xml.ws.Holder<java.lang.String> result
    );

    @WebMethod(operationName = "Ping", action = "http://www.cse-cargo.ru/client#SorterExchangePlanning:Ping")
    @RequestWrapper(localName = "Ping", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.PingResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/client")
    public boolean ping();

    @WebMethod(operationName = "GetDataPushExit", action = "http://www.cse-cargo.ru/client#SorterExchangePlanning:GetDataPushExit")
    @RequestWrapper(localName = "GetDataPushExit", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.GetDataPushExit")
    @ResponseWrapper(localName = "GetDataPushExitResponse", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.GetDataPushExitResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/client")
    public java.lang.String getDataPushExit(
        @WebParam(name = "InParametrs", targetNamespace = "http://www.cse-cargo.ru/client")
        ru.cse.APILk.Service1c.InputParameters inParametrs,
        @WebParam(name = "inLogin", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inLogin,
        @WebParam(mode = WebParam.Mode.OUT, name = "SendExitNumber", targetNamespace = "http://www.cse-cargo.ru/client")
        javax.xml.ws.Holder<java.lang.String> sendExitNumber,
        @WebParam(mode = WebParam.Mode.OUT, name = "SendBarcode", targetNamespace = "http://www.cse-cargo.ru/client")
        javax.xml.ws.Holder<java.lang.String> sendBarcode,
        @WebParam(mode = WebParam.Mode.OUT, name = "SendProductCode", targetNamespace = "http://www.cse-cargo.ru/client")
        javax.xml.ws.Holder<java.lang.String> sendProductCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "OutputParameters", targetNamespace = "http://www.cse-cargo.ru/client")
        javax.xml.ws.Holder<java.lang.Integer> outputParameters
    );

    @WebMethod(operationName = "ProductPurposeManualLoading", action = "http://www.cse-cargo.ru/client#SorterExchangePlanning:ProductPurposeManualLoading")
    @RequestWrapper(localName = "ProductPurposeManualLoading", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ProductPurposeManualLoading")
    @ResponseWrapper(localName = "ProductPurposeManualLoadingResponse", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ProductPurposeManualLoadingResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/client")
    public java.lang.String productPurposeManualLoading(
        @WebParam(name = "InParametrs", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inParametrs,
        @WebParam(name = "inLogin", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inLogin
    );
}
