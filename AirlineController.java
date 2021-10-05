package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class AirlineController {
	@Autowired
	AirlineService airlineService;
	@PostMapping("/ailine/register")
	String registerAdmin(@RequestBody Airline airline ) {
		airlineService.registerAirline(airline);
		return "admin registered";
	}
}
