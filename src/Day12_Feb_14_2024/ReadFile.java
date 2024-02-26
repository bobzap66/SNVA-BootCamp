package Day12_Feb_14_2024;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./src/Day12_Feb_14_2024/File2.txt");
		FileOutputStream fos = new FileOutputStream("./src/Day12_Feb_14_2024/File3.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedInputStream bin = new BufferedInputStream(fis);
		int i;
		while((i=bin.read()) != -1)
			bos.write(i);
		bin.close();
		bos.close();

	}

}
