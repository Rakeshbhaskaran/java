package Javaset1;
import java.util.Scanner;
public class A6 {

	public A6() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter a string");
		String s= a1.nextLine();
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
			
		}
		if(rev.equals(s))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}

}
