package com.master.bdd;

import java.sql.*;
import java.util.*;
import com.master.beans.*;


public class Noms {
	private Connection connexion ;
	public Object recupererUtilisateurs() {
		 List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		

		
		Statement statement = null;
		ResultSet resultat = null;
		
		loadDatabase();
		
		try {	      
	        // Used to issue queries to the DB
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee?useSSL=false&serverTimezone=UTC", "root","password");
	        
	        // Sends queries to the DB for results
	         statement = connexion.createStatement();
	        
	    
	        // Execute the Query
	  
	        resultat = statement.executeQuery("SELECT nom,prenom FROM noms;");
	        
	        

	        while(resultat.next()){
	        	String nom = resultat.getString("nom");
	        	String prenom = resultat.getString("prenom");
	        	

	        	Utilisateur utilisateur  = new Utilisateur ();
	        	utilisateur.setNom(nom);
	        	utilisateur.setPrenom(prenom);
	        	
	        	
	        	utilisateurs.add(utilisateur);
	        }
	        }
	        catch (SQLException e) {
	        	e.printStackTrace();
	        	
			}finally {
				try{	if(resultat != null)
							resultat.close();
						if(statement != null)
							statement.close();
						if(connexion != null)
							connexion.close();
				
			}catch(SQLException ignore) {}
				
			
			}	
			
		return utilisateurs;
		
	}

	private void loadDatabase() {
		try {
			// charging the driver
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		try {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee?useSSL=false&serverTimezone=UTC", "root","password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	public void ajouterUtilisateur(Utilisateur utilisateur) {
		loadDatabase();
		try {
			PreparedStatement preparedStatement  = connexion.prepareStatement("insert into noms(nom ,prenom) values(?, ?);");
			preparedStatement.setString(1,utilisateur.getNom());
			preparedStatement.setString(2,utilisateur.getPrenom());
		
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
