package org.nagarro.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.nagarro.model.Employee;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
@Controller
public class EmployeesController {
	private final String url = "http://localhost:4000/";
	@RequestMapping("/employees")
	public String getEmployees(Model  model) {
		HttpHeaders headers= new HttpHeaders();
		RestTemplate restTemplate = new RestTemplate();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Object> entity = new HttpEntity<Object>(headers);
		final String uri = url+"employee";

		ResponseEntity<Employee[]> response = restTemplate.exchange(uri, HttpMethod.GET, entity, Employee[].class);


		Employee emp[]=response.getBody();
		model.addAttribute("emplList", emp);

		return "emplist";
	}
	
	@RequestMapping(path="/upload")
	public String upload() {
		return "addEmployee";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(@ModelAttribute Employee emp) {
		 HttpHeaders headers= new HttpHeaders();
		  RestTemplate restTemplate = new RestTemplate();
		  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		  HttpEntity<Object> entity = new HttpEntity<Object>(emp,headers);
		  final String uri = url+"employee";
		    
		  ResponseEntity<Employee> response = restTemplate.exchange(uri, HttpMethod.POST, entity, Employee.class);
		    
       System.out.println(response.getBody());
		  
		return "emplist";
	}
	@RequestMapping("/delete")
	public String deleteEmployee(HttpServletRequest request) {
		String eid=request.getParameter("emp_code");
		
		  HttpHeaders headers= new HttpHeaders();
		  RestTemplate restTemplate = new RestTemplate();
		  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		  HttpEntity<Object> entity = new HttpEntity<Object>(headers);
		  final String uri = url+"employee/" + eid;
		  
		  
		  ResponseEntity<Employee> response = restTemplate.exchange(uri, HttpMethod.DELETE, entity, Employee.class);
		
			
		return "emplist";
	}
	
	@RequestMapping(path="/edit")
	public String edit(HttpServletRequest request , Model model) {
		model.addAttribute("eid", request.getParameter("emp_code"));
		return "editdetails";
	}
	
	@RequestMapping("/updateemployee")
	public String updateEmployeeDetails(@ModelAttribute Employee emp) {
		HttpHeaders headers= new HttpHeaders();
		  RestTemplate restTemplate = new RestTemplate();
		  headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		  HttpEntity<Object> entity = new HttpEntity<Object>(emp,headers);
		  final String uri = url+"employee";
		    
		  ResponseEntity<Employee> response = restTemplate.exchange(uri, HttpMethod.PUT, entity, Employee.class);
		    
     
		  
		return "emplist";
	}
}
