package org.nagarro.controller;

import java.text.ParseException;
import java.util.ArrayList;

import org.nagarro.model.FlightDetails;
import org.nagarro.service.FlightDetailsService;
import org.nagarro.userInput.FlightForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FlightDetailsController {
	@Autowired
	private FlightDetailsService flightDetailsService;
	@RequestMapping(path="/searchdetails" ,method= RequestMethod.POST)
	public String searchdetails(@ModelAttribute FlightForm flight,Model model) throws ParseException {
		ArrayList<FlightDetails> flightList=this.flightDetailsService.getAllFlightList(flight);
		model.addAttribute("flightList",flightList);
		return "FlightPage";
	}
}
