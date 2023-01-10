package interview;

import java.util.Scanner;

public class S5Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int temp=n;
		int s=0;
		while(n>0) {
			int rim=n%10;
			s=(s*10)+rim;
			n=n/10;
		}
		if(s==temp) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not palindrom");
		}
	}

}
