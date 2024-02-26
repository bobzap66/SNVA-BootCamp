package Day13_Feb_15_2024;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		Student student = new Student(101, "Bala", 90.04f);
		
		FileOutputStream fos = new FileOutputStream("./src/Day13_Feb_15_2024/File1.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(student);
		fos.close();
		oos.close();
	}

}
