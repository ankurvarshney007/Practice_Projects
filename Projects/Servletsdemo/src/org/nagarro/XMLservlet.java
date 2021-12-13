package org.nagarro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class XMLservlet
 */
//@WebServlet(name = "XMLservle", urlPatterns = { "/XMLservleths" })
//We are goinf to xml deployments descriptor insted of annotattion
public class XMLservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String user = request.getParameter("userName");
		out.println("Hey get "+user);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text");
		PrintWriter out = response.getWriter();

		String usern = request.getParameter("userName");
		String user1 = request.getParameter("FullName");
		out.println("Hey from post method2 "+usern+ " We know your full name "+user1);
		//out.println("\n");
		//doGet(request, response);
		String prof = request.getParameter("prof");
		out.println("Your profesion is "+prof);
		//only get one parameter not get mulitple values
		String location =request.getParameter("location");
		String[] loc = request.getParameterValues("location");
		HttpSession session = request.getSession();
		session.setAttribute("SavedUserName", usern);
		out.println("Request prameter has values "+ usern);
		out.println("session prameter has values "+ (String)session.getAttribute("SavedUserName"));
		
		/*out.print("you are at "+loc.length);
		for(String l : loc){
			out.println(l);
		}*/


	}
	//difference b/w post and get method is that get method also refley paramenter in url 
	//but in post method url doesnt chnage it query of submit button passes as request mathod 

}
