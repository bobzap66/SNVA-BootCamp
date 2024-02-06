package Da5_Feb_5_2024;

public class InheretMain {

	public static void main(String[] args) {
		Box box1 = new Box();
		System.out.println("Box 1 has a volume of " + box1.calculateVolume());
		Box box2 = new Box(1, 2, 3);
		System.out.println("Box 2 has a volume of " + box2.calculateVolume());
		Box box3 = new Box(5);
		System.out.println("Box 3 has a volume of " + box3.calculateVolume());
		
		BoxWeight box7 = new BoxWeight();
		
		System.out.println("Box7 has a volume of " + box7.calculateVolume() + " and a weight of "+ box7.getWeight() +".");
		
		BoxWeight box8 = new BoxWeight(5, 6, 2, 54);
		
		//System.out.println("Box8 has a volume of " + box8.calculateVolume() + " and a weight of "+ box8.getWeight() +".");
	
		Shipment shipment1 = new Shipment();
		System.out.println("Shipment 1 (constructor: default): " + shipment1.toString());
		Shipment shipment2 = new Shipment(box2, 15, 240);
		System.out.println("Shipment 2 (constructor: Box object, weight, cost): " + shipment2.toString());
		Shipment shipment3 = new Shipment(2, 4, 5, 15, 200);
		System.out.println("Shipment 3 (constructor: width, depth, height, weight, cost): " + shipment3.toString());
		Shipment shipment4 = new Shipment(4, 12, 225);
		System.out.println("Shipment 4  (constructor: length, weight, cost): " + shipment4.toString());
		Shipment shipment5 = new Shipment(box7, 118);
		System.out.println("Shipment 5 (constructor: BoxWeight object, cost): " + shipment5.toString());

		
	}
	

}
