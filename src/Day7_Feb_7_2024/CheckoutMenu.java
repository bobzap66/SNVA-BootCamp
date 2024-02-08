package Day7_Feb_7_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckoutMenu extends Display{
	
	public ArrayList<Book> checkoutBooks(Scanner scanner){
		
		ArrayList<Book> books = new ArrayList<Book>();
		Book book = null;
		String input;
		do {
			System.out.println(centerText("Which book would you like to add to the list? Type ISBN to add book or 'exit' to complete."));
			Library.displayAvailableBooks();
			printLine();
			input = scanner.nextLine();
			if(Library.books.containsKey(input)) {
				book = Library.books.get(input);
			}
			if(book != null) {
					System.out.println(book.toString());
					books.add(book);
//				if(books.contains)
			}
			else
				System.out.println(centerText("The library does not have a copy of that book."));
			printLine();
			if(books.size()> 0) {
				System.out.println(centerText("You have selected:"));
				printLine();
				for( Book book1 : books) {
					System.out.println(book1.toString());
				}
				printLine();
			}
		}while (!input.equals("exit"));
			System.out.println(books);
		
		return books;
	}
	

}
