package Day7_Feb_7_2024;

import java.util.Scanner;

public class UserMenu extends Display{
	
	public User addUser(Scanner scanner) {
		String firstName;
		String lastName;
		String address;
		String city; 
		String state; 
		String zip;
		String phoneNum;
		scanner.nextLine();
		printLine();
		System.out.println(centerText("What is the user's first name?"));
		firstName = scanner.nextLine();
		System.out.println(centerText("What is the user's last name?"));
		lastName = scanner.nextLine();
		System.out.println(centerText("What is the user's address?"));
		address = scanner.nextLine();
		System.out.println(centerText("What is the user's city?"));
		city = scanner.nextLine();
		System.out.println(centerText("What is the user's state?"));
		state = scanner.nextLine();
		System.out.println(centerText("What is the user's zip code?"));
		zip = scanner.nextLine();
		System.out.println(centerText("What is the user's phone number?"));
		phoneNum = scanner.nextLine();
		User user = new User(firstName, lastName, address, city, state, zip, phoneNum);
		printLine();
		System.out.println(user.displayUserDetails());
		return user;
		
	}
	
	public User removeUser(Scanner scanner) {
		scanner.nextLine();
		System.out.println(centerText("Which user ID would you like to remove?"));
		String id = scanner.nextLine();
		User user;
		user = Library.getUser(id);
		if(user == null) {
			System.out.println(centerText("That user ID does not exist."));
		}
		return user;
	}

}
