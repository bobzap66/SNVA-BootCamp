package Da5_Feb_5_2024;

public class BoxWeight extends Box{
	private double weight;

	public BoxWeight(double width, double depth, double height, double weight) {
		super(width, depth, height);
		this.weight = weight;
	}

	public BoxWeight() {
//		super();
		this.weight = 100;
	}
	
	public BoxWeight(double len, double weight) {
		super(len);
		this.weight = weight;
	}
	
	public BoxWeight(Box obj, double weight) {
		super(obj);
		this.weight = weight;
	}
	
	public BoxWeight(BoxWeight obj) {
		super(obj.getWidth(), obj.getLength(), obj.getHeight());
		this.weight = obj.getWeight();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
