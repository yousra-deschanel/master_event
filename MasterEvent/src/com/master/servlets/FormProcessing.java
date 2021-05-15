
package com.master.servlets;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.master.bdd.Event;
import com.master.bdd.Noms;
import com.master.beans.Evenement;
import com.master.beans.Utilisateur;


@WebServlet("/FormProcessing")
public class FormProcessing extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       

    public FormProcessing() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Formulaire.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Evenement evenement = new Evenement();
		
		//evenement.setEvent_title(request.getParameter("id"));
		evenement.setEvent_title(request.getParameter("event_title"));
    	evenement.setEvent_type(request.getParameter("event_type"));
    	evenement.setDescription(request.getParameter("description"));
    	evenement.setStart_date(request.getParameter("start_date"));
    	evenement.setEnd_date(request.getParameter("end_date"));
    	evenement.setCountry(request.getParameter("country"));
		
		Event tableEvenements = new Event();
		tableEvenements.ajouterEvenement(evenement);
		
		request.setAttribute("evenements", tableEvenements.recupererEvenements());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Table.jsp").forward(request, response);
	}

}

