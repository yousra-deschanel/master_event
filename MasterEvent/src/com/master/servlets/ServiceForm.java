package com.master.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.master.beans.Service;
import com.master.dao.ServiceDao;
import com.master.dao.ServiceDaoImpl;


@WebServlet("/ServiceForm")
public class ServiceForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceDao serviceDAO;

	public void init() {
		serviceDAO = new ServiceDaoImpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		switch (action) {
		case "/newService":
			showNewServiceForm(request, response);
			break;
		case "/insertService":
			insertService(request, response);
			break;
		case "/deleteService":
			try {
				deleteService(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/editService":
			showEditServiceForm(request, response);
			break;
		case "/updateService":
			updateService(request, response);
			break;
		case "/listServices":
			listServices(request, response);
			break;
		default:
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/FormulaireService.jsp");
			dispatcher.forward(request, response);
			break;
		}
	}

	private void listServices(HttpServletRequest request, HttpServletResponse response) {
		List<Service> listService = serviceDAO.selectAllServices();
		request.setAttribute("listService", listService);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/servicelist.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void updateService(HttpServletRequest request, HttpServletResponse response) {
	
		int service_id =Integer.parseInt(request.getParameter("service_id"));
		String service_name  = request.getParameter("service_name");
    	String domain = request.getParameter("domain");
    	String  input_type  = request.getParameter("input_type");
    	long number_of_inputs  = Integer.parseInt(request.getParameter("number_of_inputs"));
    	String inputs = request.getParameter("inputs");
    	String  output_type  = request.getParameter("output_type");
    	long number_of_outputs  = Integer.parseInt(request.getParameter("number_of_outputs"));
    	String outputs = request.getParameter("outputs");

		
		Service updatedService = new Service(service_id, service_name, domain, input_type, number_of_inputs ,inputs, output_type ,number_of_outputs, outputs );
		try {
			serviceDAO.updateService(updatedService);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			response.sendRedirect("listServices");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void showEditServiceForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int service_id = Integer.parseInt(request.getParameter("service_id"));
		Service existingService = serviceDAO.selectService(service_id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Formulaire.jsp");
		request.setAttribute("service", existingService);
		dispatcher.forward(request, response);

	}

	private void deleteService(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		serviceDAO.deleteService(id);
		response.sendRedirect("listServices");
		
	}

	private void insertService(HttpServletRequest request, HttpServletResponse response) {
 
		String service_name  = request.getParameter("service_name");
    	String domain = request.getParameter("domain");
    	String  input_type  = request.getParameter("input_type");
    	long number_of_inputs  = Integer.parseInt(request.getParameter("number_of_inputs"));
    	String inputs = request.getParameter("inputs");
    	String  output_type  = request.getParameter("output_type");
    	long number_of_outputs  = Integer.parseInt(request.getParameter("number_of_outputs"));
    	String outputs = request.getParameter("outputs");

	
    	
    	Service newService = new Service( service_name, domain, input_type, number_of_inputs ,inputs, output_type ,number_of_outputs, outputs );
		try {
			serviceDAO.insertService(newService);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			response.sendRedirect("listServices");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void showNewServiceForm(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/FormulaireService.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



 

}
