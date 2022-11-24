package TESTNG_BASICS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class WW_PROPERTY_FILE {

	@Test
	public void propertyDemo() throws IOException
	{
		String filepath="./test_configuration/testconfigaration.properties";
		FileInputStream fis = new FileInputStream(filepath);
		
		// creating an object for proprties calss
		Properties prop = new Properties();
				prop.load(fis);
				System.out.println(prop.get("Firstname"));
				System.out.println(prop.get("Lastname"));
	}

}
