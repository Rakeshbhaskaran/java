package constructors;
import java.util.Scanner;
public class D { // print fibinocci seris till limit  digits
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter how many fibo is req");
		int l=a1.nextInt();
		int a=0,b=1,sum=0;
		for(int i=0;i<=l;i++)
		{
			if(i==0||i==1)
			{
				System.out.print(i+" ");
			}
			else 
			{
				sum=a+b;
				a=b;
				b=sum;
				System.out.print(sum+" ");
			}
				
		}
								
	}

}
