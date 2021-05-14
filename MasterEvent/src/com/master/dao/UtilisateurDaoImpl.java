package com.master.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.master.beans.*;

public class UtilisateurDaoImpl implements UtilisateurDoo {
	private DooFactory dooFactory ;
    
	UtilisateurDaoImpl(DooFactory dooFactory){
		this.dooFactory = dooFactory;
	}
	Connection connexion = null;
	@Override
	public void ajouter(Utilisateur utilisateur) {
		
		PreparedStatement preparedStatement = null;
		
		try {
			connexion = dooFactory.getConnection();
			preparedStatement  = connexion.prepareStatement("insert into users(id, email,phone , type, password) values(null, ?,? ,?,?);");
			preparedStatement.setString(1,utilisateur.getEmail());
			preparedStatement.setString(2,utilisateur.getPhone());
			preparedStatement.setString(3,utilisateur.getType());
			preparedStatement.setString(4,utilisateur.getPassword());
		
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Utilisateur> lister() {
		List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;
		
		try {
			connexion = dooFactory.getConnection();
			statement = connexion.createStatement();
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
	
}
