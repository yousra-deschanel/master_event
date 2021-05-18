package com.master.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.master.beans.Event;
import com.master.bdd.JDBCUtils;



public class EventDaoImpl  implements EventDao {

	private static final String INSERT_EVENT_SQL = "INSERT INTO event"
			+ "  (event_title, event_type, description, start_date, end_date) VALUES " + " (?, ?,?, ?, ?);";

	private static final String SELECT_EVENT_BY_ID = "select id,event_title, event_type, description, start_date, end_date from event where id =?";
	private static final String SELECT_ALL_EVENTS = "select * from event";
	private static final String DELETE_EVENT_BY_ID = "delete from event where id = ?;";
	private static final String UPDATE_EVENT = "update event set event_title = ?, event_type= ?, description =?, start_date =?, end_date =? where id = ?;";

	public EventDaoImpl() {
	}

	@Override
	public void insertEvent(Event event) throws SQLException {
		System.out.println(INSERT_EVENT_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EVENT_SQL)) {
			preparedStatement.setString(1,event.getEvent_title());
			preparedStatement.setString(2,event.getEvent_type());
			preparedStatement.setString(3,event.getDescription());
			preparedStatement.setString(4,event.getStart_date());
			preparedStatement.setString(5,event.getEnd_date());
			
			
			
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
	}

	@Override
	public Event selectEvent(long eventId) {
		Event event = null;
		// Step 1: Establishing a Connection
		try (Connection connection = JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EVENT_BY_ID);) {
			preparedStatement.setLong(1, eventId);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet resultat = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (resultat.next()) {
				long id = resultat.getLong("id");
				String event_title = resultat.getString("event_title");
	        	String event_type = resultat.getString("event_type");
	        	String description = resultat.getString("description");
	        	String start_date = resultat.getString("start_date");
	        	String end_date= resultat.getString("end_date");
	        	
	        	
				event = new Event(id, event_title, event_type, description, start_date, end_date);
			}
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		return event;
	}

	@Override
	public List<Event> selectAllEvents() {
		System.out.println(SELECT_ALL_EVENTS);
		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Event> events = new ArrayList<>();

		// Step 1: Establishing a Connection
		try (Connection connection = JDBCUtils.getConnection();

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EVENTS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet resultat = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (resultat.next()) {
				long id = resultat.getLong("id");
				String event_title = resultat.getString("event_title");
	        	String event_type = resultat.getString("event_type");
	        	String description = resultat.getString("description");
	        	String start_date = resultat.getString("start_date");
	        	String end_date= resultat.getString("end_date");
	 
	        	
				events.add(new Event(id, event_title, event_type, description, start_date, end_date));
			}
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		return events;
	}

	@Override
	public boolean deleteEvent(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_EVENT_BY_ID);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	@Override
	public boolean updateEvent(Event event) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_EVENT);) {
			statement.setString(1,event.getEvent_title());
			statement.setString(2,event.getEvent_type());
			statement.setString(3,event.getDescription());
			statement.setString(4,event.getStart_date());
			statement.setString(5,event.getEnd_date());
			statement.setLong(6, event.getId());
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}


}
