package Day13_Feb_15_2024;

public class ForName {

	public static void main(String[] args) throws Exception {

		Class c = Class.forName("java.lang.System");
		System.out.println(" Name of the loaded class is " + c.getName());
		System.out.println("Is it an interface?: " + c.isInterface());
		String s = new String("Okay");
		
		System.out.println();
		System.out.println("Class of s object is " + s.getClass());
		System.out.println("Class of c object is " + c.getClass());
	}

}
