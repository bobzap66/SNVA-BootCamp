package Day7_Feb_7_2024;

import java.util.ArrayList;

public class ReturnBooks extends Transaction {

	public ReturnBooks(String userId, ArrayList<Book> books) {
		super();
		type="checkout";
		this.books = books;
		for(Book book: books) {
			Library.books.get(book.getISBN()).setStatus("Available");
			Library.users.get(userId).returnBook(book);
		} 
	}
	
	public String toString() {
		String string = "UserID: " + userId + " returned the following books: ";
		for(Book book: books) {
			string = string + "\n" + book.toString();
		}
		return string;
		
	}
	
	

}
