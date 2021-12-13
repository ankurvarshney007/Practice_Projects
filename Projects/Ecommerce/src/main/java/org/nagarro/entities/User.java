package org.nagarro.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(length=25)
	private String userName;
	
	@Column(length=20)
	private String userPassword;
	
	@Column(unique=true,length=30)
	private String userEmail;
	
	@Column(unique=true,length=10)
	
	private String userPhone;
	
	private String userAddress;
	
	private String userType;

	public User() {
		super();
		
	}

	public User(int userId, String userName, String userPassword, String userEmail, String userPhone,
			String userAddress, String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.userType = userType;
	}
	

	
	public User(String userName, String userPassword, String userEmail, String userPhone, String userAddress,
			String userType) {
		
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + ", userPhone=" + userPhone + ", userAddress=" + userAddress + ", userType=" + userType
				+ "]";
	}

	
	public int getUserId() {
		return userId;
	}

	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	public String getUserName() {
		return userName;
	}

	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public String getUserPassword() {
		return userPassword;
	}

	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	
	public String getUserPhone() {
		return userPhone;
	}

	
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	
	public String getUserAddress() {
		return userAddress;
	}

	
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	
	public String getUserType() {
		return userType;
	}

	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	
	
	
	
	
}
