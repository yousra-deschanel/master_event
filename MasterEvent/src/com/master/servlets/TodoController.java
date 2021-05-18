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

import com.master.dao.EventDao;
import com.master.dao.EventDaoImpl;
import com.master.beans.Event;





@WebServlet("/")
public class TodoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EventDao eventDAO;

	public void init() {
		eventDAO = new EventDaoImpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertTodo(request, response);
				break;
			case "/delete":
				deleteTodo(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateTodo(request, response);
				break;
			case "/list":
				listTodo(request, response);
				break;
			default:
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/LoginPage.jsp");
				dispatcher.forward(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listTodo(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Event> listTodo = eventDAO.selectAllEvents();
		request.setAttribute("listTodo", listTodo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/eventsList.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Formulaire.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Event existingTodo = eventDAO.selectEvent(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Formulaire.jsp");
		request.setAttribute("todo", existingTodo);
		dispatcher.forward(request, response);

	}

	private void insertTodo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String event_title = request.getParameter("event_title");
		String event_type = request.getParameter("event_type");
		String description = request.getParameter("description");
		String start_date = request.getParameter("start_date");
		String end_date = request.getParameter("end_date");
	
    	
		Event newEvent = new Event(event_title, event_type, description, start_date, end_date);
		eventDAO.insertEvent(newEvent);
		response.sendRedirect("list");
	}
	private void updateTodo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		String event_title = request.getParameter("event_title");
		String event_type = request.getParameter("event_type");
		String description = request.getParameter("description");
		String start_date = request.getParameter("start_date");
		String end_date = request.getParameter("end_date");

		
		Event updateEvent = new Event(id, event_title, event_type, description, start_date, end_date );
		eventDAO.updateEvent(updateEvent);
		
		response.sendRedirect("list");
	}




	private void deleteTodo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		eventDAO.deleteEvent(id);
		response.sendRedirect("list");
	}
}
