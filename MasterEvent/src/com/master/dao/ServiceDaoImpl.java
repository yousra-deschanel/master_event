package com.master.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.master.beans.Service;
import com.master.bdd.JDBCUtils;


public class ServiceDaoImpl implements ServiceDao {

	private static final String INSERT_SERVICE_SQL = "INSERT INTO service (service_name, domain, input_type, number_of_inputs ,inputs, output_type ,number_of_outputs, outputs ) VALUES(?, ?,?, ?, ??, ?, ?);";
	private static final String SELECT_SERVICE_BY_ID = "select service_id, service_name, domain, input_type, number_of_inputs ,inputs, output_type ,number_of_outputs, outputs from service where service_id =?";
	private static final String SELECT_ALL_SERVICES = "select * from service";
	private static final String DELETE_SERVICE_BY_ID = "delete from service where service_id = ?;";
	private static final String UPDATE_SERVICE = "update service set service_name= ?, domain= ?, input_type= ?, number_of_inputs= ? ,inputs= ?, output_type= ? ,number_of_outputs= ?, outputs= ? where id = ?;";

	public ServiceDaoImpl() {
	}

	
	@Override
	public void insertService(Service service) throws SQLException {
		System.out.println(INSERT_SERVICE_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SERVICE_SQL)) {
			 
			preparedStatement.setString(1,service.getService_name());
			preparedStatement.setString(2,service.getDomain());
			preparedStatement.setString(3,service.getInput_type());
			preparedStatement.setLong(4,service.getNumber_of_inputs());
			preparedStatement.setString(5,service.getInputs());
			preparedStatement.setString(6,service.getOutput_type());
			preparedStatement.setLong(7,service.getNumber_of_outputs());
			preparedStatement.setString(8,service.getOutputs());
			
			
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		
	}

	@Override
	public Service selectService(int serviceId) {
		Service service = null;
		// Step 1: Establishing a Connection
		try (Connection connection = JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SERVICE_BY_ID);) {
			preparedStatement.setLong(1, serviceId);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet resultat = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (resultat.next()) {
				int service_id = resultat.getInt("service_id");
				String service_name  = resultat.getString("service_name");
	        	String domain = resultat.getString("domain");
	        	String  input_type  = resultat.getString("input_type");
	        	long number_of_inputs  = resultat.getLong("number_of_inputs");
	        	String inputs = resultat.getString("inputs");
	        	String  output_type  = resultat.getString("output_type");
	        	long number_of_outputs  = resultat.getLong("number_of_outputs");
	        	String outputs = resultat.getString("outputs");
	        	
	        	
				service = new Service(service_id, service_name, domain, input_type, number_of_inputs ,inputs, output_type ,number_of_outputs, outputs );
			}
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		return service;
	}

	@Override
	public List<Service> selectAllServices() {
		System.out.println(SELECT_ALL_SERVICES);
		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Service> services = new ArrayList<>();

		// Step 1: Establishing a Connection
		try (Connection connection = JDBCUtils.getConnection();

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICES);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet resultat = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (resultat.next()) {
				int service_id = resultat.getInt("service_id");
				String service_name  = resultat.getString("service_name");
	        	String domain = resultat.getString("domain");
	        	String  input_type  = resultat.getString("input_type");
	        	long number_of_inputs  = resultat.getLong("number_of_inputs");
	        	String inputs = resultat.getString("inputs");
	        	String  output_type  = resultat.getString("output_type");
	        	long number_of_outputs  = resultat.getLong("number_of_outputs");
	        	String outputs = resultat.getString("outputs");
	        	
	 
	        	
				services.add(new Service(service_id, service_name, domain, input_type, number_of_inputs ,inputs, output_type ,number_of_outputs, outputs ));
			}
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		return services;
	}

	@Override
	public boolean deleteService(int service_id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_SERVICE_BY_ID);) {
			statement.setInt(1, service_id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	@Override
	public boolean updateService(Service service) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_SERVICE);) {
			
			statement.setString(1,service.getService_name());
			statement.setString(2,service.getDomain());
			statement.setString(3,service.getInput_type());
			statement.setLong(4,service.getNumber_of_inputs());
			statement.setString(5,service.getInputs());
			statement.setString(6,service.getOutput_type());
			statement.setLong(7,service.getNumber_of_outputs());
			statement.setString(8,service.getOutputs());
				
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}



}
