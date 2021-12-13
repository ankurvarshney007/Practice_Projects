package org.nagarro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nagarro.dto.User;
import org.nagarro.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username,password;
		username= request.getParameter("userID");
		password = request.getParameter("password");
		LoginService log = new LoginService();
		boolean result = log.Authenticate(username, password);
		if(result) {
			User user = log.getUsername(username);
			//request.setAttribute("user", user);
			request.getSession().setAttribute("user",user);
			//response.sendRedirect("Success.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Success.jsp");
			dispatcher.forward(request,response);
			return;
		}
		else {
			response.sendRedirect("Loginjsp.jsp");
		}

	}

}
