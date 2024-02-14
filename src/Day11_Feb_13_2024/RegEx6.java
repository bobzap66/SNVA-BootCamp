package Day11_Feb_13_2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx6 {

	public static void main(String[] args) {
		String str = "A wise monkey is a monkey that doesn't monkey with another monkey's monkey";
		String regex = "monkey";
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile(regex);
		mat = pat.matcher(str);
		found = mat.find();
		
	
		if(found) System.out.println("It matches");
		else System.out.println("Doesn't match");
		
		while(mat.find()) {
			System.out.println(mat.group() + " is matched from " + mat.start() + " to " + mat.end());
		}
	}

}
