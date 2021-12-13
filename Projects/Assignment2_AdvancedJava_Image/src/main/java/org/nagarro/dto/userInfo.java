package org.nagarro.dto;
import java.util.List;

import javax.persistence.*;

@Entity
public class userInfo {
	@Id
	
	private String userID;
	private String password;
	@OneToMany(mappedBy="user")
	private List<Images> img ;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
