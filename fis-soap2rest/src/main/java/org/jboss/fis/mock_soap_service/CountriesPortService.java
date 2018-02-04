package org.jboss.fis.mock_soap_service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2018-02-04T19:07:57.225+08:00
 * Generated source version: 3.1.3
 * 
 */
@WebServiceClient(name = "CountriesPortService", 
                  wsdlLocation = "http://mock-soap-service-mock.192.168.42.107.nip.io/services/countries.wsdl",
                  targetNamespace = "http://jboss.org/fis/mock-soap-service") 
public class CountriesPortService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://jboss.org/fis/mock-soap-service", "CountriesPortService");
    public final static QName CountriesPortSoap11 = new QName("http://jboss.org/fis/mock-soap-service", "CountriesPortSoap11");
    static {
        URL url = null;
        try {
            url = new URL("http://mock-soap-service-mock.192.168.42.107.nip.io/services/countries.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CountriesPortService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://mock-soap-service-mock.192.168.42.107.nip.io/services/countries.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CountriesPortService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CountriesPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CountriesPortService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CountriesPortService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CountriesPortService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CountriesPortService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CountriesPort
     */
    @WebEndpoint(name = "CountriesPortSoap11")
    public CountriesPort getCountriesPortSoap11() {
        return super.getPort(CountriesPortSoap11, CountriesPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountriesPort
     */
    @WebEndpoint(name = "CountriesPortSoap11")
    public CountriesPort getCountriesPortSoap11(WebServiceFeature... features) {
        return super.getPort(CountriesPortSoap11, CountriesPort.class, features);
    }

}
