
package prendapps;

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
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "RequestEJBBeanService", targetNamespace = "http://prendapps/",
                  wsdlLocation =
                  "http://localhost:7101/WebService-PrendApps-webapp/RequestEJBBeanService?wsdl#%7Bhttp%3A%2F%2Fprendapps%2F%7DRequestEJBBeanService")
public class RequestEJBBeanService extends Service {

    private final static URL REQUESTEJBBEANSERVICE_WSDL_LOCATION;
    private final static WebServiceException REQUESTEJBBEANSERVICE_EXCEPTION;
    private final static QName REQUESTEJBBEANSERVICE_QNAME = new QName("http://prendapps/", "RequestEJBBeanService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://localhost:7101/WebService-PrendApps-webapp/RequestEJBBeanService?wsdl#%7Bhttp%3A%2F%2Fprendapps%2F%7DRequestEJBBeanService");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REQUESTEJBBEANSERVICE_WSDL_LOCATION = url;
        REQUESTEJBBEANSERVICE_EXCEPTION = e;
    }

    public RequestEJBBeanService() {
        super(__getWsdlLocation(), REQUESTEJBBEANSERVICE_QNAME);
    }

    public RequestEJBBeanService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REQUESTEJBBEANSERVICE_QNAME, features);
    }

    public RequestEJBBeanService(URL wsdlLocation) {
        super(wsdlLocation, REQUESTEJBBEANSERVICE_QNAME);
    }

    public RequestEJBBeanService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REQUESTEJBBEANSERVICE_QNAME, features);
    }

    public RequestEJBBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RequestEJBBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns RequestEJBBean
     */
    @WebEndpoint(name = "RequestEJBBeanPort")
    public RequestEJBBean getRequestEJBBeanPort() {
        return super.getPort(new QName("http://prendapps/", "RequestEJBBeanPort"), RequestEJBBean.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RequestEJBBean
     */
    @WebEndpoint(name = "RequestEJBBeanPort")
    public RequestEJBBean getRequestEJBBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://prendapps/", "RequestEJBBeanPort"), RequestEJBBean.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REQUESTEJBBEANSERVICE_EXCEPTION != null) {
            throw REQUESTEJBBEANSERVICE_EXCEPTION;
        }
        return REQUESTEJBBEANSERVICE_WSDL_LOCATION;
    }

}
