package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class BookTicketController {
	@Autowired
	BookTicketService bookTicketService;
	@GetMapping("/booking/history/{email}")
	List<BookTicket> bookinghistory(@PathVariable String email){
		return bookTicketService.findBookinghistory(email);
		
	}
	
	@PostMapping("/booking/{flightid}")
	String ticketBookingmethod(@RequestBody BookTicket bookTicket) {
		bookTicketService.saveBookedTicket(bookTicket);
		return "ticket booked";
	}
	@GetMapping("/ticket/{pnr}")
	List<BookTicket> ticketByPnr(@PathVariable int pnr) {
		return bookTicketService.findTicketByPnr(pnr);
		 
	}
	@DeleteMapping("/booking/cancel/{pnr}")
	String deleteTicketByPnr(@PathVariable int pnr) {
		bookTicketService.deleteTicketByPnr(pnr);
		return "ticket deleted";
	}

}
