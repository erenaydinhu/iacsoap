package cxf.nl.eren.schemas.message;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import Domain.Station;
import cxf.schemas.nl.eren.createstationrequest.CreateStationRequest;
import cxf.schemas.nl.eren.createstationresponse.CreateStationResponse;
import cxf.schemas.nl.eren.deletestationrequest.DeleteStationRequest;
import cxf.schemas.nl.eren.deletestationresponse.DeleteStationResponse;
import cxf.schemas.nl.eren.readstationrequest.ReadStationRequest;
import cxf.schemas.nl.eren.readstationresponse.ReadStationResponse;
import cxf.schemas.nl.eren.updatestationrequest.UpdateStationRequest;
import cxf.schemas.nl.eren.updatestationresponse.UpdateStationResponse;

@WebService(serviceName = "StationService", endpointInterface = "cxf.nl.eren.schemas.message.ITrainService", portName = "StationServicePort", name = "TrainServiceImpl")
public class TrainServiceImpl implements
		cxf.nl.eren.schemas.message.ITrainService {

	public CreateStationResponse createStation(
			CreateStationRequest createStationRequest) {
		// TODO Auto-generated method stub
		Station station = new Station();
		station.setCapaciteit(createStationRequest.getCapaciteit());
		station.setNaam(createStationRequest.getNaam());
		station.setStad(createStationRequest.getStad());
		station.setBusstaion(createStationRequest.isBusStation());
		station.setTreinstation(createStationRequest.isTreinStation());
		Station.stations.add(station);

		CreateStationResponse response = new CreateStationResponse();
		response.setCapaciteit(station.getCapaciteit());
		response.setNaam(station.getNaam());
		response.setStad(station.getStad());
		response.setBusStation(station.isBusstaion());
		response.setTreinStation(station.isTreinstation());
		return response;
	}

	public UpdateStationResponse updateStation(
			UpdateStationRequest updateStationRequest) {
		UpdateStationResponse response = new UpdateStationResponse();
		for (Station station : Station.stations) {
			if (station.getNaam().equals(updateStationRequest.getNaam())) {
				station.setCapaciteit(updateStationRequest.getCapaciteit());
				station.setNaam(updateStationRequest.getNaam());
				station.setStad(updateStationRequest.getStad());
				station.setBusstaion(updateStationRequest.isBusStation());
				station.setTreinstation(updateStationRequest.isTreinStation());

				response.setCapaciteit(station.getCapaciteit());
				response.setNaam(station.getNaam());
				response.setStad(station.getStad());
				response.setBusStation(station.isBusstaion());
				response.setTreinStation(station.isTreinstation());
			}
		}

		return response;

	}

	public ReadStationResponse readStation(ReadStationRequest readStationRequest) {

		ReadStationResponse response = new ReadStationResponse();
		for (Station station : Station.stations) {
			if (station.getNaam().equals(readStationRequest.getNaam())) {
				response.setCapaciteit(station.getCapaciteit());
				response.setNaam(station.getNaam());
				response.setStad(station.getStad());
				response.setBusStation(station.isBusstaion());
				response.setTreinStation(station.isTreinstation());
			}

		}
		return response;
	}

	public DeleteStationResponse deleteStation(
			DeleteStationRequest deleteStationRequest) {
		
		DeleteStationResponse response = new DeleteStationResponse();
		for (Station station : Station.stations) {
			if (station.getNaam().equals(deleteStationRequest.getNaam())) {
				response.setResponse("Station met naam '" + station.getNaam() + "' verwijderd." );
				Station.stations.remove(station);
			
			}
			}
		return null;
	}

}
