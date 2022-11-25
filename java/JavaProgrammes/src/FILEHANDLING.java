import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FILEHANDLING{

	
	public static void main(String[] args) throws IOException {
		File f1= new File("Demo.txt");
		if(!f1.exists())
		{
			f1.createNewFile();
			System.out.println("File created");
			
		}
		else
		{
			System.out.println("File not created");
		}
		
		FileOutputStream fos =new FileOutputStream(f1);
		String s="New day good day";
		fos.write(s.getBytes());
		fos.close();
		
		FileInputStream fis= new FileInputStream(f1);
		int i=fis.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fis.read();
		}
		fis.close();
		
	}

}
