package NUMBERS;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		int temp=n;
		int s=0;
		while(n>0) {
			int r=n%10;
			s=s+(int)Math.pow(r, 3);
			n=n/10;
		}
		if(s==temp) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
			
	}
}
