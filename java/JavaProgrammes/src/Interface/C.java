package Interface;

public  class C implements A,B {

	public C() {
		// TODO Auto-generated constructor stub
	}
	public void multi ()
	{
		System.out.println("Multi");
	}
	public void add()
	{
		System.out.println("Add");
	}
	public  void sub()
	{
		System.out.println("Sub");
	}
public static void main(String args [] )
{
	System.out.println(C.a);
	A.add(10);
	System.out.println(C.b);
	String  a[]= {"Cat"};
	A.main(a);
	
	}
}
