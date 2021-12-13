package org.nagarro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class HRUser {
	@Id
	private String username;
	private String password;
	public HRUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public HRUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	
}
