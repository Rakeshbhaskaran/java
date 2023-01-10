package FILEHANDLING;

import java.io.File;
import java.io.IOException;

public class createFileCat {
	public static void main(String[] args) throws IOException {
		File file = new File("E://JAVA/cat.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File created");
		}
		else {
			System.out.println("File not created");
		}
	}

}
