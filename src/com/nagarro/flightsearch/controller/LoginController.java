package com.nagarro.flightsearch.controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.FlightSearchParameter;
import com.nagarro.flightsearch.model.user;
import com.nagarro.flightsearch.service.api.BaseServicesImplementation;
import javax.validation.Valid;

@RestController
public class LoginController {

	ApplicationContext appContext = new ClassPathXmlApplicationContext("app.xml");
	BaseServicesImplementation service = appContext.getBean("BaseServicesImplementation",
			BaseServicesImplementation.class);
	FlightSearchParameter search = new FlightSearchParameter();

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("uname") String name, @RequestParam("pass") String password) {

		{
			ModelAndView modelView = new ModelAndView();
			user flag = service.login(name, password);
			if (flag == null)
				modelView.setViewName("index");
			else
				modelView.setViewName("dashboard");
			return modelView;
		}
	}

	@RequestMapping(value = "input", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("input2") String arrivalloc, @RequestParam("input1") String deploc,
			@RequestParam("input3") String clas, @RequestParam("input5") String date,
			@RequestParam("input4") String preference) {

		setFlightToBeSearch(arrivalloc, deploc, clas, date, preference);
		System.out.println(search);
		List<Flight> flightList = service.searchFlight(search);
		System.out.println(flightList);
		if (flightList != null) {
			flightList = sorting(flightList, preference);
		}
		ModelAndView modelAndView = new ModelAndView("FlightList");
		modelAndView.addObject("flightList", flightList);
		return modelAndView;

	}

	private List<Flight> sorting(List<Flight> flightList, String preference) {

		if (preference.equals("Fare")) {
			flightList.sort(Flight::compareByFare);
		} else {
			flightList.sort(Comparator.comparing(Flight::getFlightDuration).thenComparing(Flight::compareByFare));
		}
		return flightList;
	}

	private void setFlightToBeSearch(String arrivalloc, String deploc, String clas, String date, String preference) {
		search.setArrLoc(arrivalloc);
		search.setDepLoc(deploc);
		search.setFlightClass(clas

		);
		search.setDate(date);
		search.setOutputpref(preference);
	}
}
