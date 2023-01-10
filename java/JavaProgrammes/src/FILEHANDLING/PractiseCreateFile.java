package FILEHANDLING;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PractiseCreateFile {
	public static void main(String[] args) throws IOException {
		File file = new File("E://JAVA/Practise1.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File created");
		}
		else {
			System.out.println("file not created");
		}
		FileOutputStream foi = new FileOutputStream(file);
		String s="DONE SIR";
		foi.write(s.getBytes());
		foi.close();
		
		FileInputStream fis = new FileInputStream(file);
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
		fis.close();
		
	}

}
