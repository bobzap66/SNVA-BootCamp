package Day12_Feb_14_2024;

public class MultiThreadDemo {

	public static void main(String[] args) {

		new NewThread("one");
		new NewThread("two");
		new NewThread("three");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Thread interrupted");
		}
		System.out.println("Exiting Main");
	}

}
