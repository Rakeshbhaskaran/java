package practice;
import java.util.Scanner;
public class Armstrong {

	public Armstrong() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter a number");
		int n=a1.nextInt();
		int temp=n;
		int temp1=temp;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		int r=0;
		int s=0;
		while(temp>0)
		{
			r=temp%10;
			s=s+(int)Math.pow(r, count);
			temp=temp/10;
		}
		if(temp1==s)
		{
			System.out.println(temp1+" Number is armstrong");
		}
		else
		{
			System.out.println(temp1+" Number is not armstrong");
		}
		
		
	}

}
