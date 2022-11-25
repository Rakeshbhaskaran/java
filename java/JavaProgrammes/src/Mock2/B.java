package Mock2;

public class B { // patterns

	public B() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int k=1;
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=(5-i);s++)
			{
				System.out.print(" ");
			}
			for(int n=1;n<=i;n++)
			{
				if(i%2==0)
				{
					System.out.print(k++ + " ");
				}
				else
				{
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();
			ch='A';
		}
	}

}
