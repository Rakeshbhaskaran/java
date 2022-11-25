package EXCEPTIONHANDLING;

public class E {

	public E() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int a[]= new int [2];
		a[0]=1;
		a[1]=2;
		try {
			a[2]=2;
		}
		catch (ArithmeticException e) {
		System.out.println(4);
		}
		System.out.println(5);
		
		
	}

}
