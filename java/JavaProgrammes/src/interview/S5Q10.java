package interview;

import java.util.Scanner;

public class S5Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		int p=1;
		while(n>0) {
			int rim=n%10;
			p=p*rim;
			n=n/10;
		}
		System.out.println("product of digits is "+p);
	}

}
