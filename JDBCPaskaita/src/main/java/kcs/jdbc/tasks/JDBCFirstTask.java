package kcs.jdbc.tasks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Andrius Baltrunas
 */
public class JDBCFirstTask {
	public static void main(String[] args) {
		try {
			Connection connection = MyJDBCUtils.getConnection();
			if(connection == null) {
				return;
			}

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("SELECT  * from students");
			while(resultSet.next()){
				System.out.print(resultSet.getInt("id") + " ");
				System.out.print(resultSet.getString("name") + " ");
				System.out.print(resultSet.getString("surname") + " ");
				System.out.print(resultSet.getString("email") + " ");
				System.out.print(resultSet.getString("phone") + " \n");
			}
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
}
