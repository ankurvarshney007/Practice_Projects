package org.nagarro.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.nagarro.model.HRUserParam;
import org.nagarro.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ForgetPasswordController {
	@Autowired
	private HRService hrservice;
	@RequestMapping(path="/forget")
	public String forget() {
		return "forgetPassword";
	}
	@RequestMapping(path="/forget" , method=RequestMethod.POST)
	public String forgetton(HttpServletResponse response, @ModelAttribute HRUserParam hruser) throws IOException {

		boolean result = this.hrservice.updatePassword(hruser);
		

		
		if(result) {
			return "loginPage";
		}
		else {
			return "forgetPassword";
		}

	}
}
