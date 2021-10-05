package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTicketReository extends JpaRepository<BookTicket,Integer>{

	List<BookTicket> findByPnr(int pnr);

	List<BookTicket> deleteByPnr(int pnr);

	List<BookTicket> findByEmail(String email);
	

}
