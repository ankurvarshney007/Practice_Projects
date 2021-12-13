package org.nagarro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nagarro.dto.Images;
import org.nagarro.dto.userInfo;
import org.nagarro.service.ImageService;

/**
 * Servlet implementation class editImage
 */
@WebServlet("/editImage")
public class EditImage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ImageService imageService = new ImageService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName= request.getParameter("fileName");
		HttpSession sess = request.getSession();
		String id = (String)sess.getAttribute("image_s.NO");
		int imageId = Integer.parseInt(id);
		
		this.imageService.editImageName(imageId, fileName);
		response.sendRedirect("imageUtility.jsp");
	}

}
