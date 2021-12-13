package org.nagarro.service;

import org.nagarro.dao.UserDao;
import org.nagarro.dto.userInfo;

public class UserService {
	private UserDao userDao = new UserDao() ;
	
	public boolean Authenticate(String userID, String password) {
		userInfo user  = this.userDao.getUser(userID, password);
		if(user!=null && user.getPassword().equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void forgetPassword(String userId,String password) {
		this.userDao.updatePassword(userId, password);
	}
}
