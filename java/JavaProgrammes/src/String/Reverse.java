package String;

public class Reverse {
	
	public static void main(String[] args) {
		
		String s ="CHINMAYI";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);	
	}	
}
