package EXCEPTIONHANDLING;

public class G { /* We can have multiple catch blocks for single try block
 					(first matching catch block will be excuted ) but we cannot 
 					have multiple try blocks */

	public G() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int a[]=null;
		try {
			a[0]=1;
		}
		catch(ArithmeticException e) {
			System.out.println("False");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("False");
		}
		catch(NullPointerException e) {
			System.out.println("True");
		}
	}

}
