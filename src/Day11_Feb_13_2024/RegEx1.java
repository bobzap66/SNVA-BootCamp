package Day11_Feb_13_2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile("Java");
		mat = pat.matcher("java");
		found = mat.matches();
		
		System.out.println("Testing Java against Java");
		if(found) System.out.println("It matches");
		else System.out.println("Doesn't match");
		
		System.out.println();
		
		mat = pat.matcher("Java SE");
		found = mat.matches();
		
		if(found) System.out.println("It matches");
		else System.out.println("Doesn't match");
		
		
		
	}

}
