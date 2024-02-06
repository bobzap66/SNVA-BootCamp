package Day3_Feb_1_2024;

public class Pastry {
	String name;
	double price;
	int number = 0;
	
	public Pastry() {
		super();
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Pastry(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	

}
