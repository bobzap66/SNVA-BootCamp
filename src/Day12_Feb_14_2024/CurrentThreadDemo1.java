package Day12_Feb_14_2024;

public class CurrentThreadDemo1 {

	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: " + t);
		
		t.setName("Bob");
		System.out.println("Current Thread: " + t);
		try {
		for(int i =0; i < 10; i++) {
			System.out.println(i);
				Thread.sleep(5000);
			
		}} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Task Completed");
	}

}
