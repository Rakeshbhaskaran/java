package DataHiding;



public class B extends A {

	public B() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		B b1 =new B();
		System.out.println(b1.a);// can be accessed 
		/* where as b1.b is not possible as it is hidden using 
		 * private keyword (Data hideing)*/
	}

}
