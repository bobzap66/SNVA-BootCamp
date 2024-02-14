package Day10_Feb_9_2024;

public class ThrowsDemo {

	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("demo");
	}
	static void throwTwo() throws ArithmeticException 	{
		System.out.println("Inside throwTwo.");
		int a = 0; //try with 1 as well
		System.out.println("a = " + a);
		int b = 42 / a;
	}
	public static void main(String args[]) {
	try  	{
		throwOne();
	}catch (IllegalAccessException e) 	{
		System.out.println("Caught " + e);
	}
		throwTwo();
	}
}
