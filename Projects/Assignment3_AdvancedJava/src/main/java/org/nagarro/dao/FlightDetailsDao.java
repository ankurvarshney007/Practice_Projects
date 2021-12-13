package org.nagarro.dao;

import java.util.ArrayList;

import org.nagarro.model.FlightDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class FlightDetailsDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public void saveFlightDetails(FlightDetails flight) {
		int  id = (int)this.hibernateTemplate.save(flight);
		System.out.println(id);
	}
	@Transactional
	public void deleteAllFlights() {
		System.out.println("Hello World");
		ArrayList<FlightDetails> flight=(ArrayList<FlightDetails>)this.hibernateTemplate.loadAll(FlightDetails.class);
		this.hibernateTemplate.deleteAll(flight);
	}
	
	public ArrayList<FlightDetails> getAllFlight() {
		ArrayList<FlightDetails> flight = (ArrayList<FlightDetails>)this.hibernateTemplate.loadAll(FlightDetails.class);
		return flight;
	}

	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
