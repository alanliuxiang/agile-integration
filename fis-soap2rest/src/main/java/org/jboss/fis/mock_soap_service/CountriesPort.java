package org.jboss.fis.mock_soap_service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2018-02-04T17:45:32.728+08:00
 * Generated source version: 3.1.3
 * 
 */
@WebService(targetNamespace = "http://jboss.org/fis/mock-soap-service", name = "CountriesPort")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CountriesPort {

    @WebMethod
    @WebResult(name = "getCountryResponse", targetNamespace = "http://jboss.org/fis/mock-soap-service", partName = "getCountryResponse")
    public GetCountryResponse getCountry(
        @WebParam(partName = "getCountryRequest", name = "getCountryRequest", targetNamespace = "http://jboss.org/fis/mock-soap-service")
        GetCountryRequest getCountryRequest
    );
}
