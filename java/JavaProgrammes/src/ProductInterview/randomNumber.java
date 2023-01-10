package ProductInterview;

public class randomNumber {
	public static void main(String[] args) {
		int max=200;
		int min =100;
		double d=Math.random();
		System.out.println(d);
		int n =(int)(d*(max-min+1)+min);
		System.out.println(n);
	}

}
