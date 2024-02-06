package Day3_Feb_1_2024;


import java.util.Map;
import java.util.Scanner;

public class Bakery {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		System.out.println("===========================================================");
		inventory.printInventory();
		Map<String, Pastry> order = inventory.getInventory();
		System.out.println("===========================================================");
		Scanner scanner = new Scanner(System.in);
		Pastry pastry = new Pastry();
		for(String key : order.keySet()) {
			pastry = order.get(key);
			System.out.println("How many " + pastry.getName() + "s would you like?");
			pastry.setNumber(scanner.nextInt());
			
		}
		scanner.close();
		inventory.printOrder();
	}

}
