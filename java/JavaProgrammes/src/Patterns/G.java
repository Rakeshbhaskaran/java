package Patterns;

public class G {

public static void main(String[] args) {
	for(int i=1;i<=3;i++)
	{
		for(int s=3;s>=i;s--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int j=1;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		
	}
	/*for (int i=1;i<=3;i++)
	{
		for(int s=1;s<i;s++)
		{
			System.out.print(" ");
		}
		for(int j=3;j>i;j--)
		{
			System.out.print("*");
		}
		for(int j=3;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}*/
}
}
