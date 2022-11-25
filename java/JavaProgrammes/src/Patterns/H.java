package Patterns;

public class H {

	public static void main(String[] args) {
		int b=65,a=65;
	for(int i=1;i<=11;i++)
	{
		if(i==6)
		{
			for(int j=1;j<=11;j++)
			{
				System.out.print((char)b+" ");
				b++;
			}
		}
		else
		{
			for(int j=1;j<=11;j++)
			{
				if(j==6)
				{
					System.out.print((char)a);
					a++;
				}
				else
				{
					System.out.print(' '+" ");
				}
			}
		}
		System.out.println();
	}
	}

}
