
/*
package com.master.bdd;

import java.sql.*;
import java.util.*;
import com.master.beans.*;


public class Users {
	private Connection connexion ;
	public Object recupererUtilisateurs() {
		 List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		

		
		Statement statement = null;
		ResultSet resultat = null;
		
		loadDatabase();
		
		try {	      
	       
	        
	        // Sends queries to the DB for results
	         statement = connexion.createStatement();
	        
	    
	        // Execute the Query
	  
	        resultat = statement.executeQuery("SELECT email, phone , type, password FROM users;");
	        
	        

	        while(resultat.next()){
	        	String email = resultat.getString("email");
	        	String phone = resultat.getString("phone");
	        	String type = resultat.getString("type");
	        	String password = resultat.getString("password");

	        	Utilisateur utilisateur  = new Utilisateur ();
	        	utilisateur.setEmail(email);
	        	utilisateur.setPhone(phone);
	        	utilisateur.setEmail(type);
	        	utilisateur.setPhone(password);
	        	
	        	
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
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login?useSSL=false&serverTimezone=UTC", "root","password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	public void ajouterUtilisateur(Utilisateur utilisateur) {
		loadDatabase();
		try {
			PreparedStatement preparedStatement1  = connexion.prepareStatement("insert into users(id, email, phone , type, password) values(null, \"BOB@gmail.com\",\"44444\" ,\"Client\",\"erqer\");");
			PreparedStatement preparedStatement  = connexion.prepareStatement("insert into users(id, email,phone , type, password) values(null, ?,? ,?,?);");
			preparedStatement.setString(1,utilisateur.getEmail());
			preparedStatement.setString(2,utilisateur.getPhone());
			preparedStatement.setString(3,utilisateur.getType());
			preparedStatement.setString(4,utilisateur.getPassword());
		
			preparedStatement.executeUpdate();
			preparedStatement1.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
*/