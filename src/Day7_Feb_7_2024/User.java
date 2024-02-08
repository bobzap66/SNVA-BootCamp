package Day7_Feb_7_2024;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	private String id;
	static int nextId = 111;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNum;
	private List<Book> borrowed;
	private List<Book> returned;

	
	public User(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNum = phoneNum;
		borrowed = new ArrayList<Book>();
		returned = new ArrayList<Book>();
		setId();
	}

	public void setId() {
		id = "ID" + nextId;
		++nextId;
	}

	@Override
	public String toString() {
		String user = lastName + ", " + firstName + "\nID: " + id;
		return user;
	}
	
	public String displayUserDetails() {
		String user = lastName + ", " + firstName + "\nID: " + id + "\n" + address + "\n" + city + ", " + state + " " + zip +"\nNumber: " + phoneNum;
		user = user + "\n" + borrowed.toString();
		return user;
	}
	
	public String displayBorrowed() {
		String rv = "User: " + id + " currently has checked out:";
		rv = rv + "\n";
		for(Book book : borrowed) {
			rv = rv + book.toString();
		}
		return rv;
	}


	public String getId() {
		return id;
	}
	
	public void borrow(Book book) {
		borrowed.add(book);
	}
	
	public void returnBook(Book book) {
		borrowed.remove(book);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}

	
