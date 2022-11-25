package Patterns;

public class M { //pattern assignment
	public static void main(String[] args) {
		char ch ='A';
		for(int i=1;i<=3;i++)
		{
			for(int s =1;s<=i;s++)
			{
				System.out.print(" "+" ");
			}
			for(int c=3;c>=i;c--)
			{
				System.out.print(ch+" ");
				ch++;
			}
			for(int c=3;c>i;c--)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			ch ='A';
		}
	}

	
}
