package Day12_Feb_14_2024;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateFile2 {

	public static void main(String[] args) throws Exception {

		String str  = "\nThis is from CreateFile2.java Welcome to copying of data";
		FileWriter fw = new FileWriter("./src/Day12_Feb_14_2024/File2.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i = 0; i < str.length(); i++)
			bw.write(str.charAt(i));
		
		bw.close();
		fw.close();
				

	}

}
