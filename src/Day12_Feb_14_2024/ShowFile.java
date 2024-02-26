package Day12_Feb_14_2024;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) throws IOException {

		int i;
		FileInputStream fin;
		fin = new FileInputStream("./src/Day12_Feb_14_2024/File1.txt");

		
		try {
			do {
				i = fin.read();
				if( i != -1) System.out.println((char)i);
				
			} while( i != -1);
		} catch (IOException e) {
			System.out.println("IO Exception");
		} finally {
			fin.close();
		}
		

	}

}
