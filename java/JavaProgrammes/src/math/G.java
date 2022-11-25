package math;
import java.util.Scanner;
public class G { // sum of factorial of each digit of a number
	public static void main(String[] args) {
		
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter a range start");
		int n= a1.nextInt();
		System.out.println("Enter a range end");
		int nl= a1.nextInt();
		for(int i=n;i<=nl;i++)
		{
			if(isStrong(i)==true)
			{
				System.out.println(i +" is strong number");
			}
		}
	}
		static boolean isStrong (int n) {
			int temp =n;
			int r=0;
		int s=0;
		while(n>0)
		{
			r=n%10;
			int p=1;
			for (int i=1;i<=r;i++)
			{
				p=p*i;
			}
			s=s+p;
			n=n/10;
		}
		if (s==temp)
		{ return true; }
		else 
		{ return false; }
	}

	
}
