package org.nagarro.dao;

import org.nagarro.entities.User;

public interface UserDao {
	
	public User getUserByEmailAndPassword(String email, String password);
}
