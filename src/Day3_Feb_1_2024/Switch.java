package Day3_Feb_1_2024;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int month;
		String season = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month as integer (i.e., January = 1:");
		month = scanner.nextInt();
		switch(month) {
		case 12:
		case 1:
		case 2:
			season = "Winter";
			break;
		case 3:
		case 4:
		case 5:	
			season = "Spring";
			break;
		case 6:
		case 7:
		case 8:	
			season = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "Autumn";
			break;
		default: 
			System.out.println("This month is invalid");
			month = -1;
		}
		
		if(month!= -1)
			System.out.println("Month " + month + " falls in " + season + ".");


	}
}

