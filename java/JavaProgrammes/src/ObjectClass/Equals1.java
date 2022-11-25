package ObjectClass;

public class Equals1 {
		int a;
	public Equals1() {
		// TODO Auto-generated constructor stub
	}
	Equals1(int a) // constructor to intialize global variables
	{
		this.a=a;
	}
	public boolean equals(Object o)

	{
		Equals1 b =(Equals1) o;
		return this.a==b.a;
		
	}
	public static void main(String[] args) {
		Equals1 a1=new Equals1(10);
		Equals1 a2= new Equals1(20);
		System.out.println(a1.equals(a2));
		
	}

}
