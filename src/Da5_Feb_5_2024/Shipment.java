package Da5_Feb_5_2024;

public class Shipment extends BoxWeight {
	private double cost;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Shipment() {
		super();
		cost = 100;
	}

	public Shipment(double width, double length, double height, double weight, double cost) {
		super(width, length, height, weight);
		this.cost = cost;
	}
	
	public Shipment(BoxWeight obj, double cost) {
		super(obj);
		this.cost = cost;
	}
	
	public Shipment(Box obj, double weight, double cost) {
		super(obj, weight);
		this.cost = cost;
	}
	
	public Shipment(double len, double weight, double cost) {
		super(len, weight);
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "volume = " + calculateVolume() + " and weight = " + getWeight() + " and cost = " + getCost() + "";

	}

}
