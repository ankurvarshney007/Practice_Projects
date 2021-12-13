package org.nagarro.model;







public class Employee {
	
	private int employeeCode;
	private String employeeName;
	private String employeeLocation;
	private String employeeEmail;
	private String employeeDOB;
	
	
	public Employee(int employeeCode, String employeeName, String employeeLocation, String employeeEmail,
			String employeeDOB) {
		super();
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.employeeLocation = employeeLocation;
		this.employeeEmail = employeeEmail;
		this.employeeDOB = employeeDOB;
	}
	
	
	public Employee() {
		super();
		
	}


	/**
	 * @return the employeeCode
	 */
	public int getEmployeeCode() {
		return employeeCode;
	}
	/**
	 * @param employeeCode the employeeCode to set
	 */
	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeeLocation
	 */
	public String getEmployeeLocation() {
		return employeeLocation;
	}
	/**
	 * @param employeeLocation the employeeLocation to set
	 */
	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}
	/**
	 * @return the employeeEmail
	 */
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	/**
	 * @param employeeEmail the employeeEmail to set
	 */
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	/**
	 * @return the employeeDOB
	 */
	public String getEmployeeDOB() {
		return employeeDOB;
	}
	/**
	 * @param employeeDOB the employeeDOB to set
	 */
	public void setEmployeeDOB(String employeeDOB) {
		this.employeeDOB = employeeDOB;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", employeeLocation="
				+ employeeLocation + ", employeeEmail=" + employeeEmail + ", employeeDOB=" + employeeDOB + "]";
	}
	
	
}
