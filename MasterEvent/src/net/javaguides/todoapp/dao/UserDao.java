package net.javaguides.todoapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.todoapp.model.User;
import net.javaguides.todoapp.utils.JDBCUtils;

public class UserDao {

	public int registerEmployee(User employee) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO user"
				+ "  (email, phone, type, password) VALUES "
				+ " (?, ?, ?, ?);";

		int result = 0;
		try (Connection connection = JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1,employee.getEmail());
			preparedStatement.setString(2,employee.getPhone());
			preparedStatement.setString(3,employee.getType());
			preparedStatement.setString(4, employee.getPassword());

			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// process sql exception
			JDBCUtils.printSQLException(e);
		}
		return result;
	}

}
