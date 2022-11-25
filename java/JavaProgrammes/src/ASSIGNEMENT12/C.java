package ASSIGNEMENT12;
import java.util.Scanner;
public class C {

	public C() {
		// TODO Auto-generated constructor stub
	}
	static String Unique (String s)
	{
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			if(ns.indexOf(s.charAt(i))==-1)
			{
				ns=ns+s.charAt(i);
			}
		}
		return ns;
	}
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=a1.next();
		System.out.println(Unique(s));
		
	}

}
