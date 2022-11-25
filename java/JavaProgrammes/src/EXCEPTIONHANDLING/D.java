package EXCEPTIONHANDLING;

public class D { // write only risky code in try block because 

	public D() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		try {
		System.out.println(1);
		System.out.println(2/0);
		System.out.println(3);
		System.out.println(4);
		}
		catch(ArithmeticException e) {
			System.out.println(5);
			System.out.println(6);
		
		
	}
	}

}
