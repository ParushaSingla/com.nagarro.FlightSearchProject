package com.nagarro.flightsearch.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FlightSearchParameter {
	@NotNull(message = "Please enter Departure location(size=3).")
	@Size(min = 3, max = 3)
	String depLoc;
	@NotNull(message = "Please enter Arrival location(size=3).")
	@Size(min = 3, max = 3)
	String arrLoc;
	@NotNull
	String Date;
	@NotNull
	@Size(min = 2, max = 2)
	String flightClass;
	@NotNull
	String outputpref;

	public String getDepLoc() {
		return depLoc;
	}

	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}

	public String getArrLoc() {
		return arrLoc;
	}

	public void setArrLoc(String arrLoc) {
		this.arrLoc = arrLoc;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	public String getOutputpref() {
		return outputpref;
	}

	public void setOutputpref(String outputpref) {
		this.outputpref = outputpref;
	}

	@Override
	public String toString() {
		return "FlightSearchParameter [depLoc=" + depLoc + ", arrLoc=" + arrLoc + ", Date=" + Date + ", flightClass="
				+ flightClass + ", outputpref=" + outputpref + "]";
	}

}
