package com.master.bdd;
import java.sql.*;
import java.util.*;
import com.master.beans.*;

public class Event {
	private Connection connexion ;
	public List<Evenement> recupererEvenements() {
		List<Evenement> evenements = new ArrayList<Evenement>();
		
		Statement statement = null;
		ResultSet resultat = null;
		
		loadDatabase();
		
		try {	      
	        // Used to issue queries to the DB
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Master?useSSL=false&serverTimezone=UTC", "root","password");
	        
	        // Sends queries to the DB for results
	         statement = connexion.createStatement();
	        
	    
	        // Execute the Query
	  
	        resultat = statement.executeQuery("select event_title, event_type, description, start_date, end_date , country  from evenement;");
	        
	        

	        while(resultat.next()){
	        	String event_title = resultat.getString("event_title");
	        	String event_type = resultat.getString("event_type");
	        	String description = resultat.getString("description");
	        	String start_date = resultat.getString("start_date");
	        	String end_date= resultat.getString("end_date");
	        	String country = resultat.getString("country");

	        	Evenement evenement  = new Evenement ();
	        	evenement.setEvent_title(event_title);
	        	evenement.setEvent_type(event_type);
	        	evenement.setDescription(description);
	        	evenement.setStart_date(start_date);
	        	evenement.setEnd_date(end_date);
	        	evenement.setCountry(country);
	        	
	        	evenements.add(evenement);
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
			
		
		
		
		
		
		
		return evenements;
		
	
	
	}
	private void loadDatabase() {
		try {
			// charging the driver
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		try {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Master?useSSL=false&serverTimezone=UTC", "root","password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void ajouterEvenement(Evenement evenement) {
		loadDatabase();
		try {
			PreparedStatement preparedStatement  = connexion.prepareStatement("insert into evenement(event_title, event_type, description, start_date, end_date , country ) values(?, ?, ?, ?, ?, ?);");
			preparedStatement.setString(1,evenement.getEvent_title());
			preparedStatement.setString(2,evenement.getEvent_type());
			preparedStatement.setString(3,evenement.getDescription());
			preparedStatement.setString(4,evenement.getStart_date());
			preparedStatement.setString(5,evenement.getEnd_date());
			preparedStatement.setString(6,evenement.getCountry());
		
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
