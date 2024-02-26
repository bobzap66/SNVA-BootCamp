package Day13_Feb_15_2024;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private int sno;
	private String sname;
	private float avg;
	
	public Student() {
	}
	public Student(int sno, String sname, float avg) {
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
	}
	
	public void studentDetails() {
		System.out.println("Student No: " + sno + " \nStudent Name: " + sname + " \nAverage: " + avg);
		
	}
	
	
}
