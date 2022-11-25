package methodOveridding;

public class Bike extends Vehicle {

	 int wheels()
	{
	return 2;
	}
	 public static void main(String[] args) {
		 Bike b1=new Bike();
		 
			System.out.println(b1.wheels());
	}
	 
	
	

}
