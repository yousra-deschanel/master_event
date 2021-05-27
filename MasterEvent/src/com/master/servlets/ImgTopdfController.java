package com.master.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.DocumentException;
import com.master.converters.MultipleImagesToPdf;

 
@WebServlet("/ImgTopdfController")
public class ImgTopdfController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ImgTopdfController() {
        super();
        
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/ImgToPdfConverter.jsp").forward(request, response);


		
	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			convert(request, response);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}


	private void convert(HttpServletRequest request, HttpServletResponse response) throws IOException, DocumentException {
		String destination = request.getParameter("destination");
		String name = request.getParameter("name");
		String sourcePath = request.getParameter("sourcePath");
		
		MultipleImagesToPdf converter = new MultipleImagesToPdf();
		converter.imagesToPdf(destination, name, sourcePath);
		
		response.getWriter().append("image converted Successfully!").append(request.getContextPath());
		
		
	
	}
	

}
