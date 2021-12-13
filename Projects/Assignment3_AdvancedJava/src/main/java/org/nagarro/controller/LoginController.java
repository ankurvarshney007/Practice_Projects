package org.nagarro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.nagarro.model.FlightDetails;
import org.nagarro.model.User;
import org.nagarro.service.FlightDetailsService;
import org.nagarro.service.UserService;
import org.nagarro.userInput.FlightForm;
import org.nagarro.userInput.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private FlightDetailsService flightDetailsService;
	@RequestMapping("/")
	public String home() {
		return "loginPage";
	}
	@RequestMapping(path ="/login", method = RequestMethod.POST)
	public String login(@ModelAttribute User user,Model model) {
		
		boolean result =userService.authenticate(user);
		if(result) {
			
			this.flightDetailsService.CSVFileReader();
			
			model.addAttribute("flightList");
			return "FlightPage";
		}
		else {
			return "loginPage";
		}
	}
	
	
	
	
}
