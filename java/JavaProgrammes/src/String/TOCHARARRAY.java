package String;

public class TOCHARARRAY {

	public TOCHARARRAY() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String s1= "JAVA";
		char c[]=s1.toCharArray();
		char rev[]=new char[c.length];
		int k=0;
		for(int i=(c.length-1);i>=0;i--)
		{
			rev[i]=c[k];
			k++;
		}
		//rev[k]=c[0];
		for(int i=0;i<rev.length;i++)
		{
			System.out.println(rev[i]);
		}
	}

}
