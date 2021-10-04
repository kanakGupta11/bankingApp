package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

interface  FlightAdminRepository  extends JpaRepository<FlightAdmin,Integer> {
	List<FlightAdmin>findByEmailAndPassword(String email,String password);

}
