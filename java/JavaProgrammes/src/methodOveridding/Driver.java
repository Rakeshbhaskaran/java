package methodOveridding;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Vehicle v1 =new Vehicle();
		System.out.println(v1.wheels());
		Bike b1=new Bike();
		System.out.println(b1.wheels());
		v1 =b1;
		System.out.println(v1.wheels());
		Van va =new Van();
		System.out.println(va.wheels());
		v1=va;
		System.err.println(v1.wheels());
		System.out.println(b1.wheels());
		
		
	}

}
