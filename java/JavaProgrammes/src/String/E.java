package String;

import java.util.Arrays;

public class E { // remove duplicate values from the string

	public E() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String a="AABBCCAABCDFGHHEasdwer";
	char c[]	=a.toCharArray();
	Arrays.sort(c);
		char d[]=new char [c.length];
		int k=0;
		for(int i=0;i<(c.length-1);i++)
		{
			if(c[i]!=c[i+1])
			{
				d[k]=c[i];
				k++;
			}
		}
		d[k]=c[c.length-1];
		for(int i=0;i<d.length;i++)
		{
		System.out.println(d[i]);
		}
				
	}

}
