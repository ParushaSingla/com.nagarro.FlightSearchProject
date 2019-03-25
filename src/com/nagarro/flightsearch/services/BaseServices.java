package com.nagarro.flightsearch.services;

import java.util.List;

import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.FlightSearchParameter;
import com.nagarro.flightsearch.model.user;

public interface BaseServices {
	 public user login(String username, String password);
	 List<Flight> searchFlight(FlightSearchParameter search);
}
