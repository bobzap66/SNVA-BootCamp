package Day5_Feb_5_2024;

public class Box {
	private double width;
	private double depth;
	private double height;
	public Box(double width, double depth, double height) {
		super();
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	public Box() {
		super();
		width = 1;
		height = 5;
		depth = 10;
	}
	
	
	public Box(double len) {
		super();
		this.width = this.depth = this.height = len;
	}
	public Box(Box obj) {
		this.width = obj.width;
		this.depth = obj.depth;
		this.height = obj.height;
	}
	
	double calculateVolume() {
		double volume = depth * width * height;
		return volume;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return depth;
	}
	public void setLength(double depth) {
		this.depth = depth;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
