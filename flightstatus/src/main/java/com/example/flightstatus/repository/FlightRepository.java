package com.example.flightstatus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flightstatus.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

}
