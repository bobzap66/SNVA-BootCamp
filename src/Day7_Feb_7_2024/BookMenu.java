package Day7_Feb_7_2024;

import java.util.Scanner;

public class BookMenu extends Display{
	
	public Book addBook(Scanner scanner) {String title;
		String authorFirstName;
		String authorLastName;
		String genre;
		scanner.nextLine();
		printLine();
		System.out.println(centerText("What is the book's title"));
		title = scanner.nextLine();
		System.out.println(centerText("What is the author's first name?"));
		authorFirstName = scanner.nextLine();
		System.out.println(centerText("What is the author's last name?"));
		authorLastName = scanner.nextLine();
		System.out.println(centerText("What is the book's genre?"));
		genre = scanner.nextLine();
		Book book = new Book(title, authorFirstName, authorLastName, genre);
		printLine();
		System.out.println(book.toStringDetails());
		return book;
		
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
