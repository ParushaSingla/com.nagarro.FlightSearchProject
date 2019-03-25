package com.nagarro.flightsearch.service.api;

import java.util.List;

import com.nagarro.flightsearch.dao.api.BaseDaoImplementation;
import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.FlightSearchParameter;
import com.nagarro.flightsearch.model.user;
import com.nagarro.flightsearch.services.BaseServices;

public class BaseServicesImplementation implements BaseServices {
	BaseDaoImplementation loginDao;

	public void setLoginDao(BaseDaoImplementation loginDao) {
		this.loginDao = loginDao;
	}

	public user login(String username, String password) {
		
		return loginDao.login(username, password);
	}

	public List<Flight> searchFlight(FlightSearchParameter search) {
		return loginDao.searchFlight(search);

	}

}
