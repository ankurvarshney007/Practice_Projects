package org.nagarro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nagarro.service.SignupService;
import org.nagarro.service.SignupServiceImp;


public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SignupService signupService = new SignupServiceImp();
       
   
    public SignupServlet() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("name");
		String userpassword = request.getParameter("password");
		String useremail = request.getParameter("email");
		String userphone = request.getParameter("phone");
		String useraddr = request.getParameter("addr");
		
		System.out.println(username + ' ' + userpassword + ' ' + useremail + ' ' + userphone + ' ' + useraddr);
		
		this.signupService.Signup(username,userpassword,useremail,userphone,useraddr);
	}

}
