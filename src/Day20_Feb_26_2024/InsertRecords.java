package Day20_Feb_26_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Day7_Feb_7_2024.Display;


public class InsertRecords {

	public static void displayMenu() {
		System.out.println(Display.makeTwoColumns("Math:", "1"));
		System.out.println(Display.makeTwoColumns("Computer Science:", "2"));
		System.out.println(Display.makeTwoColumns("Biology:", "3"));
		System.out.println(Display.makeTwoColumns("English:", "4"));
		System.out.println(Display.makeTwoColumns("Music:", "5"));
	}
	public static void main(String[] args) throws SQLException {
		String query = "";
		String query2 = "select * from Student;";
		String input = "";
		String sName = "";
		String course = "";
		int courseNo = -1;
		query = "Insert into Student('sname', 'course') values (" + sName + ", " + course + ")";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapi24", "root", "admin");
			if(connection == null) {
				System.out.println("Connection failed");				
			} else {
				System.out.println("Connection established to MySQL");
				Statement statement = connection.createStatement();
				Scanner scanner = new Scanner(System.in);
				System.out.println(Display.centerText("Hello! Welcome to the new student portal!"));
				while(!input.equals("exit")) {
					System.out.println(Display.centerText("Please enter student's name:"));
					sName = scanner.nextLine();
					System.out.println(Display.centerText("Please select course:"));
					displayMenu();
					courseNo = scanner.nextInt();
					switch(courseNo) {
					case 1:
						course = "Math";
						break;
					case 2:
						course = "Computer Science";
						break;
					case 3:
						course = "Biology";
						break;
					case 4: 
						course = "English";
						break;
					case 5: 
						course = "Music";
						break;
					default: 
						course = "No Course Selected";
						break;
						}
					scanner.nextLine();
					query = "Insert into Student(sname, course) values ('" + sName + "', '" + course + "');";
					System.out.println(Display.centerText("Type 'exit' to exit, or 'y' to continue adding students."));
					input = scanner.nextLine();
					System.out.println(query);
					statement.executeUpdate(query);
					if(input.equals("exit"))
						break;

				}
				scanner.close();
				ResultSet resultSet = statement.executeQuery(query2);
				while (resultSet.next()) {
					Integer sNo = resultSet.getInt(1);
					sName = resultSet.getString(2);
					course = resultSet.getString(3);
					System.out.println("sNo:" + sNo);
					System.out.println("sName:" + sName);
					System.out.println("course:" + course);
					System.out.println("");
				}
				resultSet.close();

				statement.close();
				connection.close();
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}
