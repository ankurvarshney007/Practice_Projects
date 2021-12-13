package org.nagarro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//http://localhost:8080/Servletsdemo/ServletsPath
// in this url ServletDemo is context root which we speicfy while creaitng projwct//
//ServletsPath is url mapping whuch is used by tomcat server to find which class to run
/**
 * Servlet implementation class Servlets
 */
@WebServlet(urlPatterns= {"/ServletsPath"},initParams= {@WebInitParam(name = "defaultUser", value="John Due")})
public class Servlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//This will be printed in tomcat log without  response.getWriter mehtof
		System.out.println("Hello from get method");
		String usern = request.getParameter("userName");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		//writer.println("<h3>Hello in getWritr</h3>");
		HttpSession session = request.getSession();
		//this will store parametere if we also changing browser
		ServletContext context = request.getServletContext();
		if(usern!="" && usern!=null) {
			session.setAttribute("SavedUserName", usern);
			context.setAttribute("SavedUserName", usern);
		}
		out.println("Request prameter has values "+ usern);
		out.println("session prameter has values "+ (String)session.getAttribute("SavedUserName"));
		out.println("Context praramemter is "+ (String)context.getAttribute("SavedUserName"));
		out.println(this.getServletConfig().getInitParameter("defaultUser"));
	}
}
