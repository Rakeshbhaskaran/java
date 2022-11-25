package Javaset1;
import java.util.*;
public class A2 {

	public A2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner a1 =new Scanner(System.in);
		System.out.println("enter a number");
		int n=a1.nextInt();
		int temp=n;
		int temp1=n;
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		int s=0;
		int r=0;
		while(temp>0)
		{
			r=temp%10;
			s=s+(int)Math.pow(r, c);
			temp=temp/10;
		}
		if(s==temp1)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
		
		
	}

}
