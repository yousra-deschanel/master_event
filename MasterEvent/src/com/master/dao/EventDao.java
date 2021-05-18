package com.master.dao;

import java.sql.SQLException;
import java.util.List;
import com.master.beans.Event;


public interface EventDao {

		void insertEvent(Event event) throws SQLException;

		Event selectEvent(long EventId);

		List<Event> selectAllEvents();

		boolean deleteEvent(int id) throws SQLException;

		boolean updateEvent(Event event) throws SQLException;

	}


