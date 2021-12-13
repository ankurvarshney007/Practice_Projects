package org.nagarro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class FlightDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int flightId;
	
	private String flightNo;
	private String DepartureLocation;
	private String ArrivalLocation;
	
	private String flightClass;
	private String seatAvailability;
	private String flightTime;
	private String flightDuration;
	private String flightValidTill;
	private double flightFare;
	/**
	 * @return the departureLocation
	 */
	
	public String getDepartureLocation() {
		return DepartureLocation;
	}
	public FlightDetails(String departureLocation, String arrivalLocation, String flightNo, String flightClass,
			String seatAvailability, String flightTime, String flightDuration, String flightValidTill,
			double flightFare) {
		super();
		DepartureLocation = departureLocation;
		ArrivalLocation = arrivalLocation;
		this.flightNo = flightNo;
		this.flightClass = flightClass;
		this.seatAvailability = seatAvailability;
		this.flightTime = flightTime;
		this.flightDuration = flightDuration;
		this.flightValidTill = flightValidTill;
		this.flightFare = flightFare;
	}
	
	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param departureLocation the departureLocation to set
	 */
	public void setDepartureLocation(String departureLocation) {
		DepartureLocation = departureLocation;
	}
	/**
	 * @return the arrivalLocation
	 */
	public String getArrivalLocation() {
		return ArrivalLocation;
	}
	/**
	 * @param arrivalLocation the arrivalLocation to set
	 */
	public void setArrivalLocation(String arrivalLocation) {
		ArrivalLocation = arrivalLocation;
	}
	/**
	 * @return the flightNo
	 */
	public String getFlightNo() {
		return flightNo;
	}
	/**
	 * @param flightNo the flightNo to set
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	/**
	 * @return the flightClass
	 */
	public String getFlightClass() {
		return flightClass;
	}
	/**
	 * @param flightClass the flightClass to set
	 */
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	/**
	 * @return the seatAvailability
	 */
	public String getSeatAvailability() {
		return seatAvailability;
	}
	/**
	 * @param seatAvailability the seatAvailability to set
	 */
	public void setSeatAvailability(String seatAvailability) {
		this.seatAvailability = seatAvailability;
	}
	/**
	 * @return the flightTime
	 */
	public String getFlightTime() {
		return flightTime;
	}
	/**
	 * @param flightTime the flightTime to set
	 */
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	/**
	 * @return the flightDuration
	 */
	public String getFlightDuration() {
		return flightDuration;
	}
	/**
	 * @param flightDuration the flightDuration to set
	 */
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	/**
	 * @return the flightValidTill
	 */
	public String getFlightValidTill() {
		return flightValidTill;
	}
	/**
	 * @param flightValidTill the flightValidTill to set
	 */
	public void setFlightValidTill(String flightValidTill) {
		this.flightValidTill = flightValidTill;
	}
	/**
	 * @return the flightFare
	 */
	public double getFlightFare() {
		return flightFare;
	}
	/**
	 * @param flightFare the flightFare to set
	 */
	public void setFlightFare(double flightFare) {
		this.flightFare = flightFare;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightDetails [flightId=" + flightId + ", flightNo=" + flightNo + ", DepartureLocation="
				+ DepartureLocation + ", ArrivalLocation=" + ArrivalLocation + ", flightClass=" + flightClass
				+ ", seatAvailability=" + seatAvailability + ", flightTime=" + flightTime + ", flightDuration="
				+ flightDuration + ", flightValidTill=" + flightValidTill + ", flightFare=" + flightFare + "]";
	}
	
	public void setBuisnessFlightFare() {
		this.flightFare = this.flightFare + (0.4*this.flightFare);
	}
	
}
