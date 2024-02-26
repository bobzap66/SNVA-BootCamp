package Day13_Feb_15_2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./src/Day13_Feb_15_2024/File1.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		
		Student st1 = (Student) obj;
		st1.studentDetails();

	}

}
