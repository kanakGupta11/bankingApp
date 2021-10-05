package com.example.demo;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookTicketService {
	@Autowired
	BookTicketReository bookTicketReository;
	public void saveBookedTicket(BookTicket bookTicket) {
		bookTicketReository.save(bookTicket);
		
	}
	public List<BookTicket> findTicketByPnr(int pnr) {
		return bookTicketReository.findByPnr(pnr);
		
	}
	public void deleteTicketByPnr(int pnr) {
		bookTicketReository.deleteById(pnr);
		return;
	}
	public List<BookTicket> findBookinghistory(String email) {
		return bookTicketReository.findByEmail(email);
	}

}
