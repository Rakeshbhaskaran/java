package Patterns;

public class A { // PATTERNS

	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for(int c=5;c>=i;c--)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
