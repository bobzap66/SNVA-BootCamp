package Day11_Feb_13_2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {

	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile("Java");
		mat = pat.matcher("Hello World Java SE");
		
		System.out.println("Looking for Java in Java SE");
		if(mat.find()) System.out.println("Java found");
		else System.out.println("Not found");

	}

}
