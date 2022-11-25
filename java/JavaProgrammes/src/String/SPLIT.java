package String;

public class SPLIT {

	public SPLIT() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String s="My name is Ram";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		String s2[]=s.split("a");
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		
	}

}
