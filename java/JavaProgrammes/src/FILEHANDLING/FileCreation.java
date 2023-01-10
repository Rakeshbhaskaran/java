package FILEHANDLING;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		File f1 = new File("E://JAVA/dummy file.txt");
		if(!f1.exists())
		{
			f1.createNewFile();
			System.out.println("file creted");
		}
		else
		{
			System.out.println("File not created");
		}
		FileOutputStream fio= new FileOutputStream(f1);
		String s ="why";
		fio.write(s.getBytes());
		fio.close();
		
		FileInputStream fis = new FileInputStream(f1);
		int i=fis.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fis.read();
		}
		
	}

}
