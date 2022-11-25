package Patterns;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int a= a1.nextInt();
		int c=a;
		int r=0;
		int s=0;
		while(a>0)
		{
		r=a%10;
		s=(s*10)+r;
		a=a/10;
		}
		if(c==s)
		{
			System.out.println("palindrom");
		}
		else {
			System.out.println("not a palindrom");
		}
	}
}
