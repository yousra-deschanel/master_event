
package com.master.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.master.beans.Utilisateur;
import com.master.dao.DooFactory;
import com.master.dao.UtilisateurDoo;

@WebServlet("/SignUpProcess")
public class SignUpProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurDoo utilisateurDoo;

    public void init() throws ServletException {
    	DooFactory dooFactory = DooFactory.getInstance();
    	this.utilisateurDoo = dooFactory.getUtilisateurDoo();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("utilisateurs", utilisateurDoo.lister());
		this.getServletContext().getRequestDispatcher("/WEB-INF/Register.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		 Utilisateur utilisateur = new Utilisateur();
		utilisateur.setEmail(request.getParameter("email"));
		utilisateur.setPhone(request.getParameter("phone"));
		utilisateur.setType(request.getParameter("type"));
		utilisateur.setPassword(request.getParameter("password"));
		/*
		Users tableNoms = new Users();
		tableNoms.ajouterUtilisateur(utilisateur);
		utilisateurDoo.ajouter(utilisateur);
		*/
		
		
		request.setAttribute("utilisateurs", utilisateurDoo.lister());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/LoginInfo.jsp").forward(request, response);
		
		
	}

}
