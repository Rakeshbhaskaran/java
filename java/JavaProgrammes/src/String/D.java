package String;

public class D {

	public D() { // to remove all the 'A' characters from the string
		// TODO Auto-generated constructor stub
	}
		public static void main(String[] args) {
			String a="ABCAABCAABC";
			String n="";
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i)!='A') 
				{
					n=n+a.charAt(i);
				}
			}
			System.out.println(n);			
		}
}
