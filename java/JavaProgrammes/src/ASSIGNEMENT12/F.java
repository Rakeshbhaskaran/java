package ASSIGNEMENT12;

public class F {

	public F() {
		// TODO Auto-generated constructor stub
	}
	static String reverse(String s)
	{
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			ns=s.charAt(i)+ns;
		}
		return ns;
	}
	public static void main(String[] args) {
		String s= "dolu bolu Raju chutki ankitha Anusara aunty";
		String s1=s.toLowerCase();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			String t=s2[i];
			if(t.startsWith("a") && t.endsWith("a"))
			{
				String rev =reverse(t);
				System.out.print(rev+" ");
			}
			else
			{
				System.out.print(t+" ");
			}		
		}
	}
}
