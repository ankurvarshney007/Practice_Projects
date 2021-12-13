package org.nagarro.service;

import org.nagarro.dao.UserDao;
import org.nagarro.model.User;
import org.nagarro.userInput.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public boolean authenticate(User user ) {
		User user1=userDao.getUser(user.getUsername());
		
		if(user1!=null && user1.getPassword().equalsIgnoreCase(user.getPassword())) {
			return true;
		}
		else {
			return false;
		}
	}
	@Transactional
	public boolean updatePassword(UserForm user) {
		if(user.getPassword().equals(user.getConfirmPassword())) {
			this.userDao.update(user);
			return true;
		}
		else {
			return false;
		}
	}
}
