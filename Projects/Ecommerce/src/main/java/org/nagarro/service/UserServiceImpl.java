package org.nagarro.service;

import org.nagarro.dao.UserDao;
import org.nagarro.dao.UserDaoImpl;
import org.nagarro.entities.User;


public class UserServiceImpl implements UserService {
	
	private UserDao userDao = new UserDaoImpl();
	public boolean authenticateUser(String email , String password) {
		
		User user = this.userDao.getUserByEmailAndPassword(email , password );
		if(user!=null) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
		
	}
	
	
}
