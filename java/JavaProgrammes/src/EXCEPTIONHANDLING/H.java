package EXCEPTIONHANDLING;

public class H { // nested try block

	public H() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		try
		{
			System.out.println(1);
			System.out.println(2);
			try {
				System.out.println(3/0);
				System.out.println(4);
			}
			catch(Exception e) {
			System.out.println("true");}
		}
		
		catch (Exception e) {
			System.out.println(10);
			System.out.println(11);
			
		}
		System.out.println(14);
	}

}
