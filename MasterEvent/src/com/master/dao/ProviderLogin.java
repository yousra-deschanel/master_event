package com.master.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.master.beans.LoginBean;
import com.master.bdd.JDBCUtils;

public class ProviderLogin {


		public static boolean validateProvider(LoginBean loginBean) throws ClassNotFoundException {
			boolean status = false;

			Class.forName("com.mysql.jdbc.Driver");

			try (Connection connection = JDBCUtils.getConnection();
					// Step 2:Create a statement using connection object
					PreparedStatement preparedStatement = connection
							.prepareStatement("select * from user where email = ? and password = ? and type = \"Service Provider\"; ")) {
				preparedStatement.setString(1, loginBean.getEmail());
				preparedStatement.setString(2, loginBean.getPassword());

				System.out.println(preparedStatement);
				ResultSet rs = preparedStatement.executeQuery();
				status = rs.next();

			} catch (SQLException e) {
				// process sql exception
				JDBCUtils.printSQLException(e);
			}
			return status;
		}
	}



