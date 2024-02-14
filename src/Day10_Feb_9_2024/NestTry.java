package Day10_Feb_9_2024;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestTry {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = 1;
		while(a != -1) {
			System.out.println("Enter a number to represent 'a': ");
			
		try {
			a = scanner.nextInt();
			int b = 42 / a;
			System.out.println("a = " + a);
			try {
				if(a==1 ) {
					a = a/(a-a);
					
				}
				if (a==2) {
					int c[] = {1};
					c[42] = 99;
				}
			}
			catch( ArithmeticException e ){
				System.out.println("Arithmatic Exception: " + a + "/(" + a + "-" + a + ") is effectively " + a + "/0");
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Array Index Out of Bounds Exception");
			}
		} catch( ArithmeticException e ){
				System.out.println("Arithmatic Exception");
				} 
		catch (InputMismatchException e) {
					System.out.println("Enter a valid number:");
					scanner.nextLine();
					a = scanner.nextInt();
				}
		}

	}
}