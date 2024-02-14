package Day12_Feb_14_2024;

public class Caller implements Runnable {

	String msg;
	CallMe target;
	Thread t;
	public Caller(CallMe targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		synchronized(target) {
			target.call(msg);
		}
	}
	
	

}
