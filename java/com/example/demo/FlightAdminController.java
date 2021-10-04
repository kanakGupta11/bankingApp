package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class FlightAdminController {
	@Autowired
	FlightAdminService adminService;
	@PostMapping("admin/register")
	String registerAdmin(@RequestBody FlightAdmin admin ) {
		adminService.registerAdmin(admin);
		return "admin registered";
	}
	@PostMapping("admin/login")
	 List<FlightAdmin> loginAdmin(@RequestBody FlightAdmin admin ) {
		return adminService.loginAdmin(admin);
		
	}
}
