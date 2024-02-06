package project1;

import java.util.HashSet;
import java.util.Set;

public class UserInput {
	
	String input;
	Set <String> parsedInput;
	public UserInput(String input) {
		super();
		this.input = input;
		parseInput();
	}
	
	
	public UserInput() {
		super();
	}


	public void parseInput() {
		parsedInput = new HashSet<String>(); 
		String[] words = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		for(int i = 0; i < words.length; i++ ) {
			parsedInput.add(words[i]);
		}
	}
	
	
	
}
