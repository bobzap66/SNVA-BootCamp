package Day7_Feb_7_2024;

import java.util.ArrayList;

public class ReturnBooks extends Transaction {

	public ReturnBooks(User user, ArrayList<Book> books) {
		super();
		type="checkout";
		this.user = user;
		this.books = books;
		for(Book book: books) {
			Library.books.get(book.getISBN()).setStatus("Available");
			Library.users.get(user.getId()).returnBook(book);
		} 
	}
	
	public String toString() {
		String string = "UserID: " + user.getId() + " returned the following books: ";
		for(Book book: books) {
			string = string + "\n" + book.toString();
		}
		return string;
		
	}
	
	

}
