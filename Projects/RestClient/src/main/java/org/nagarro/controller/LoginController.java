package org.nagarro.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.nagarro.model.Employee;
import org.nagarro.model.HRUser;
import org.nagarro.model.HRUserParam;
import org.nagarro.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
public class LoginController {
	@Autowired
	private HRService hrservice;
	
	
	
	@ModelAttribute
	public void common(Model model) {
		model.addAttribute("LHeader", "HR Manager Login");
		model.addAttribute("Header", "Employee Management");
		model.addAttribute("Footer", "© 2020 Copyright: Nagarro");
	}
	@RequestMapping("/")
	public String home() {
		return "loginPage";
	}


	@RequestMapping(path = "/login" , method = RequestMethod.POST)
	public String login(@ModelAttribute HRUser hruser,HttpServletRequest request,Model model)  {
		boolean result = this.hrservice.authenticate(hruser);
		model.addAttribute("result", result);
		if(result) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", hruser.getUsername());
			return "emplist";
		}
		else {
			return "loginPage";
		}
	}
	
	
	
	
	
}
