package org.nagarro.Restwebservice.Services;

import java.util.List;

import org.nagarro.Restwebservice.Entities.User;

public interface UserRegistrationService {

	public User addUser(User user);
	public List<User> getUser();
}
