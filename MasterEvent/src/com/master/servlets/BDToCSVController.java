package com.master.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.master.converters.BDToCSV;


/**
 * Servlet implementation class BDToCSVController
 */
@WebServlet("/BDToCSVController")
public class BDToCSVController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BDToCSVController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/BDToCSV.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		convert(request, response);
	}

	private void convert(HttpServletRequest request, HttpServletResponse response) {
		String csvFileName = request.getParameter("csv");
	
		BDToCSV converter = new BDToCSV();
		
			converter.converting(csvFileName);
	
		
		try {
			response.getWriter().append("database converted to a csv file Successfully!").append(request.getContextPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
