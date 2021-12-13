package org.nagarro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.nagarro.dto.Images;
import org.nagarro.service.ImageService;
import org.nagarro.service.UserService;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private UserService userService = new UserService();
	private ImageService imageService = new ImageService();


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userID");
		String password = request.getParameter("password");
		UserService userService = new UserService();
		boolean result = userService.Authenticate(userId, password);
		PrintWriter out = response.getWriter();

		if(result) {


			HttpSession sess = request.getSession();

			sess.setAttribute("userID", userId);
			ArrayList<Images> img=this.imageService.getImages(userId, password)		;	
			sess.setAttribute("data", img);
			
			response.sendRedirect("imageUtility.jsp");



		}

		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Password Incorrect');");
			out.println("location='loginPage.jsp';");
			out.println("</script>");

		}



	}

}
