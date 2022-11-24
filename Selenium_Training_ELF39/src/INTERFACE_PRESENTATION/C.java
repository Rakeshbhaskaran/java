package INTERFACE_PRESENTATION;

public class C implements B{

	public C() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add() {
		
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		
	}
	public void multi()
	{
		System.out.println("class C");
	}
	
	
	public static void main(String[] args) {
		System.out.println(a);
		
		B.multi();
		C c1 = new C();
		c1.multi();
	}

}
