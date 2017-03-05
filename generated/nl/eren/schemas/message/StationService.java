
/*
 * 
 */

package nl.eren.schemas.message;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.3
 * Sun Feb 19 20:48:10 CET 2017
 * Generated source version: 2.2.3
 * 
 */


@WebServiceClient(name = "StationService", 
                  wsdlLocation = "file:/C:/Users/Eren_2/workspace/IACSOAP/wsdl/station.wsdl",
                  targetNamespace = "http://eren.nl/schemas/message") 
public class StationService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://eren.nl/schemas/message", "StationService");
    public final static QName StationServicePort = new QName("http://eren.nl/schemas/message", "StationServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Eren_2/workspace/IACSOAP/wsdl/station.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/C:/Users/Eren_2/workspace/IACSOAP/wsdl/station.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public StationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StationService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns ITrainService
     */
    @WebEndpoint(name = "StationServicePort")
    public ITrainService getStationServicePort() {
        return super.getPort(StationServicePort, ITrainService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ITrainService
     */
    @WebEndpoint(name = "StationServicePort")
    public ITrainService getStationServicePort(WebServiceFeature... features) {
        return super.getPort(StationServicePort, ITrainService.class, features);
    }

}
