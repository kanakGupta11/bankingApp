package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class FlightController {
	ArrayList<Users> users = new ArrayList<>();
	@PostMapping("/airline/register")
	String register(@RequestBody Users user) {
		users.add(user);
		return "Registered Successfully!!";
	}	
	
	@GetMapping("/booking/history/{emailId}")
	Users History(@PathVariable String email) {
		for(Users usr:users) {
			if(usr.getEmail().equals(email)) {
				return usr;
			}
		}
		return null;
		
	}
	
	@GetMapping("/")
	ArrayList getDetails() {
		return users;
	}
	
	
}
