package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	List<Flight> findByFromPlaceAndToPlace(String fromPlace , String toPlace);
	//List<Flight> findByfromPlaceOrstartDateTimeOrairline(String fromPlace,String startDateTime,String airline);
}
