package org.nagarro.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.nagarro.service.UserService;
import org.nagarro.userInput.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ForgetPasswordController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/forget")
	public String forget() {
		return "forget";
	}
	@RequestMapping(path="/forget" , method=RequestMethod.POST)
	public String forgetton(HttpServletResponse response, @ModelAttribute UserForm user) throws IOException {
		
		boolean result = this.userService.updatePassword(user);
		
		if(result) {
			return "loginPage";
		}
		else {
			return "forget";
		}
		
	}
}
