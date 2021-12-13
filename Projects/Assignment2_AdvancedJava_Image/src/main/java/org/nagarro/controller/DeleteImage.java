package org.nagarro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nagarro.dto.Images;
import org.nagarro.dto.userInfo;
import org.nagarro.service.ImageService;


@WebServlet("/deleteImage")
public class DeleteImage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ImageService imageService = new ImageService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("image_s.NO");
		int imageId = Integer.parseInt(id);
		boolean result =this.imageService.delete(imageId);
		
		PrintWriter out = response.getWriter();
		if(result) {
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Image Deleted');");
		out.println("location='imageUtility.jsp';");
		out.println("</script>");
		}
		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Image can't be deleted ');");
			out.println("location='imageUtility.jsp';");
			out.println("</script>");
		}
		
	}

}
