package ASSIGNEMENT12;

public class B {

	public B() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String s1="hi helo the hi the the the";
		String s[]=s1.split(" ");
		int c=0;
		String check="the";
		for(int i=0;i<s.length;i++)
		{
			String temp=s[i];
			if(temp.equals("the"))
			{
				c++;
			}
		}
		System.out.println("number times the present "+c);
	}

}
