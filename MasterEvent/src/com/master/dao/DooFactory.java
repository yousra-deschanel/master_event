package com.master.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DooFactory {
	private static String url;
	private static String username;
	private static String password;

	DooFactory(String url, String username, String password){
		this.url = url;
		this.username = username;
		this.password = password;
		
	}
	public static DooFactory getInstance() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DooFactory instance = new DooFactory("jdbc:mysql://localhost:3306/javaee?useSSL=false&serverTimezone=UTC", "root","password");
		return instance;
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
	//recuperation du dao
	public UtilisateurDoo getUtilisateurDoo() {
		return new UtilisateurDaoImpl(this);
	}

}
