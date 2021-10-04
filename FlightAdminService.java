package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FlightAdminService {
	@Autowired
	FlightAdminRepository adminRepository;
	public void registerAdmin(FlightAdmin admin) {
		adminRepository.save(admin);
		
	}
	public List<FlightAdmin> loginAdmin(FlightAdmin admin) {
		return adminRepository.findByEmailAndPassword(admin.getEmail(),admin.getPassword());
	}

}
