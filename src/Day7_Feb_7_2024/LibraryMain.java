package Day7_Feb_7_2024;

import java.util.ArrayList;

public class LibraryMain {

	public static void main(String[] args) {
		Library lib = new Library();
		lib.displayBooksDetails();
		lib.displayUserDetails();
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(lib.getBook("LIB1"));
		CheckOut checkOut = new CheckOut(lib.getUser("ID113"), books);
		Library.addTransaction(checkOut);
		lib.displayBooksDetails();
		lib.displayUserDetails();
		
		ReturnBooks returnBook = new ReturnBooks(lib.getUser("ID113"), books);
		Library.addTransaction(returnBook);
		lib.displayUserDetails();
		Library.removeUser(lib.getUser("ID113"));
		//lib.displayBooksDetails();
		User user = new User("Joe", "DiMaggio", "999 Baseball Lane", "New York", "NY", "12532", "916-555-1234");
		Library.addUser(user);
		lib.displayUserDetails();
		
		lib.printTransactions();
	}

}
