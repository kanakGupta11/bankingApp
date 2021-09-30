package com.example.demo;

public class flight {

		private int flightNumber;
		/**
		 * @param flightNumber
		 * @param airline
		 * @param fromPlace
		 * @param toPlace
		 * @param startDateTime
		 * @param endDateTime
		 * @param numberofRows
		 * @param businessClassRows
		 * @param serviceClassRows
		 * @param cost
		 * @param food
		 */
		public flight(int flightNumber, String airline, String fromPlace, String toPlace, String startDateTime,
				String endDateTime, int numberofRows, int businessClassRows, int serviceClassRows, int cost,
				String food) {
			this.flightNumber = flightNumber;
			Airline = airline;
			FromPlace = fromPlace;
			ToPlace = toPlace;
			StartDateTime = startDateTime;
			EndDateTime = endDateTime;
			NumberofRows = numberofRows;
			BusinessClassRows = businessClassRows;
			NonBusinessClassRows = serviceClassRows;
			Cost = cost;
			this.food = food;
		}
		private String Airline;
		private String FromPlace;
		private String ToPlace; 
		private String StartDateTime;
		private String EndDateTime;
		private int NumberofRows;
		private int BusinessClassRows;
		private int NonBusinessClassRows;
		private int Cost;
		private String food;
		/**
		 * @param flightNumber
		 * @param airline
		 * @param fromPlace
		 * @param toPlace
		 * @param startDateTime
		 * @param endDateTime
		 */
		
		public int BookFlightBusinessClass(int NumberofSeatsToBeBooked) {
			if(NumberofSeatsToBeBooked<=BusinessClassRows) {
				BusinessClassRows-=NumberofSeatsToBeBooked;
				return NumberofSeatsToBeBooked;
			}
			return 0;}
			public int BookFlightNonBusinessClass(int NumberofSeatsToBeBooked) {
				if(NumberofSeatsToBeBooked<=NonBusinessClassRows) {
					NonBusinessClassRows-=NumberofSeatsToBeBooked;
					return NumberofSeatsToBeBooked;
				}
				return 0;
		}
		

}
