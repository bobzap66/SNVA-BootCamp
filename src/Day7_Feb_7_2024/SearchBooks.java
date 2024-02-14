package Day7_Feb_7_2024;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class SearchBooks extends Display{
	ArrayList<Book> books = new ArrayList<Book> ();
	
	public void searchBooksMenu(Scanner scanner) {
		int choice;
		
		do {
		printLine();
		displaySearchBooksMenuUser();
		choice = scanner.nextInt();
		switch(choice) {
		case 1: 
			System.out.println(centerText("You have selected search by author."));
			scanner.nextLine();
			searchByAuthorMenu(scanner);
			break;
		case 2: 
			System.out.println(centerText("You have selected search by genre"));
			scanner.nextLine();
			searchByGenreMenu(scanner);
			break;
		case 3: 
			System.out.println(centerText("You have selected search by ISBN."));
			scanner.nextLine();
			searchByISBNMenu(scanner);
			break;
		case 4: 
			System.out.println(centerText("You have selected exit."));
			scanner.nextLine();
			break;
		default: 
			System.out.println(centerText("Invalid choice. Please select again."));
		}
			
		printLine();
		} while (choice != 4);
		System.out.println(centerText("Goodbye!"));
		
	}
	
	public void displaySearchBooksMenuUser() {
		System.out.println(centerText("Search by:"));
		printLine();
		System.out.println(makeTwoColumns("1:", "Author"));
		System.out.println(makeTwoColumns("2:", "Genre"));
		System.out.println(makeTwoColumns("3:", "ISBN"));
		System.out.println(makeTwoColumns("4:", "Exit"));
		printLine();
		
	}
	
	public void searchByAuthorMenu(Scanner scanner) {
		String input;
		System.out.println(centerText("Please enter the author's last name: "));
		input = scanner.nextLine();
		books = searchByAuthor(input);
		if(books.size()<1) {
			System.out.println(centerText("The library contains no books by that author or those books are all unavaible at the moment."));
			return;
		}
		for(Book book: books) {
			System.out.println(book.toString());
		}
	}
	
	public void searchByGenreMenu(Scanner scanner) {
		String input;
		System.out.println(centerText("Please enter the genre: "));
		input = scanner.nextLine();
		books = searchByGenre(input);
		if(books.size()<1) {
			System.out.println(centerText("The library contains no books of that genre or those books are all unavaible at the moment."));
			return;
		}
		for(Book book: books) {
			System.out.println(book.toString());
		}
	}
	
	public void searchByISBNMenu(Scanner scanner) {
		String input;
		System.out.println(centerText("Please enter the ISBN: "));
		input = scanner.nextLine();
		books = searchByISBN(input);
		if(books.size()<1) {
			System.out.println(centerText("The library contains no books with that ISBN or those books are all unavaible at the moment."));
			return;
		}
		for(Book book: books) {
			System.out.println(book.toString());
		}
	}
	
	ArrayList<Book> searchByAuthor(String author) {
		System.out.println("You are seaching for books by " + author);
		books.clear();
		for(Map.Entry<String, Book> book : Library.books.entrySet()) {
			if(book.getValue().getAuthorLastName().equals(author) && book.getValue().getStatus().equals("Available"))
				books.add(book.getValue());
		}
		return books;
		
	}
	
	ArrayList<Book> searchByISBN(String ISBN) {
		books.clear();
		for(Map.Entry<String, Book> book : Library.books.entrySet()) {
			if(book.getValue().getISBN().equals(ISBN) && book.getValue().getStatus().equals("Available"))
				books.add(book.getValue());
		}
		return books;
		
	}
	
	ArrayList<Book> searchByGenre(String genre) {
		books.clear();
		for(Map.Entry<String, Book> book : Library.books.entrySet()) {
			if(book.getValue().getGenre().equals(genre) && book.getValue().getStatus().equals("Available"))
				books.add(book.getValue());
		}
		return books;
		
	}


}
