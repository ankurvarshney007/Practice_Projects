package org.nagarro.Restwebservice.Services;

import java.util.List;

import org.nagarro.Restwebservice.Dao.UserRegistrationDao;
import org.nagarro.Restwebservice.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationDao userRegistrationDao;
	public User addUser(User user) {
		
		return userRegistrationDao.save(user);
	}
	public List<User> getUser() {
		return this.userRegistrationDao.findAll();
		
	}
}
