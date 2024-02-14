package Day12_Feb_14_2024;

public class NewThread implements Runnable {
	
	String name; // Thread name
	Thread t;
	NewThread(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread " + t);
		t.start();
	}
	@Override
	public void run() {
		try {
			for(int ctr = 5; ctr > 0; ctr --) {
				System.out.println(name + ":" +ctr);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("It's me, " + name+"! I'm dying! What a world, what a world!");
	}

}
