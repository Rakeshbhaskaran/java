package NUMBERS;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n>0) {
			int rim=n%10;
			rev=(rev*10)+rim;
			n=n/10;
		}
		if(rev==temp) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
		
		
	}

}
