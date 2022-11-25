package String;

public class A {

	public A() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String s1= "jaavaa";
		int c=0;
		int v=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a')
			{
				c++;
			}
			else if(s1.charAt(i)=='v')
			{
				v++;
			}
		}
		System.out.println("number of a "+c);
		System.out.println("number of v "+v);
				
	}

}
