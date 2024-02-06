package Day3_Feb_1_2024;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
	
	Map<String, Pastry> inventory;
	
	public Inventory() {
		super();
		populateInventory();
	}

	public void populateInventory() {
		inventory = new HashMap<String,Pastry>(); 
		Pastry pastry = new Pastry("Black Current", 5);
		inventory.put(pastry.getName(), pastry);
		pastry = new Pastry("White Forest", 3);
		inventory.put(pastry.getName(), pastry);
		pastry = new Pastry("Chocolate", 4);
		inventory.put(pastry.getName(), pastry);
		pastry = new Pastry("Red Velvet", 4.5);
		inventory.put(pastry.getName(), pastry);
		
	}
	
	public void printInventory() {
		for(String key : inventory.keySet()){
			System.out.printf(inventory.get(key).name + ": $%.2f\n", inventory.get(key).price);
			
		}
	}

	public Map<String, Pastry> getInventory() {
		return inventory;
	}

	public void setInventory(Map<String, Pastry> inventory) {
		this.inventory = inventory;
	}
	
	public void printOrder() {
		Pastry pastry = new Pastry();
		Double total = 0.0;
		Double itemTotal = 0.0;
		for(String key : inventory.keySet()){
			pastry = inventory.get(key);
			itemTotal = pastry.price * pastry.number; 
			System.out.printf(pastry.name + ": $%.2f * ", inventory.get(key).price);
			System.out.printf(pastry.number + " = $%.2f\n" , itemTotal);
			total = total + itemTotal;
			
		}
		System.out.println("===========================================================");
		System.out.printf("Total: $%.2f\n", total);
	}

}
