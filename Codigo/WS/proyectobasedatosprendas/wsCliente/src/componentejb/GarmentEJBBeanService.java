
package componentejb;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "garmentEJBBeanService", targetNamespace = "http://componentejb/",
                  wsdlLocation =
                  "http://localhost:7101/proyectobasedatosprendas-componentEJB-webapp/garmentEJBBeanService?wsdl#%7Bhttp%3A%2F%2Fcomponentejb%2F%7DgarmentEJBBeanService")
public class GarmentEJBBeanService extends Service {

    private final static URL GARMENTEJBBEANSERVICE_WSDL_LOCATION;
    private final static WebServiceException GARMENTEJBBEANSERVICE_EXCEPTION;
    private final static QName GARMENTEJBBEANSERVICE_QNAME = new QName("http://componentejb/", "garmentEJBBeanService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://localhost:7101/proyectobasedatosprendas-componentEJB-webapp/garmentEJBBeanService?wsdl#%7Bhttp%3A%2F%2Fcomponentejb%2F%7DgarmentEJBBeanService");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GARMENTEJBBEANSERVICE_WSDL_LOCATION = url;
        GARMENTEJBBEANSERVICE_EXCEPTION = e;
    }

    public GarmentEJBBeanService() {
        super(__getWsdlLocation(), GARMENTEJBBEANSERVICE_QNAME);
    }

    public GarmentEJBBeanService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GARMENTEJBBEANSERVICE_QNAME, features);
    }

    public GarmentEJBBeanService(URL wsdlLocation) {
        super(wsdlLocation, GARMENTEJBBEANSERVICE_QNAME);
    }

    public GarmentEJBBeanService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GARMENTEJBBEANSERVICE_QNAME, features);
    }

    public GarmentEJBBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GarmentEJBBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns GarmentEJBBean
     */
    @WebEndpoint(name = "garmentEJBBeanPort")
    public GarmentEJBBean getGarmentEJBBeanPort() {
        return super.getPort(new QName("http://componentejb/", "garmentEJBBeanPort"), GarmentEJBBean.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GarmentEJBBean
     */
    @WebEndpoint(name = "garmentEJBBeanPort")
    public GarmentEJBBean getGarmentEJBBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://componentejb/", "garmentEJBBeanPort"), GarmentEJBBean.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GARMENTEJBBEANSERVICE_EXCEPTION != null) {
            throw GARMENTEJBBEANSERVICE_EXCEPTION;
        }
        return GARMENTEJBBEANSERVICE_WSDL_LOCATION;
    }

}
