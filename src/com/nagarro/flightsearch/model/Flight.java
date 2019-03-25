package com.nagarro.flightsearch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight_table")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id")
	private int Id;
	@Override
	public String toString() {
		return "Flight [Id=" + Id + ", flightNo=" + flightNo + ", depLoc=" + depLoc + ", arrLoc=" + arrLoc
				+ ", validTill=" + validTill + ", flightTime=" + flightTime + ", flightDuration=" + flightDuration
				+ ", flightFare=" + flightFare + ", availability=" + availability + ", flightClass=" + flightClass
				+ "]";
	}

	@Column(name="no")
	String flightNo;
	@Column(name="dep_loc")
	String depLoc;
	@Column(name="arr_loc")
	String arrLoc;
	@Column(name="valid_till")
	String validTill;
	@Column(name="time")
	String flightTime;
	@Column(name="dura")
	String flightDuration;
	@Column(name="fare")
	String flightFare;
	@Column(name="avail")
	String availability;
	@Column(name="flightClass")
	String flightClass;

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

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

	public String getValidTill() {
		return validTill;
	}

	public void setValidTill(String validTill) {
		this.validTill = validTill;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public String getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}

	public String getFlightFare() {
		return flightFare;
	}

	public void setFlightFare(String flightFare) {
		this.flightFare = flightFare;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	public static int compareByFare(Flight m, Flight o) {
		return Integer.parseInt(m.getFlightFare()) - Integer.parseInt(o.getFlightFare());
	}


}
