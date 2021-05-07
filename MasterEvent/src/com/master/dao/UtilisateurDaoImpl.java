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
			preparedStatement  = connexion.prepareStatement("insert into noms(nom ,prenom) values(?, ?);");
			preparedStatement.setString(1,utilisateur.getNom());
			preparedStatement.setString(2,utilisateur.getPrenom());
		
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
			connexion = DooFactory.getConnection();
			statement = connexion.createStatement();
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
	
}
