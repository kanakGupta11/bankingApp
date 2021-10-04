package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface AirlineRepository extends JpaRepository<Airline,Integer> {

}
