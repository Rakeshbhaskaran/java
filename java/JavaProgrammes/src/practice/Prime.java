package practice;
import java.util.Scanner;
public class Prime {

	public Prime() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Scanner a1 =new Scanner(System.in);
	System.out.println("Enter a positive integer number");
	int n = a1.nextInt();
	if(n==1||n==0)
	{
		System.out.println("Number is not prime nor composite");
	}
	else if(n==2)
	{
		System.out.println("Number is prime");
	}
	else
	{
	boolean key = true;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{ key = false; }
	}
	if(key == true )
	{ System.out.println(n +" Number is prime");}
	
	else
	{ System.out.println(n+" Number is composite");}
	
	
}
}
}

