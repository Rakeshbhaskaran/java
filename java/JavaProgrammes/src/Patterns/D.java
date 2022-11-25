package Patterns;

public class D { // print R pattern
	public static void main(String[] args) {
		for (int i=1;i<=6;i++)
		{
			if(i== 1||i==3)
			{
				for(int j=1;j<=4;j++)
				{
					System.out.print("*"+" ");
				}
				
			}
			else if(i==2||i==6)
			{
				for(int j=1;j<=4;j++)
				{
					if(j==2||j==3)
					{
					System.out.print(" "+" ");
					}
					else
					{
						System.out.print("*"+" ");
					}
				}
				
			}
			else if(i==4) 
			{
				for(int j=1;j<=4;j++)
				{
					if(j==3||j==4)
					{
					System.out.print(" "+" ");
					}
					else
					{
						System.out.print("*"+" ");
					}
				}
				
			}
			else
			{
				for(int j=1;j<=4;j++)
				{
					if(j==4||j==2)
					{
					System.out.print(" "+" ");
					}
					else
					{
						System.out.print("*"+" ");
					}
				}
				
			}
			System.out.println();
			
		}
	}


}
