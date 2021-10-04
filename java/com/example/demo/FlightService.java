package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	FlightRepository flightRepository;
	public void saveFlight(Flight flight) {
		flightRepository.save(flight);
		System.out.println(flight);
		}
	public java.util.List<Flight> getFlights() {
		return flightRepository.findAll();		
	}
	List<Flight> searchFlightService(Flight flight){
	 //return flightRepository.findByFromPlaceOrStartDateTimeOrAirline(flight.getFromPlace(),flight.getStartDateTime(),flight.getAirline());
		return flightRepository.findByFromPlaceAndToPlace(flight.getFromPlace(),flight.getToPlace());
	}
	
}
