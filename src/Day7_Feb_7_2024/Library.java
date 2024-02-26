package Day7_Feb_7_2024;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
	static HashMap<String,Book> books;
	static HashMap<String, User> users;
	static List<Transaction> transactions;
	static HashMap<String, String> usersByUsername;
	
	public Library() {
		super();
		Library.books = new HashMap<String,Book>();
		Library.users = new HashMap<String,User>();
		Library.transactions = new ArrayList<Transaction>();
		Library.usersByUsername = new HashMap<String,String>();
		addBooks("./src/Day7_Feb_7_2024/books.csv");
		addUsers("./src/Day7_Feb_7_2024/users.csv");
		Library.users.get("ID111").setAdmin(true);
		Library.users.get("ID111").isAdmin();
		
		
	}
	
	public void displayBooks() {
		System.out.println("Library Books");
		for(Map.Entry<String, Book> book : Library.books.entrySet()) {
			System.out.println(book.toString());
			System.out.println();
		}
		System.out.println();
		
	}
	
	public static void displayAvailableBooks() {
		System.out.println("Available Library Books");
		for(Map.Entry<String, Book> book : Library.books.entrySet()) {
			if(book.getValue().getStatus().equals("Available")) {
				System.out.println(book.toString());
				System.out.println();
			}
		}
		System.out.println();
		
	}
	
	public static void displayBooksDetails() {
		System.out.println("Library Books");
		books.forEach((id,book) -> System.out.println("\n"+book.toStringDetails())); 
			System.out.println();
	}	
	
	public static User getUser(String ID) {
		
		return Library.users.get(ID);
		
	}
	
	public static Book getBook(String ISBN) {
		return Library.books.get(ISBN);
		
	}
	
	public static void displayUsers() {
		System.out.println("Library Users");
		for(Map.Entry<String, User> user : Library.users.entrySet()) {
			if(user.getValue().isActive()) {
				System.out.println(user.toString());
				System.out.println();
			}
			else {
				System.out.println("Suspended User: "+ user.toString());
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static void displayUserDetails() {
		System.out.println("Library Users");
		for(Map.Entry<String, User> user : Library.users.entrySet()){
			if(user.getValue().isActive())
					System.out.println("\n"+user.getValue().toString()); 
		}

		System.out.println();
	}
	
	public static void addBook(Book book) {
		books.put(book.getISBN(),book);
	};
	
	public static void addUser(User user) {
		Library.users.put(user.getId(), user);
		Library.usersByUsername.put(user.getUsername(),user.getId());
	}
	
	
	public static void addBooks(String filePath) {
	    String line;
	    Book book;
	    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	        try {
				while ((line = reader.readLine()) != null) {
				    String[] bookInfo = line.split(",");
				    book = new Book(bookInfo[0],bookInfo[1],bookInfo[2],bookInfo[3]);
				    addBook(book);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	        } catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	}
	
	public static void addUsers(String filePath) {
	    String line;
	    User user;
	    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	        try {
				while ((line = reader.readLine()) != null) {
				    String[] userInfo = line.split(",");
				    user = new User(userInfo[0],userInfo[1],userInfo[2],userInfo[3],userInfo[4],userInfo[5],userInfo[6],userInfo[7]);
				    addUser(user);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	        } catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	}

	public static void removeUser(User user) {
			Library.users.get(user.getId()).setActive(false);
			System.out.println(user.getFirstName() + " " + user.getLastName() + " suspended.");
		
	}
	
	public static void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	public void printTransactions() {
		System.out.println("Transactions:\n");
		for(Transaction transaction : transactions) {
			System.out.println(transaction.toString());
			System.out.println();
		}
	}

	public static void removeBook(String string) {
		books.remove(string);
		
	}
	

}
