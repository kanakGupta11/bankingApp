package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTicketReository extends JpaRepository<BookTicket,Integer>{

	List<BookTicket> findByPnr(double pnr);

	List<BookTicket> deleteByPnr(double pnr);

	List<BookTicket> findByEmail(String email);
	

}
