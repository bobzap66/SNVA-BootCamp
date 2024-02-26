package Day7_Feb_7_2024;


import java.util.Scanner;

public class MenuForAdmin extends Display implements Menu{

	@Override
	public void selectOption(Scanner scanner) {
		int choice;
		BookMenu bookMenu = new BookMenu();
		UserMenu userMenu = new UserMenu();
		Book book;
		displayMenu();
		do {
		printLine();
		choice = scanner.nextInt();
		switch(choice) {
		case 1: 
			System.out.println(centerText("You have selected Add Book."));
			book = bookMenu.addBook(scanner);
			Library.addBook(book);
			break;
		case 2: 
			System.out.println(centerText("You have selected Remove Book"));
			bookMenu.removeBook(scanner);
			break;
		case 3: 
			System.out.println(centerText("You have selected Suspend User."));
			User user = userMenu.removeUser(scanner);
			Library.removeUser(user);
			break;
		case 4: 
			System.out.println(centerText("You have selected Add User."));
			user = userMenu.addUser(scanner);
			Library.addUser(user);
			
			break;
		case 5:
			System.out.println(centerText("You have selected Display Membership Details"));
			user = userMenu.displayUserDetails(scanner);
			System.out.println(centerText(user.displayUserDetails()));
			user.displayUserDetails();
			break;
		case 6:
			System.out.println(centerText("You have selected Display All Books"));
			Library.displayBooksDetails();
			break;
		case 7:
			System.out.println(centerText("You have selected Display All Members"));
			Library.displayUsers();
			break;
		case 0: 
			System.out.println(centerText("Leaving Admin Menu"));
			break;
		default: 
			System.out.println(centerText("Invalid choice. Please select again."));
		}
			
		printLine();
		if(choice != 0)
			displayMenu();
		} while (choice != 0);
	}

	@Override
	public void displayMenu() {
		System.out.println(centerText("Administrative Menu:"));
		printLine();
		System.out.println(makeTwoColumns("1:", "Add Book"));
		System.out.println(makeTwoColumns("2:", "Remove Book"));
		System.out.println(makeTwoColumns("3:", "Suspend User"));
		System.out.println(makeTwoColumns("4:", "Add User"));
		System.out.println(makeTwoColumns("5:", "Display Membership Details"));
		System.out.println(makeTwoColumns("6:", "Display All Books"));
		System.out.println(makeTwoColumns("7:", "Display All Members"));
		System.out.println(makeTwoColumns("0:", "Exit"));
		printLine();
		
	}
/* add user
 * suspend user
 * add book
 * remove book
 * display a book
 * display list of books
 * display borrowed books
 * display a member details
 * display all members
	*/
	
	
	

}
