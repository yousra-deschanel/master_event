package com.master.servlets;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;

import com.itextpdf.text.DocumentException;
import com.master.converters.JsonToXml;
import com.master.converters.MultipleImagesToPdf;

/**
 * Servlet implementation class JsonToXmlController
 */
@WebServlet("/JsonToXmlController")
public class JsonToXmlController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonToXmlController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/JsonToXmlConverter.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			convert(request, response);
	
	}

	private void convert(HttpServletRequest request, HttpServletResponse response) {
		String input = "C:/Users/DELL LATITUDE/Desktop/"+request.getParameter("input");
		String output = "C:/Users/DELL LATITUDE/Desktop/"+request.getParameter("output");
		
		
		JsonToXml converter = new JsonToXml();
		try {
			converter.convertJsonToXml(input, output);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			response.getWriter().append("json file converted Successfully!").append(request.getContextPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
