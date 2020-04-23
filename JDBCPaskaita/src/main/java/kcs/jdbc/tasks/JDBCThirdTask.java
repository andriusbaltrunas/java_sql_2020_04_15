package kcs.jdbc.tasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Andrius Baltrunas
 */
public class JDBCThirdTask {
	public static void main(String[] args) {
		Connection connection = MyJDBCUtils.getConnection();
		if(connection == null) {
			return;
		}

		try {
			PreparedStatement statement = connection.prepareStatement("SELECT s.name, s.surname, m.mark from students s inner join student_marks m on s.id=m.student_id where m.mark < ?");
			statement.setInt(1, 6);

			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getString("name") + " " + resultSet.getString("surname") + " " + resultSet.getInt("mark"));
			}

		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
