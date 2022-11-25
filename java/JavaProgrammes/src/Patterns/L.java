package Patterns;

public class L { // pattern assigenment 
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=3;i++)
		{
			for(int s=2;s>=i;s--)
			{
				System.out.print(" "+" ");
			}
			for(int c=1;c<=i;c++)
			{
				System.out.print(n+" ");
				n++;
			}
			for(int c=1;c<i;c++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
			n=1;
		}
	}

	
}
