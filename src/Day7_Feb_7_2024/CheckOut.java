package Day7_Feb_7_2024;

import java.util.ArrayList;

public class CheckOut extends Transaction {

	public CheckOut(User user, ArrayList<Book> books) {
		super();
		type="checkout";
		this.user = user;
		this.books = books;
		for(Book book: books) {
			Library.books.get(book.getISBN()).setStatus("Unavailble");
			Library.users.get(user.getId()).borrow(book);
		} 
	}
	
	public String toString() {
		String string = "UserID: " + user.getId() + " checked out the following books: ";
		for(Book book: books) {
			string = string + "\n" + book.toString();
		}
		return string;
		
	}
	
	

}
