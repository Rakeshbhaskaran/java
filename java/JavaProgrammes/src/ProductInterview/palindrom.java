package ProductInterview;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		int temp=n;
		int s=0;
		while(n>0) {
			int rev=n%10;
			s=(s*10)+rev;
			n=n/10;
		}
		if(temp==s) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
		
	}
}
