package EXCEPTIONHANDLING;


public class I { 

	public I() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		try
		{
			System.out.println(1);
			System.out.println(2);
			try {
				System.out.println(3);
			}
			catch(Exception e) {
				System.out.println(4);
			}
			finally {
				System.out.println(5);
			}
			System.out.println(6);
			}
		catch(Exception e) {
			System.out.println(7);
			try {
				System.out.println(9);
			}
			catch(Exception f) {
				System.out.println(10);	
			}
			finally {
				System.out.println(11);
			}
		}
		finally {
			System.out.println(12);
		}
	}
	

}
