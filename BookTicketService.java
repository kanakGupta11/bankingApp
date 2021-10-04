package com.example.demo;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookTicketService {
	Random random = new Random();
	@Autowired
	BookTicketReository bookTicketReository;
	public void saveBookedTicket(BookTicket bookTicket) {
		int generatePnr=random.nextInt();
		if (generatePnr<0) {
			bookTicket.setPnr(-1*generatePnr);
		}else {
		bookTicket.setPnr(generatePnr);}
		bookTicketReository.save(bookTicket);
		
	}
	public List<BookTicket> findTicketByPnr(BookTicket bookTicket) {
		return bookTicketReository.findByPnr(bookTicket.getPnr());
		
	}
	public void deleteTicketByPnr(int pnr) {
		bookTicketReository.deleteById(pnr);
	}
	public List<BookTicket> findBookinghistory(String email) {
		return bookTicketReository.findByEmail(email);
	}

}
