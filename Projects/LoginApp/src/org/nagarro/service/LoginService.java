package org.nagarro.service;

import java.util.HashMap;

import org.nagarro.dto.User;

public class LoginService {
	HashMap<String,String> users = new HashMap();
	public LoginService(){
		users.put("JohnDoe", "John Doe");
		users.put("janedoe", "Jane Doe");
		users.put("Jguru", "Java Guru");
	}
	public boolean Authenticate(String username, String password) {
		if(password== null || password.trim()=="") {
			return false;
		}
		return true;
	}
	public User getUsername(String userId) {
		User u = new User();
		u.setUserName(users.get(userId));
		u.setUserId(userId);
		//return users.get(userId);
		return u;
	}
}
