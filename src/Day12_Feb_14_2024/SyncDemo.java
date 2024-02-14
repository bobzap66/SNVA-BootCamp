package Day12_Feb_14_2024;

public class SyncDemo {

	public static void main(String[] args) {

		CallMe target = new CallMe();
		Caller obj1 = new Caller(target, "Hello");
		Caller obj2 = new Caller(target, "World");
		Caller obj3 = new Caller(target, "Synchronized");
		
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch (InterruptedException e) {
				System.out.println("Interrupted");
		}
		
		
	}

}
