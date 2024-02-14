package Day7_Feb_7_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuForUser extends Display implements Menu {
	User user;
	

	
	void displayNumBorrowedBooks() {
		System.out.println(("You currently have checked out: " + Library.users.get(user.getId()).getBorrowed().size() + " books."));
	}
	public MenuForUser(User user) {
		super();
		this.user = user;
	}
	void changePassword(Scanner scanner) {
		String input = "notexit";
		scanner.nextLine();
		while(!input.equals("exit")) {
			System.out.println("Please enter your new password or type 'exit' to exit:");
			String password;
			input = scanner.nextLine();
			System.out.println("Please enter your password again:");
			password=scanner.nextLine();
			if(input.equals(password)) {
				user.setPassword(password);
				System.out.println("Your password has been successfully changed!");
				return;
			} else
				System.out.println("Error! Those passwords do not match!");
		}
		
		
	}

	@Override
	public void selectOption(Scanner scanner) {
		int choice;
		ArrayList<Book> books;
		CheckoutMenu checkoutMenu= new CheckoutMenu();
		ReturnBooksMenu returnBooksMenu = new ReturnBooksMenu();
		displayMenu();
		do {
		printLine();
		choice = scanner.nextInt();
		switch(choice) {
		case 1: 
			System.out.println(centerText("You have selected find books."));
			SearchBooks searchBooks = new SearchBooks();
			searchBooks.searchBooksMenu(scanner);
			break;
		case 2: 
			System.out.println(centerText("You have selected update password"));
			changePassword(scanner);
			break;
		case 3: 
			System.out.println(centerText("You have selected checkout books."));
			books = checkoutMenu.checkoutBooks(scanner);
			Checkout checkout = new Checkout(user.getId(), books);
			Library.addTransaction(checkout);
			printLine();
			System.out.println(centerText(Library.users.get(user.getId()).displayBorrowed()));
			break;
		case 4: 
			System.out.println(centerText("You have selected return books."));
			books = returnBooksMenu.returnBooks(scanner, user);
			ReturnBooks returnBooks = new ReturnBooks(user.getId(), books);
			Library.addTransaction(returnBooks);
			break;
		case 5:
			System.out.println(centerText("You have selected display membership details."));
			System.out.println(Library.users.get(user.getId()).displayUserDetails());
			break;
		case 6:
			displayNumBorrowedBooks();
			break;
		case 7:
			if(!user.isAdmin()) {
				System.out.println(centerText("You do not have administrative privileges."));
				break;
			}
			if(user.isAdmin()) {
				MenuForAdmin menuForAdmin = new MenuForAdmin();
				menuForAdmin.selectOption(scanner);
			}
			break;
		case 0: 
			System.out.println(centerText("Logging Out"));
			break;
		default: 
			System.out.println(centerText("Invalid choice. Please select again."));
		}
		printLine();
		if(choice != 0)
			displayMenu();
		} while (choice != 0);
		System.out.println(centerText("Goodbye!"));
		scanner.nextLine();
		
	}
		
	

	@Override
	public void displayMenu() {
		System.out.println(centerText("Main Menu:"));
		printLine();
		System.out.println(makeTwoColumns("1:", "Find Books"));
		System.out.println(makeTwoColumns("2:", "Update Password"));
		System.out.println(makeTwoColumns("3:", "Checkout Books"));
		System.out.println(makeTwoColumns("4:", "Return Books"));
		System.out.println(makeTwoColumns("5:", "Membership Details"));
		System.out.println(makeTwoColumns("6:", "Number of Books Currently Checked Out"));
		System.out.println(makeTwoColumns("7:", "Admin Options"));
		System.out.println(makeTwoColumns("0:", "Log Out"));
		printLine();
		
	}
}
