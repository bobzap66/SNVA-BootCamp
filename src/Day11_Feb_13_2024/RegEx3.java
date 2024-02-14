package Day11_Feb_13_2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {

	public static void main(String[] args) {
		
		Pattern pat;
		Matcher mat;
		pat = Pattern.compile("Hello");
		mat = pat.matcher("Hello World!! Hello Sam");
		
		while(mat.find()) {
			System.out.println("Hello found at " + mat.start());
		}
		
		

	}

}
