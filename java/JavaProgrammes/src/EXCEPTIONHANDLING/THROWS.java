package EXCEPTIONHANDLING;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.sql.SQLException;

public class THROWS { // throws used to propagate exception

	
	static void m() throws IOException ,ArrayIndexOutOfBoundsException
	{
		System.out.println("hello");
	}
	static void l() throws SQLException
	{
		
	}
	public static void main(String[] args) throws Exception{ 
		m();
		l();
	}

}
