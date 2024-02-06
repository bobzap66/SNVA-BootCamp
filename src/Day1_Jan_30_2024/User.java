package Day1_Jan_30_2024;

import java.util.Scanner;

public class User {
	String name;
	int age;
	int height;
	int weight;
	String state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public User(String name, int age, int height, int weight, String state) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.state = state;
	}
	
	public void getUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		this.name = scanner.nextLine();
		System.out.println("Enter age");
		this.age = scanner.nextInt();
		System.out.println("Enter height in cms");
		this.height = scanner.nextInt();
		System.out.println("Enter weight in lbs");
		this.weight = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter state");
		this.state = scanner.nextLine();
		scanner.close();
	}
	
	
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "Name : " + name + "\nAge : " + age + "\nHeight : " + height + " cms\nWeight : " + weight + "lbs\nState : " + state;
	}
	
}
