package Day7_Feb_7_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu extends Display implements Menu{
	
	
	UserMenu userMenu;
	BookMenu bookMenu;
	CheckoutMenu checkoutMenu;
	User user;
	Scanner scanner;
	
	
	

	public MainMenu(User user, Scanner scanner) {
		super();
		userMenu = new UserMenu();
		bookMenu = new BookMenu();
		checkoutMenu = new CheckoutMenu();
		this.scanner = scanner;
		while(user==null) {
			user = Login.login(scanner);
		}
		this.user = user;
	}

	@Override
	public void selectOption(Scanner scanner) {
		MenuForUser menuForUser = new MenuForUser(user);
		displayMenu();
		menuForUser.selectOption(scanner);
		
		
	}

	@Override
	public void displayMenu() {
		if(user.isAdmin()) {
			System.out.println(centerText("Welcome Admin!"));
		}
		printLine();

		
	}



}
