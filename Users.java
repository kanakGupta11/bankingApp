package com.example.demo;

import java.util.ArrayList;
import java.util.Date;

public class Users {
	String name;
	String email;
	String gender;
	Date date = new Date();
	int age;
	int seatsBooked;
	String meal;
	ArrayList<Integer> seatNumbers = new ArrayList<>();
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public ArrayList<Integer> getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumbers(ArrayList<Integer> seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
