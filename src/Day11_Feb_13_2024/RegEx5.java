package Day11_Feb_13_2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx5 {
	public static void main(String[] args) {
		
	Pattern pat = Pattern.compile("[a-z]+");
	Matcher mat = pat.matcher("Z ZZ ZZZZZ ZZZZZZZZZ Zebra hello world Java");
	
	while(mat.find()) {
		System.out.println("Match: " + mat.group());
	}
	
}
}
