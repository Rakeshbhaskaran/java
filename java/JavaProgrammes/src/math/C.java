package math;
import java.util.Scanner;
public class C { // amstong number

	public static void main(String[] args) {
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter a number");
		int a=a1.nextInt();
		int b=a;
		int check=a;
		int c=0;
		int r=0;
		while(a>0)
		{
			a=a/10;
			c++;
		}
		int s=0;
		while(b>0)
		{
		r=b%10;
		s=s+(int)Math.pow(r, c);
		b=b/10;
		}
		if (check==s)
		{
		System.out.println("amstrong number");
		}
		else 
		{
		System.out.println("not a amstrong number");
		}	
	}
} 
