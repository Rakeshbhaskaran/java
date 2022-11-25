package Patterns;

public class N {

	public N() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		char ch ='A';
		int n=1;
		for(int i=1;i<=4;i++)
		{
			if(i==1||i==4)
			{
				for(int j=1;j<=4;j++)
				{
					System.out.print(ch);
					ch++;
				}
			}
			else
			{
				for(int j=1;j<=4;j++)
				{
					if(j==1||j==4)
					{
						System.out.print(ch);
						ch++;
					}
					else
					{
						System.out.print(n);
						n++;
					}
				}
			}
			System.out.println();
		}
	}

}
