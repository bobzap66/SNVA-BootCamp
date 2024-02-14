package Day7_Feb_7_2024;

import java.util.ArrayList;

public class Checkout extends Transaction {

	public Checkout(String userId, ArrayList<Book> books) {
		super();
		type="checkout";
		this.books = books;
		for(Book book: books) {
			Library.books.get(book.getISBN()).setStatus("Unavailble");
			Library.users.get(userId).borrow(book);
		} 
	}
	
	public String toString() {
		String string = "UserID: " + userId + " checked out the following books: ";
		for(Book book: books) {
			string = string + "\n" + book.toString();
		}
		return string;
		
	}
	
	

}
