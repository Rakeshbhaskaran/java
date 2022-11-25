package Package1;
import Package2.*;
public class A {

	public int a=10;
	public int b=20;
	public static int c=30;
	public void add()
	{
		System.out.println("methos 1");
	}
	public static void main(String[] args) {
		A a1 =new A();
		System.out.println(a1.a);
		Package2.A a2 =new Package2.A();
		System.out.println(a2.a);
		
		
		
	}
	

}
