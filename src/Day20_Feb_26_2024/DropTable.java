package Day20_Feb_26_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class DropTable {

	public static void main(String[] args) throws SQLException {
		String query = "drop table student;";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapi24", "root", "admin");
			if(connection == null) {
				System.out.println("Connection failed");
				
			} else {
				System.out.println("Connection established to MySQL");
				Statement statement = connection.createStatement();
				System.out.println("statement.executeQuery returns: " + statement.execute(query));

				
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		



	}

}