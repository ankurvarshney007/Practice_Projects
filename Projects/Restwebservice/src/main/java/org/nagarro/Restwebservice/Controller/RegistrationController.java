package org.nagarro.Restwebservice.Controller;

import java.util.List;

import org.nagarro.Restwebservice.Entities.User;
import org.nagarro.Restwebservice.Services.UserRegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	
	@Autowired
	private UserRegistrationService userRegistrationService;
	
	@PostMapping("/registration")
	public User registration(@RequestBody User user) {
        return this.userRegistrationService.addUser(user);
		
	}
	
	@GetMapping("/getuser")
	public List<User> getUser() {
	return this.userRegistrationService.getUser();

	}
}
