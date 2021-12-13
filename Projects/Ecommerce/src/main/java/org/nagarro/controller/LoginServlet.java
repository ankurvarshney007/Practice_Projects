package org.nagarro.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nagarro.service.UserService;
import org.nagarro.service.UserServiceImpl;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserService userService = new UserServiceImpl(); 
    
    public LoginServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(email + ' ' + password);
		boolean result = this.userService.authenticateUser(email, password);
		
		if(result) {
			response.sendRedirect("signup.jsp");
		}
		
		else {
			response.sendRedirect("login.jsp");
		}
		
	}

}
