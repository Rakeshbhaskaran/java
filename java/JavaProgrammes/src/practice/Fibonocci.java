package practice;
import java.util.Scanner;
public class Fibonocci {

	public Fibonocci() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner a1 =new Scanner (System.in);
		System.out.println("Enter range");
		int r= a1.nextInt();
		int a=0;
		int b=1;
		int s=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		while((r-2)>0)
		{
			s=a+b;
			System.out.print(s+" ");
			a=b;
			b=s;
			r--;
			
		}
		
		
	}

}
