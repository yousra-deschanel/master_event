package com.master.dao;

import java.sql.SQLException;
import java.util.List;

import com.master.beans.Service;

public interface ServiceDao {
	void insertService(Service service) throws SQLException;

	Service selectService(int service_id);

	List<Service> selectAllServices();

	boolean deleteService(int service_id) throws SQLException;

	boolean updateService(Service service) throws SQLException;
	

}
 
