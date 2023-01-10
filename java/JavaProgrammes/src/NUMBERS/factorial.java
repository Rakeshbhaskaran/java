package NUMBERS;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int n=sc.nextInt();
		int p=1;
		while(n>0) {
			p=p*n;
			n--;
		}
		System.out.println("Factorial is "+p);
	}

}
