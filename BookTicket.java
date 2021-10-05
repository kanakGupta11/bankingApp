package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BookTicket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pnr;
	public Integer getPnr() {
		return pnr;
	}
	private int flightId;
	private int numberOfSeatsBooked;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getNumberOfSeatsBooked() {
		return numberOfSeatsBooked;
	}
	public void setNumberOfSeatsBooked(int numberOfSeatsBooked) {
		this.numberOfSeatsBooked = numberOfSeatsBooked;
	}
}
