package constructors;
import java.util.Scanner;
public class E { // finbinooci series with user limit

	public static void main(String[] args) {
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter limit");
		int l=a1.nextInt();
		int a=0,b=1,s=0;
		for(int i=0;i<l;i++)
		{
			if(i==0||i==1)
				{
				System.out.println(i+" ");
				}
			else 
			{ s=a+b;
				a=b;
				b=s;
				System.out.println(s);
				
		}
			
		}
		
	}
}
