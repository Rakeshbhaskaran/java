package EXCEPTIONHANDLING;

public class B {

	public B() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			System.out.println(4);
		}
		System.out.println(5);
	}

}
