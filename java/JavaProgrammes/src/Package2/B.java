package Package2;
import Package1.A;
public class B {

	public static void main(String[] args) {
		A a1 =new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(A.c);
		a1.add();
		
	}

}
