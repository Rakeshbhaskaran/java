package WRAPPERCLASS;

public class E { // converting String to primitive types

	public E() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String s1="10";
		System.out.println(s1+20);//1020
		int a=Integer.parseInt(s1);
		System.out.println(a+20);//30
		
		String s2="ELF39OCT15";
		char ch[]=s2.toCharArray();
		int b=0;
		int s=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]<='9' && ch[i]>='0')
			{
				s=s+Integer.parseInt(ch[i]+"");
			}
			
		}
		
	}

}
