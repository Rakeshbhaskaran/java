package ObjectClass;

public class Equals {

	public Equals() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Equals a1 =new Equals();
		Equals a2 =new Equals();
		System.out.println(a1.equals(a2));
		a1=a2;
		System.out.println(a1.equals(a2));
	}

}
