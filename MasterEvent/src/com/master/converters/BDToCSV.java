package com.master.converters;

import java.io.*;
import java.sql.*;


public class BDToCSV {


	    public void converting(String fileName) {
	        String jdbcURL = "jdbc:mysql://localhost:3306/exo1Tp1?useSSL=false&serverTimezone=UTC";
	        String username = "root";
	        String password = "password";
	         
	        String csvFilePath = "C:/Users/DELL LATITUDE/Desktop/"+fileName;
	        

	        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
	            String sql = "SELECT * FROM AGENCE";
	             
	            Statement statement = connection.createStatement();
	             
	            ResultSet result = statement.executeQuery(sql);
	             
	            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(csvFilePath));
	             
	            // write header line containing column names       
	            fileWriter.write("Num_Agence, Nom, Ville, Actif ");
	             
	            while (result.next()) {
	                String Num_Agence = result.getString("Num_Agence");
	                String Nom = result.getString("Nom");
	                String Ville = result.getString("Ville");
	                String Actif = result.getString("Actif");
	                 
	     
	                String line = String.format("\"%s\",%s,%s,%s",Num_Agence, Nom, Ville, Actif);
	                 
	                fileWriter.newLine();
	                fileWriter.write(line);            
	            }
	             
	            statement.close();
	            fileWriter.close();
	            
	            System.out.println("worked");
	             
	        } catch (SQLException e) {
	            System.out.println("Datababse error:");
	            e.printStackTrace();
	        } catch (IOException e) {
	            System.out.println("File IO error:");
	            e.printStackTrace();
	        }
	         
	    }
	 
	}

