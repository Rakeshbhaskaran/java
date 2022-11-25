package practice;
import java.util.Scanner;
public class Palindrom {

	public Palindrom() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = a1.nextInt();
		int temp= n;
		int r=0;
		int s=0;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(s==temp)
		{
			System.out.println(temp +" Number is palindrom");
		}
		else
		{
			System.out.println(temp+" Number is not palindrom");
		}
	}

}
