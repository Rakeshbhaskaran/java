package FILEHANDLING;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeInCatFile {
	public static void main(String[] args) throws IOException {
		/*File file = new File("E://JAVA/cat.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File created");
		}
		else {
			System.out.println("File not created");
		}*/
		
		FileOutputStream fos = new FileOutputStream("E://JAVA/cat.txt");
		String s ="game on";
		fos.write(s.getBytes());
		fos.close();
		
		FileInputStream fis = new FileInputStream("E://JAVA/cat.txt");
			int n = fis.read();
			while(n!=-1) {
				System.out.print((char)n);
				n=fis.read();
			}
		
	}

}
