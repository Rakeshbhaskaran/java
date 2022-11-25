package ASSIGNEMENT12;

public class E {

	public E() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String s="My name is Ram";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String t=s1[i];
			if(t.equals("name"))
			{
				String nt="";
				for(int j=0;j<t.length();j++)
				{
					nt=t.charAt(j)+nt;
				}
				System.out.print(nt+" ");
			}
			else
			{
				System.out.print(s1[i]+" ");
			}
		}
		
		
	}

}
