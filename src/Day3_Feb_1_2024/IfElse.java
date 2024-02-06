package Day3_Feb_1_2024;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		int month;
		String season;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month as integer (i.e., January = 1:");
		month = scanner.nextInt();
		if(month == 12 || month == 1 || month == 2)
			season = "Winter";
		else if(month == 3 || month == 4 || month == 5)
			season = "Spring";
		else if(month == 6 || month == 7 || month == 8)
			season = "Summer";
		else
			season = "Autumn";
		System.out.println("Month " + month + " falls in " + season + ".");
	}

}
