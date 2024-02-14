package Day7_Feb_7_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnBooksMenu extends Display {
public ArrayList<Book> returnBooks(Scanner scanner, User user){
		
		ArrayList<Book> books = new ArrayList<Book>();
		scanner.nextLine();
		Book book = null;
		String input;
		do {
			System.out.println(centerText("Which book would you like to return? Type ISBN to add book or 'exit' to complete."));
			System.out.println(centerText(Library.users.get(user.getId()).displayBorrowed()));
			
			printLine();
			input = scanner.nextLine();
			if(input.equals("exit")) {
				System.out.println(books);
				return books;
			}
			book = Library.getBook(input);
			if(book != null)
				books.add(book);
		}while (!input.equals("exit"));
			System.out.println(books);
		
		return books;
	}
	

}
