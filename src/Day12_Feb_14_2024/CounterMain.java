package Day12_Feb_14_2024;

public class CounterMain {

	public static void main(String[] args) {

		Counter counter = new Counter();
		
		Thread thread1 = new Thread(() -> {
			for(int i=0; i < 10; i++) {
				System.out.println("Thread1: " + i);
				counter.increment();
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for(int i=0; i < 15; i++) {
				System.out.println("Thread2: " + i);
				counter.increment();
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Final Count: " + counter.getCount());
	}

}
