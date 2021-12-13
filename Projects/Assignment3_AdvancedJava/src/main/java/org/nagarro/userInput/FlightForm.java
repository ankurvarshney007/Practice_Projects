package org.nagarro.userInput;

public class FlightForm {
	private String arrivallocation;
	private String departurelocation;
	private String flightdate;
	private String flightclass;
	private String outputpreference;
	/**
	 * @return the arrivinglocation
	 */
	
	
	public String getArrivallocation() {
		return arrivallocation;
	}
	public FlightForm(String arrivallocation, String departurelocation, String flightdate, String flightclass,
			String outputpreference) {
		super();
		this.arrivallocation = arrivallocation;
		this.departurelocation = departurelocation;
		this.flightdate = flightdate;
		this.flightclass = flightclass;
		this.outputpreference = outputpreference;
	}
	
	public FlightForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightParam [arrivallocation=" + arrivallocation + ", departurelocation=" + departurelocation
				+ ", flightdate=" + flightdate + ", flightclass=" + flightclass + ", outputpreference="
				+ outputpreference + "]";
	}
	/**
	 * @param arrivinglocation the arrivinglocation to set
	 */
	public void setArrivallocation(String arrivallocation) {
		this.arrivallocation = arrivallocation;
	}
	/**
	 * @return the departurelocation
	 */
	public String getDeparturelocation() {
		return departurelocation;
	}
	/**
	 * @param departurelocation the departurelocation to set
	 */
	public void setDeparturelocation(String departurelocation) {
		this.departurelocation = departurelocation;
	}
	/**
	 * @return the flightdate
	 */
	public String getFlightdate() {
		return flightdate;
	}
	/**
	 * @param flightdate the flightdate to set
	 */
	public void setFlightdate(String flightdate) {
		this.flightdate = flightdate;
	}
	/**
	 * @return the flightclass
	 */
	public String getFlightclass() {
		return flightclass;
	}
	/**
	 * @param flightclass the flightclass to set
	 */
	public void setFlightclass(String flightclass) {
		this.flightclass = flightclass;
	}
	/**
	 * @return the outputpreference
	 */
	public String getOutputpreference() {
		return outputpreference;
	}
	/**
	 * @param outputpreference the outputpreference to set
	 */
	public void setOutputpreference(String outputpreference) {
		this.outputpreference = outputpreference;
	}
	
	
	
}
