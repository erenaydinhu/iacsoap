package cxf.nl.eren.test;

import junit.framework.TestCase;

import org.junit.Test;

import Domain.Station;
import cxf.schemas.nl.eren.*;
import cxf.schemas.nl.eren.createstationrequest.CreateStationRequest;
import cxf.schemas.nl.eren.createstationresponse.CreateStationResponse;
import cxf.schemas.nl.eren.updatestationresponse.UpdateStationResponse;

public class UnitTests extends TestCase {

	@Test
	public void testcreateTestNaam(){
		CreateStationResponse response = new CreateStationResponse();
		response.setBusStation(true);
		response.setTreinStation(true);
		response.setCapaciteit(500);
		response.setNaam("Teststation");
		response.setStad("Teststad");
		Station station = new Station();
		station.setBusstaion(response.isBusStation());
		station.setTreinstation(response.isTreinStation());
		station.setCapaciteit(response.getCapaciteit());
		station.setNaam(response.getNaam());
		station.setStad(response.getStad());
		
		assertEquals(response.getNaam(), station.getNaam());
		
	}
	@Test
	public void testcreateTestBusstation(){
		CreateStationResponse response = new CreateStationResponse();
		response.setBusStation(true);
		response.setTreinStation(true);
		response.setCapaciteit(500);
		response.setNaam("Teststation");
		response.setStad("Teststad");
		Station station = new Station();
		station.setBusstaion(response.isBusStation());
		station.setTreinstation(response.isTreinStation());
		station.setCapaciteit(response.getCapaciteit());
		station.setNaam(response.getNaam());
		station.setStad(response.getStad());
		
		assertEquals(response.isBusStation(), station.isBusstaion());
		
	}
	@Test
	public void testupdateStationStad(){
		UpdateStationResponse response = new UpdateStationResponse();
		Station station = new Station();
		station.setBusstaion(true);
		station.setTreinstation(false);
		station.setCapaciteit(200);
		station.setNaam("Prenaam");
		station.setStad("Prestad");
		
		
		response.setBusStation(false);
		response.setTreinStation(true);
		response.setCapaciteit(150);
		response.setNaam("Postnaam");
		response.setStad("Poststad");
		
		station.setBusstaion(response.isBusStation());
		station.setTreinstation(response.isTreinStation());
		station.setCapaciteit(response.getCapaciteit());
		station.setNaam(response.getNaam());
		station.setStad(response.getStad());
		
		
	
		
		assertEquals(response.getStad(), station.getStad());
		
	}
	@Test
	public void testupdateStationCapaciteit(){
		UpdateStationResponse response = new UpdateStationResponse();
		Station station = new Station();
		station.setBusstaion(true);
		station.setTreinstation(false);
		station.setCapaciteit(200);
		station.setNaam("Prenaam");
		station.setStad("Prestad");
		
		
		response.setBusStation(false);
		response.setTreinStation(true);
		response.setCapaciteit(150);
		response.setNaam("Postnaam");
		response.setStad("Poststad");
		
		station.setBusstaion(response.isBusStation());
		station.setTreinstation(response.isTreinStation());
		station.setCapaciteit(response.getCapaciteit());
		station.setNaam(response.getNaam());
		station.setStad(response.getStad());
		
		
		
		assertEquals(response.getCapaciteit(), station.getCapaciteit());
		
	}
	
	
}
