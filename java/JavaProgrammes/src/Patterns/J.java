package Patterns;

import java.util.Scanner;

public class J { // to reverse a number
 public static void main(String[] args) {
		
			Scanner a1 = new Scanner(System.in);
			System.out.println("Enter a number");
			int a= a1.nextInt();
			int r=0;
			int s=0;
			while(a>0)
			{
				r=a%10;
				s=(s*10)+r;
				a=a/10;
				
				
			}
			System.out.println("Reversed number "+s);
			
			
}

}
