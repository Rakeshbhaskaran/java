package upcastingDowncasting;

public class B extends A {

	  int c=10;
	 public static void main(String[] args) {
		A a1 =new A();
		B b1 = new B();
		a1=b1; // upcasting
		B b2 = (B) a1; // downcasting
		System.out.println(b2.c);
		
		Object  o = new B();
		B b3 =(B) o;
		System.out.println(b3.a);
		System.out.println(b3.b);
		System.out.println(b3.c);
	}
	

}
