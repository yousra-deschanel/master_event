package com.master.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.master.bdd.DatabaseConnection;
import com.master.bdd.Noms;
import com.master.beans.Utilisateur;
import com.master.dao.DooFactory;
import com.master.dao.UtilisateurDoo;


@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
        private UtilisateurDoo utilisateurDoo ;
        
        public void init() throws ServletException{
        	DooFactory dooFactory = DooFactory.getInstance();
        	this.utilisateurDoo = dooFactory.getUtilisateurDoo();
        }
        

    public LoginProcess() {
        super();}

/*
        public void init() throws ServletException {
        	DooFactory dooFactory = DooFactory.getInstance();
        	this.utilisateurDoo = dooFactory.getUtilisateurDoo();
        	
        	
        }*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Noms tableNoms = new Noms();
		request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/LoginPage.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom(request.getParameter("nom"));
		utilisateur.setPrenom(request.getParameter("prenom"));
		/*
		Noms tableNoms = new Noms();
		tableNoms.ajouterUtilisateur(utilisateur);*/
		
		utilisateurDoo.ajouter(utilisateur);
		
		//request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
		request.setAttribute("utilisateurs",utilisateurDoo.lister());
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Formulaire.jsp").forward(request, response);
	}

}
