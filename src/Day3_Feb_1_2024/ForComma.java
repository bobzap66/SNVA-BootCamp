package Day3_Feb_1_2024;

public class ForComma {

	public static void main(String[] args) {
		int a, b;
		for(a=1, b=4; a<b; ++a, --b) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		System.out.println("Ends at a = " + a);
		System.out.println("b = " + b);
		System.out.println("==========================");

	
		for(a=1, b=4; a<b; a++, b--) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		System.out.println("Ends at a = " + a);
		System.out.println("b = " + b);
	}
}
