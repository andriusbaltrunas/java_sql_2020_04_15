package kcs.jdbc.tasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Andrius Baltrunas
 */
public class JDBCSecondTask {
	public static void main(String[] args) {
		Connection connection = MyJDBCUtils.getConnection();
		if(connection == null) {
			return;
		}

		try {
			PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students SET name=?, surname=?, email=?, phone=? where id=?");
			preparedStatement.setString(1, "newName");
			preparedStatement.setString(2, "newSurname");
			preparedStatement.setString(3, "newEmail@kcs.com");
			preparedStatement.setString(4, "+3741235662");
			preparedStatement.setInt(5, 6);

			preparedStatement.execute();

		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
}
