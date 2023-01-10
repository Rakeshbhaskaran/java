package FILEHANDLING;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CreatingFile {

	public CreatingFile() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException {
		File f1 = new File("E://JAVA/Demo.text");
		if(!f1.exists())
		{
			f1.createNewFile();
			System.out.println("file creted");
		}
		else
		{
			System.out.println("File not created");
		}
		
		FileInputStream fis = new FileInputStream(f1);
		int i= fis.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fis.read();
			
		}
		fis.close();
		
		FileOutputStream fos = new FileOutputStream(f1);
		String s= "CARPE DIEM";
		fos.write(s.getBytes());
		fos.close();	
		
	}
	

}
