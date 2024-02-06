package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class ChatBotNG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		input = "hi";
		ArrayList<String> parsedInput = new ArrayList<String> ();
		UserInput userInput = new UserInput();
		Responses responses = new Responses();
		
		System.out.println(responses.possibleResponses.get("hi"));
		System.out.println(responses.possibleResponses.get("hungry"));
		do {
			
			input = scanner.nextLine();
			userInput.input = input;
			userInput.parseInput();
			parsedInput.clear();
			parsedInput.addAll(userInput.parsedInput);
			System.out.println(responses.getKeyword(parsedInput));
			
		} while (input.compareToIgnoreCase("exit") != 0);
		
		scanner.close();
		
		

	}

}
