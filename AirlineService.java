package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineService {
	@Autowired
	AirlineRepository airlineRepository;
	public void registerAirline(Airline airline) {
		airlineRepository.save(airline);
	}

}
