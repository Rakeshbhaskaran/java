package NUMBERS;

import java.util.Scanner;

public class fiboncci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<n-1;i++) {
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
		
	}

}
