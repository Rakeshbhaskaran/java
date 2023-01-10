package math;

public class random_number {
	
	public static void main(String[] args) {
		int max=600;
		int min =200;
		double d=Math.random();
		System.out.println(d);
		int random_number = (int)(d*(max-min+1)+min);
		System.out.println(random_number);
		
	}

}
