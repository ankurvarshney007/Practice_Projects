package org.nagarro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.nagarro.service.UserService;

/**
 * Servlet implementation class forgetPassword
 */
@WebServlet("/forgetPassword")
public class ForgetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService = new UserService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userID");
		String confirm = request.getParameter("confirm");
		
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		
		if(password.equals(confirm)) {
			
			this.userService.forgetPassword( userId,  password);
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Password updated');");
			out.println("location='loginPage.jsp';");
			out.println("</script>");
			
			
		}
		else {
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('User or password incorrect');");
			   out.println("location='forgetPassword.jsp';");
			   out.println("</script>");
			
		}
	}

}
