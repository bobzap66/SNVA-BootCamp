package Day7_Feb_7_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu extends Display implements Menu{
	
	
	UserMenu userMenu;
	BookMenu bookMenu;
	CheckoutMenu checkoutMenu;
	
	
	

	public MainMenu() {
		super();
		userMenu = new UserMenu();
		bookMenu = new BookMenu();
		checkoutMenu = new CheckoutMenu();
	}

	@Override
	public void selectOption(Scanner scanner) {
		int choice;
		User user;
		user = null;
		Book book;
		ArrayList<Book> books;
		Checkout checkout;
		do {
		printLine();
		choice = scanner.nextInt();
		switch(choice) {
		case 1: 
			System.out.println(centerText("You have selected user info."));
			Library.displayUsers();
			break;
		case 2: 
			System.out.println(centerText("You have selected add user."));
			Library.addUser(userMenu.addUser(scanner));
			break;
		case 3: 
			System.out.println(centerText("You have selected remove user."));
			user = userMenu.removeUser(scanner);
			if(user == null)
				break;
			Library.removeUser(user);
			break;
		case 4: 
			System.out.println(centerText("You have selected show books."));
			Library.displayBooksDetails();
			break;
		case 5: 
			System.out.println(centerText("You have selected add book."));
			book = bookMenu.addBook(scanner);
			Library.addBook(book);
			break;	
		case 6: 
			System.out.println(centerText("You have selected remove book."));
//			book = bookMenu.removeBook(scanner);
//			Library.removeBook(book);;
			break;
		case 7: 
			System.out.println(centerText("You have selected checkout books."));
			System.out.println(centerText("Which user?"));
			scanner.nextLine();
			user = Library.getUser(scanner.nextLine());
			if(user == null) {
				System.out.println(centerText("Invalid User"));
				break;
			}
			books = checkoutMenu.checkoutBooks(scanner);
			checkout = new Checkout(user, books);
			break;
		case 8: 
			System.out.println(centerText("You have selected return books."));
			break;
		case 9: 
			System.out.println(centerText("You have selected exit."));
			break;
		default: 
			System.out.println(centerText("Invalid choice. Please select again."));
		}
			
		printLine();
		displayMenu();
		} while (choice != 9);
		System.out.println(centerText("Goodbye!"));
		
	}

	@Override
	public void displayMenu() {
		System.out.println(centerText("Main Menu:"));
		printLine();
		System.out.println(makeTwoColumns("1:", "User Info"));
		System.out.println(makeTwoColumns("2:", "Add User"));
		System.out.println(makeTwoColumns("3:", "Remove User"));
		System.out.println(makeTwoColumns("4:", "Show Books"));		
		System.out.println(makeTwoColumns("5:", "Add Book"));
		System.out.println(makeTwoColumns("6:", "Remove Book"));
		System.out.println(makeTwoColumns("7:", "Checkout Books"));
		System.out.println(makeTwoColumns("8:", "Return Books"));
		System.out.println(makeTwoColumns("9:", "Exit"));
		printLine();

		
	}



}
