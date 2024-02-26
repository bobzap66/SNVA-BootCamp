package Day12_Feb_14_2024;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		
		FileOutputStream fout = new FileOutputStream("./src/Day12_Feb_14_2024/File2.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		char ch;
		System.out.println("Enter data ('@' at the end");
		while((ch = (char)dis.read()) != '@') {
			fout.write(ch);
		};
		fout.close();
		
	}

}
