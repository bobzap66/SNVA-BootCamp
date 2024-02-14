package Day7_Feb_7_2024;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Library lib = new Library();
		
		
		Display display = new Display();

		display.printLine();
		
		Scanner scanner = new Scanner(System.in);
		String input = "notExit";
		while(!input.equals("exit")) {
			System.out.println(Display.centerText("Type 'exit' to exit, or 'y' to login"));
			input = scanner.nextLine();
			if(input.equals("exit"))
				break;
			MainMenu mainMenu = new MainMenu(null, scanner);
			mainMenu.selectOption(scanner);
		}
		scanner.close();
		
	}

}
