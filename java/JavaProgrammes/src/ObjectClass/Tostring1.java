package ObjectClass;

public class Tostring1 { // to overide toString method and print states or proprties of the class.

	public Tostring1() {
		// TODO Auto-generated constructor stub
	}
	int a=10;
	public String toString()
	{
		return " int A "+this.a;
	}
		public static void main(String[] args) {
			Tostring1 a1= new Tostring1();
			System.out.println(a1);
		}
}
