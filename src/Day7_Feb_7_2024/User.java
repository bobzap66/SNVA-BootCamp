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
	private String username;
	private String password;
	private boolean isAdmin;
	private boolean active = true;

	
	public User(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNum, String username) {
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
		this.username = username;
		setId();
		this.password = this.id;
	}

	public void setId() {
		id = "ID" + nextId;
		++nextId;
	}

	@Override
	public String toString() {
		String user = lastName + ", " + firstName + "\nID: " + id + "\nUsername: " + username;
		return user;
	}
	
	public String displayUserDetails() {
		String user = lastName + ", " + firstName + "\nID: " + id + "\n" + address + "\n" + city + ", " + state + " " + zip +"\nNumber: " + phoneNum;
		if(this.isAdmin()) {
			user = user + "\n" + this.id + " is an admin.";
		}
		if(!this.active)
			user = user + "\n" + this.id + " is currently inactive.";
		user = user + "\n" + displayBorrowed();
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public List<Book> getBorrowed() {
		return borrowed;
	}

	public void setBorrowed(List<Book> borrowed) {
		this.borrowed = borrowed;
	}

	public List<Book> getReturned() {
		return returned;
	}

	public void setReturned(List<Book> returned) {
		this.returned = returned;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
}

	
