package Day13_Feb_15_2024;

public class StaticConstr {
	
	static {
		System.out.println("Demo: Static block loaded");
	}
	StaticConstr() {
		System.out.println("Default Constructor Loaded");
	}
	static {
		System.out.println("Demo: Static block 2 loaded");
	}
}
