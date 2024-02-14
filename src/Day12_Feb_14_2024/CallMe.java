package Day12_Feb_14_2024;

public class CallMe {

		void call(String msg) {
			System.out.print("["+ msg);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
			System.out.print("]");
		}
}
