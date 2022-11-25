package math;
import java.util.Scanner;
public class F {

	static boolean isArmstrong(int n)
	{
		int n1=n;
		int n2=n;
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		int r=0;
		int s=0;
		while(n1>0)
		{
			r=n1%10;
			s=s+(int)Math.pow(r, c);
			n1=n1/10;
		}
		if (s==n2)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner a1 =new Scanner (System.in);
		System.out.println("Enter a number");
		
		
			if(isArmstrong(a1.nextInt()) == true)
			{
				System.out.println("armstrong number");
			}
			else 
			{
				System.out.println("not a armstrong number");
			}
		
	}

}
