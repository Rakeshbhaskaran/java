package ObjectClass;

public class Hashcode {
int a;
	public Hashcode() {
		// TODO Auto-generated constructor stub
	}
	Hashcode(int a)
	{
		this.a=a;
	}
	public static void main(String [] args)
	{
		Hashcode a1 =new Hashcode(10);
		Hashcode a2=new Hashcode(20);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		a1=a2;
		System.out.println();
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		
		
	}

}
