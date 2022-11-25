package callingFromDiffClass;

public class A {
	static int a=10;
	int b=20;
	A()
	{ 
		System.out.println("constuctor from A");
	}
	{
		System.out.println("Non-static block");
	}
	static {
		System.out.println("static block");
	}
static void add()
{ 
	System.out.println("static method from A");
	}
void sub()
 {
	System.out.println("non static method from A");
	 
 }
 public static void main(String [] args)
 {
	add();
	A a1 =new A();
	a1.sub();
	
	
 }
 
}
