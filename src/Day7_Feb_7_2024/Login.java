package Day7_Feb_7_2024;

import java.util.Scanner;

public class Login{
	
	
	static User login(Scanner scanner) {
		String input;
		User user;
		String userId;
		System.out.println(Display.centerText("Please enter your username: "));
		input = scanner.nextLine();
		userId = Library.usersByUsername.get(input);
		if(userId==null) {
			System.out.println(Display.centerText("There is no user by username: " + input));
			System.out.println(Library.usersByUsername.toString());
		}
		else {
			user = Library.users.get(userId);
			if(validateUser(scanner,user))
				return user;
			else
				System.out.println(Display.centerText("Invalid password"));
		}
		
		return null;
		
	};
	
	static boolean validateUser(Scanner scanner, User user) {
		String input;
		System.out.println(Display.centerText("Please enter your password: "));
		input = scanner.nextLine();
		if(user.getPassword().equals(input)) {
			return true;
		}
		return false;
	}
	
	

}
