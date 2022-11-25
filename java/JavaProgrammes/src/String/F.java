package String;
import java.util.Scanner;
public class F { // remove duplicate values from the string

	public F() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 =a1.next();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(s2.indexOf(c)==-1)
			{
				s2=s2+c;
			}
		}
		System.out.println(s2);
		
	}

}
