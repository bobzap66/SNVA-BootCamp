package task2;

import java.util.Scanner;

public class ReportCard {
	int width = 100;
	String letterGrade;
	double average;
	int total;
	Lesson lessons[];
	String firstName;
	String lastName;
	String grade;
	
	public void calculateLetterGrade() {
		if(average>94)
			letterGrade = "A+";
		else if(average > 90)
			letterGrade = "A";
		else if(average > 80)
			letterGrade = "B+";
		else if(average > 70)
			letterGrade = "B";
		else if(average > 60)
			letterGrade = "C";
		else if(average > 50)
			letterGrade = "D";
		else
			letterGrade = "F";
	}
	
	//prints formatted report card
	public void printReportCard() {
		printLine();
		String schoolName = "The University of Tennessee - Report Card";
		System.out.println("|"+centerText(schoolName)+"|");
		printLine();
		System.out.println(makeTwoColumns("Name: ", lastName + ", " + firstName));
		System.out.println(makeTwoColumns("Grade:", grade));
		for(Lesson lesson: lessons) {
			System.out.println(makeTwoColumns(lesson.getName(), ""+lesson.getGrade()));	
		}
		System.out.println(makeTwoColumns("Total:", ""+total));
		System.out.println(makeTwoColumns("Average:", ""+average));
		System.out.println(makeTwoColumns("Final Grade:", ""+letterGrade));
		printLine();
	}
	
	//pads text on either side to center text according to width
	public String centerText(String text) {
		int padding = (width - text.length())/2;
		StringBuilder centeredText = new StringBuilder();
		for (int i= 0; i < padding; i++)
				centeredText.append(" ");
		centeredText.append(text);
		for (int i= 0; i < padding-1; i++)
			centeredText.append(" ");
		String centeredTextString = centeredText.toString();
		return (centeredTextString);
	}
	//pads text to align text to left according to width. Never used
	public String alignLeft(String text) {
		int padding = width - text.length();
		StringBuilder alignedText = new StringBuilder();
		alignedText.append(text);
		for(int i = 0; i < padding; i++) {
			alignedText.append(" ");
		}
		String alignedTextString = alignedText.toString();
		return alignedTextString;
	
	}
	//turns two strings into one line of text as two columns using width for padding
	public String makeTwoColumns(String s1, String s2) {
		int padding = width/2;
		int padding1 = padding - s1.length()-1;
		int padding2 = padding - s2.length()-2;
		StringBuilder twoColumns = new StringBuilder();
		twoColumns.append("|");
		twoColumns.append(s1);
		for(int i = 0; i < padding1; i++) {
			twoColumns.append(" ");
		}
		twoColumns.append("|");
		twoColumns.append(s2);
		for(int i = 0; i < padding2; i++) {
			twoColumns.append(" ");
		}
		twoColumns.append("|");
		String twoColumnString = twoColumns.toString();
		return twoColumnString;
	}

//constructs report card and initiates getInfo method
	public ReportCard() {
		super();
		lessons = new Lesson[6];
		lessons[0] = new Lesson("English");
		lessons[1] = new Lesson("Math");
		lessons[2] = new Lesson("Science");
		lessons[3] = new Lesson("Physical Education");
		lessons[4] = new Lesson("Computer Science");
		lessons[5]  = new Lesson("Spanish");
		getInfo(); 
	}
	
	//adds a line for formatting according to width
	public void printLine() {
		for(int i = 0; i<width; i++)
			System.out.printf("-");
		System.out.printf("\n");
	}
	
	//prompts user for student and grade information, then calculates derived statistics
	public void getInfo() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the student's first name?");
		this.firstName = scanner.nextLine();
		System.out.println("What is the student's last name?");
		this.lastName = scanner.nextLine();
		System.out.println("What grade is the student in?");
		this.grade = scanner.nextLine();
		System.out.println("What did the student score in English?");
		this.lessons[0].grade = scanner.nextInt();
		System.out.println("What did the student score in Math?");
		this.lessons[1].grade = scanner.nextInt();
		System.out.println("What did the student score in Science?");
		this.lessons[2].grade = scanner.nextInt();
		System.out.println("What did the student score in Physical Education?");
		this.lessons[3].grade = scanner.nextInt();
		System.out.println("What did the student score in Computer Science?");
		this.lessons[4].grade = scanner.nextInt();
		System.out.println("What did the student score in Spanish?");
		this.lessons[5].grade = scanner.nextInt();
		scanner.close();
		total = 0;
		for(Lesson lesson: lessons)
			total = total + lesson.getGrade();
		average = total/6;
		calculateLetterGrade();
	}
}
