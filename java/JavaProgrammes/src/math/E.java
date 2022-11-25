package math;
import java.util.Scanner;
public class E { // palindrom 
	
	static boolean isPalindrom(int n)
	{
		int n1=n;
		int r=0;
		int s=0;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		System.out.println(s);
		System.out.println(n1);
		if(s==n1)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}

	public static void main(String[] args) {
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter a number");
		int n= a1.nextInt();
		if(isPalindrom(n) == true)
		{
			System.out.println("number is palindrom");
		}
		else
		{
			System.out.println("number is not palindrom");
		}
	}
}
