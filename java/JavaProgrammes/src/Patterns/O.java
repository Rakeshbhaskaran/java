package Patterns;

public class O {

	public O() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		for(int i=1 ;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("^"+" ");
			}
			System.out.println();
		}
		for(int i=1 ;i<=6;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("^"+" ");
			}
			System.out.println();
		}
	}
}
