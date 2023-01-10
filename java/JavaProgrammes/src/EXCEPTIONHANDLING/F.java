package EXCEPTIONHANDLING;

public class F { /* if we do not know what type of exception 
	write Throwable exception (as it is super most class in exception) */ 

	public F() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int a[]=null;
		try {
			System.out.println(a[0]);
		}
		catch(Throwable e) {
			System.out.println("handled");
			System.out.println(e);
		}
		
	}

}
