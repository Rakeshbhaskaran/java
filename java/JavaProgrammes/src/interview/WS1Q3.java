package interview;

public class WS1Q3 {
	public static void main(String[] args) {
		int count=0;
		int s=0;
		for(int i=10;i<=50;i++) {
			if(i%2!=0) {
				count++;
				s=s+i;
			}
		}
		System.out.println("number odd number is "+count);
		System.out.println("sum of odd numbers is "+s);
	}

}
