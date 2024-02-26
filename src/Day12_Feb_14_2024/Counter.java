package Day12_Feb_14_2024;

public class Counter {

		private int count = 0;
		
		public synchronized void increment() {
			count++;
		}
		
		public synchronized int getCount() {
			return count;
		}
	
}
