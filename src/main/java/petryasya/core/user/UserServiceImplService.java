
package petryasya.core.user;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserServiceImplService", targetNamespace = "http://service.petryasya.nure.ua/", wsdlLocation = "http://localhost:9090/userService?wsdl")
public class UserServiceImplService
    extends Service
{

    private final static URL USERSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName USERSERVICEIMPLSERVICE_QNAME = new QName("http://service.petryasya.nure.ua/", "UserServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/userService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        USERSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public UserServiceImplService() {
        super(__getWsdlLocation(), USERSERVICEIMPLSERVICE_QNAME);
    }

    public UserServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERSERVICEIMPLSERVICE_QNAME, features);
    }

    public UserServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, USERSERVICEIMPLSERVICE_QNAME);
    }

    public UserServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERSERVICEIMPLSERVICE_QNAME, features);
    }

    public UserServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServiceImplPort")
    public UserService getUserServiceImplPort() {
        return super.getPort(new QName("http://service.petryasya.nure.ua/", "UserServiceImplPort"), UserService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "UserServiceImplPort")
    public UserService getUserServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.petryasya.nure.ua/", "UserServiceImplPort"), UserService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw USERSERVICEIMPLSERVICE_EXCEPTION;
        }
        return USERSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
