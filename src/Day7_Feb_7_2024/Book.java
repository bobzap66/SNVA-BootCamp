package Day7_Feb_7_2024;

public class Book {
	private String title;
	private String authorFirstName;
	private String authorLastName;
	private String ISBN;
	private String genre;
	private String status;
	static int nextISBN = 1;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	public String getAuthorLastName() {
		return authorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN() {
		ISBN = "LIB" + nextISBN;
		++nextISBN;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Book(String title, String authorFirstName, String authorLastName, String genre) {
		super();
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		setISBN();
		this.genre = genre;
		this.status = "Available";
	}
	public String toStringDetails() {
		String display = title + " by " + authorFirstName + " " + authorLastName + "\nISBN: " + ISBN + "\nGenre: " + genre + "\nStatus: " + status;
		return display;
	}
	
	public String toString() {
		String display = title + " by " + authorFirstName + " " + authorLastName + "\nISBN: " + ISBN;
		return display;
	}
	
	
	

}
