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
		Book book = new Book(title, authorLastName, authorFirstName, genre);
		printLine();
		System.out.println(book.toStringDetails());
		return book;
		
	}
	
	public void removeBook(Scanner scanner) {
		String input = "notexit";
		scanner.nextLine();
		while(!input.equals("exit")) {
			System.out.println(centerText("Please enter book ISBN to remove from library or type 'exit' to exit:"));
			input = scanner.nextLine();
			Book book;
			book = Library.getBook(input);
			if(book != null) {
				Library.removeBook("input");
				System.out.println(centerText(book.getTitle() + " has been successfully removed from the library."));
			}
			else
				System.out.println(centerText("There is no book in the library with that ISBN."));
		}
	}

}
