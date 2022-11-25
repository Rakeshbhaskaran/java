package Patterns;

import java.util.Scanner;

public class I { // print each digit of number and number of digits
	

	public static void main(String[] args) {
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int a= a1.nextInt();
		
		int c=0;
		int p=0;
		while(a>0)
		{
			p=a%10;
			System.out.println(p);
			a=a/10;
			c++;
			
		}
		System.out.println("no of digit "+c);
	}

}
