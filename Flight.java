package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Flight {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String fromPlace;
		private String toPlace; 
		private String startDateTime;
		private String endDateTime;
		private int numberOfRows;
		private int businessClassRows;
		private int nonBusinessClassRows;
		private int cost;
		private String food;
		private String airline;
		
		private int flightNumber;
		public int getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(int flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getFromPlace() {
			return fromPlace;
		}
		public void setFromPlace(String fromPlace) {
			this.fromPlace = fromPlace;
		}
		public String getToPlace() {
			return toPlace;
		}
		public void setToPlace(String toPlace) {
			this.toPlace = toPlace;
		}
		public String getStartDateTime() {
			return startDateTime;
		}
		public void setStartDateTime(String startDateTime) {
			this.startDateTime = startDateTime;
		}
		public String getEndDateTime() {
			return endDateTime;
		}
		public void setEndDateTime(String endDateTime) {
			this.endDateTime = endDateTime;
		}
		public int getNumberOfRows() {
			return numberOfRows;
		}
		public void setNumberOfRows(int numberOfRows) {
			this.numberOfRows = numberOfRows;
		}
		public int getBusinessClassRows() {
			return businessClassRows;
		}
		public void setBusinessClassRows(int businessClassRows) {
			this.businessClassRows = businessClassRows;
		}
		public int getNonBusinessClassRows() {
			return nonBusinessClassRows;
		}
		public void setNonBusinessClassRows(int nonBusinessClassRows) {
			this.nonBusinessClassRows = nonBusinessClassRows;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public String getFood() {
			return food;
		}
		public void setFood(String food) {
			this.food = food;
		}
		public String getAirline() {
			return airline;
		}
		public void setAirline(String airline) {
			this.airline = airline;
		}
		public int BookFlightBusinessClass(int numberofSeatsToBeBooked) {
			if(numberofSeatsToBeBooked<=businessClassRows) {
				businessClassRows-=numberofSeatsToBeBooked;
				return numberofSeatsToBeBooked;
			}
			return 0;}
			public int BookFlightNonBusinessClass(int numberofSeatsToBeBooked) {
				if(numberofSeatsToBeBooked<=nonBusinessClassRows) {
					nonBusinessClassRows-=numberofSeatsToBeBooked;
					return numberofSeatsToBeBooked;
				}
				return 0;
		}
		

}
