package com.nagarro.flightsearch.dao.api;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.nagarro.flightsearch.daolayer.BaseDao;
import com.nagarro.flightsearch.model.Flight;
import com.nagarro.flightsearch.model.FlightSearchParameter;
import com.nagarro.flightsearch.model.user;

public class BaseDaoImplementation implements BaseDao {

	public user login(String username, String password) {
		Session session = hibernateutil.getSession();
		if (session != null) {
			try {
				String sql = "from user where username=:username AND password=:password";
				Query<user> query = session.createQuery(sql, user.class);
				query.setParameter("username", username);
				query.setParameter("password", password);
				user result = query.uniqueResult();
				if (result != null) {
					System.out.println("User: " + result.toString());
					return result;
				} else {
					System.out.println("Invalid");
					return null;
				}
			} catch (Exception exception) {
				System.out.println("Exception occred while reading user data: " + exception.getMessage());
				return null;
			}

		} else {
			System.out.println("DB server down.....");
		}
		return null;
	}

	public List<Flight> searchFlight(FlightSearchParameter search) {
		Session session = hibernateutil.getSession();
		if (session != null) {
			try {
				String sql = "from Flight where dep_loc=:dep_loc AND arr_loc=:arr_loc AND avaiL=:avail AND flightClass=:flightClass AND Date>=:Date";
				Query<Flight> query = session.createQuery(sql, Flight.class);
				query.setParameter("dep_loc", search.getDepLoc());
				query.setParameter("arr_loc", search.getArrLoc());
				query.setParameter("avail", "Y");
				query.setParameter("flightClass", search.getFlightClass());
				query.setParameter("Date", search.getDate());
				List<Flight> result = query.list();

				if (result != null) {
					return result;
				} else {
					System.out.println("No result");
					return null;
				}

			} catch (Exception exception) {
				System.out.println("Exception occred while reading user data: " + exception.getMessage());
				return null;
			}

		} else

		{
			System.out.println("DB server down.....");
		}
		return null;
	}

}
