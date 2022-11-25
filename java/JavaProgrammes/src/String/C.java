package String;
import java.util.Scanner;
public class C { /* Wap to declare a string using scanner class and revese
				the string check whether the reversed string is equal 
				to actual string (Palindrom)*/

	public C() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter a string data");
		String s= a1.next();
		String s1=s;
		String a="";
		for(int i=0;i<s.length();i++)
		{
			a=s.charAt(i)+a;
			
		}
		if(a.equals(s1))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}

}
