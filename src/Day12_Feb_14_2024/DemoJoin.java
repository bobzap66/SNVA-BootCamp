package Day12_Feb_14_2024;

public class DemoJoin {

	public static void main(String[] args) {
		NewThread obj1 = new NewThread("one");
		NewThread obj2 = new NewThread("two");
		NewThread obj3 = new NewThread("three");
		
		System.out.println("Thread one is alive: " + obj1.t.isAlive());
		System.out.println("Thread two is alive: " + obj2.t.isAlive());
		System.out.println("Thread three is alive: " + obj3.t.isAlive());
		try {
			System.out.println("Waiting for the threads to finish execution.");
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Threads interrupted");
		}
		System.out.println("Thread one is alive: " + obj1.t.isAlive());
		System.out.println("Thread two is alive: " + obj2.t.isAlive());
		System.out.println("Thread three is alive: " + obj3.t.isAlive());
		System.out.println("Exiting");
	}

}
