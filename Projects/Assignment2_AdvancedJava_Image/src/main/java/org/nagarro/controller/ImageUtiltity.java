package org.nagarro.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nagarro.dto.userInfo;
import org.nagarro.service.ImageService;
import org.nagarro.service.UserService;


@WebServlet("/ImageUtiltity")
public class ImageUtiltity extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserService() ;
	private ImageService imageService= new ImageService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		

		String userId=(String)request.getSession(false).getAttribute("userID");
		String password = (String)request.getSession(false).getAttribute("password");


		userInfo user = new userInfo();
		user.setPassword(password);
		user.setUserID(userId);
		String path = request.getParameter("image");
		


		
		PrintWriter out = response.getWriter();
		
		boolean result=this.imageService.addImage(path,user);
		

		if(result) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Image added');");
			out.println("location='imageUtility.jsp';");
			out.println("</script>");
			
		}
		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Image size more than 1MB or total size greater than 10MB');");
			out.println("location='imageUtility.jsp';");
			out.println("</script>");
			
			
		}

		
		
	}

}
