package Day11_Feb_13_2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx4 {

	public static void main(String[] args) {
		
		Pattern pat = Pattern.compile("Z+");
		Matcher mat = pat.matcher("Z ZZ ZZZZZ ZZZZZZZZZ Zebra");
		
		while(mat.find()) {
			System.out.println("Match: " + mat.group());
		}
		
		
		Pattern pat1 = Pattern.compile("e.+d");
		Matcher mat1 = pat1.matcher("end extend octopus extends extended");
		
		//greedy behavior
		while(mat1.find()) {
			System.out.println("Match: " + mat1.group());
		}
		
		Pattern pat2 = Pattern.compile("e.+?d");
		Matcher mat2 = pat2.matcher("end extend octopus extends extended");
		
	
		while(mat2.find()) {
			System.out.println("Match: " + mat2.group());
		}

	}

}
