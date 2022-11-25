package practice;
import java.util.Scanner;
public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Scanner a1 =new Scanner(System.in);
	System.out.println("Enter a number");
	int n=a1.nextInt();
	int r=0;
	int p=1;
	while(n>0)
	{
		
		p=p*n;
		n--;
	}
	System.out.println("Factorial is "+p);
}
}
