package Day12_Feb_14_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRead {

	public static void main(String[] args) {

		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters , 'q' to quit");
		try {
			do {
				c = (char)br.read();
				System.out.println(c);
				
			} while (c!='q');
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
		
		String str;
		try {
			do {
				str= br.readLine();
				System.out.println(str);
			} while (!str.equals("Stop"));
		} catch (IOException e) {
			System.out.println("IO Exception");
		}

	}

}
