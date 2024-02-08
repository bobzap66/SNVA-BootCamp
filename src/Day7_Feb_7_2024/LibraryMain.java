package Day7_Feb_7_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Library lib = new Library();
		
		
		Display display = new Display();
		MainMenu mainMenu = new MainMenu();
		display.printLine();
		Library.displayBooksDetails();
		display.printLine();
		Library.displayUserDetails();
		System.out.println();
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(lib.getBook("LIB1"));
		Checkout checkOut = new Checkout(Library.getUser("ID113"), books);
		Library.addTransaction(checkOut);
		Library.displayBooksDetails();
		display.printLine();
		Library.displayUserDetails();
		display.printLine();
		Library.displayAvailableBooks();
		display.printLine();
		System.out.println(Library.getUser("ID113").displayBorrowed());
		ReturnBooks returnBook = new ReturnBooks(Library.getUser("ID113"), books);
		Library.addTransaction(returnBook);
		display.printLine();
		Library.displayUserDetails();
		Library.removeUser(Library.getUser("ID113"));
		User user = new User("Joe", "DiMaggio", "999 Baseball Lane", "New York", "NY", "12532", "916-555-1234");
		Library.addUser(user);
		display.printLine();
		Library.displayUserDetails();
		display.printLine();
		
		lib.printTransactions();
		display.printLine();
//		mainMenu.displayMenu();
//		
//		Scanner scanner = new Scanner(System.in);
//		mainMenu.selectOption(scanner);
//		scanner.close();
		
	}

}
