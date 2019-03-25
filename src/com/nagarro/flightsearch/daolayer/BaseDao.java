package com.nagarro.flightsearch.daolayer;

import java.util.List;

import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.FlightSearchParameter;
import com.nagarro.flightsearch.model.user;

public interface BaseDao {
	 public user login(String username, String password);
	public List<Flight> searchFlight(FlightSearchParameter search);
}
