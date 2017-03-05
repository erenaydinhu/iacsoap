package cxf.nl.eren.schemas.message;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.3
 * Fri Feb 17 10:28:05 CET 2017
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://eren.nl/schemas/message", name = "ITrainService")
@XmlSeeAlso({cxf.schemas.nl.eren.updatestationresponse.ObjectFactory.class,cxf.schemas.nl.eren.createstationresponse.ObjectFactory.class,cxf.schemas.nl.eren.readstationrequest.ObjectFactory.class,cxf.schemas.nl.eren.updatestationrequest.ObjectFactory.class,cxf.schemas.nl.eren.readstationresponse.ObjectFactory.class,cxf.schemas.nl.eren.deletestationresponse.ObjectFactory.class,cxf.schemas.nl.eren.deletestationrequest.ObjectFactory.class,cxf.schemas.nl.eren.createstationrequest.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ITrainService {

    @WebMethod(action = "createStation")
    @WebResult(name = "createStationResponse", targetNamespace = "http://eren.nl.schemas/createStationResponse", partName = "createStationResponse")
    public cxf.schemas.nl.eren.createstationresponse.CreateStationResponse createStation(
        @WebParam(partName = "createStationRequest", name = "createStationRequest", targetNamespace = "http://eren.nl.schemas/createStationRequest")
        cxf.schemas.nl.eren.createstationrequest.CreateStationRequest createStationRequest
    );

    @WebMethod(action = "updateStation")
    @WebResult(name = "updateStationResponse", targetNamespace = "http://eren.nl.schemas/updateStationResponse", partName = "updateStationResponse")
    public cxf.schemas.nl.eren.updatestationresponse.UpdateStationResponse updateStation(
        @WebParam(partName = "updateStationRequest", name = "updateStationRequest", targetNamespace = "http://eren.nl.schemas/updateStationRequest")
        cxf.schemas.nl.eren.updatestationrequest.UpdateStationRequest updateStationRequest
    );

    @WebMethod(action = "readStation")
    @WebResult(name = "readStationResponse", targetNamespace = "http://eren.nl.schemas/readStationResponse", partName = "readStationResponse")
    public cxf.schemas.nl.eren.readstationresponse.ReadStationResponse readStation(
        @WebParam(partName = "readStationRequest", name = "readStationRequest", targetNamespace = "http://eren.nl.schemas/readStationRequest")
        cxf.schemas.nl.eren.readstationrequest.ReadStationRequest readStationRequest
    );

    @WebMethod(action = "deleteStation")
    @WebResult(name = "deleteStationResponse", targetNamespace = "http://eren.nl.schemas/deleteStationResponse", partName = "deleteStationResponse")
    public cxf.schemas.nl.eren.deletestationresponse.DeleteStationResponse deleteStation(
        @WebParam(partName = "deleteStationRequest", name = "deleteStationRequest", targetNamespace = "http://eren.nl.schemas/deleteStationRequest")
        cxf.schemas.nl.eren.deletestationrequest.DeleteStationRequest deleteStationRequest
    );
}