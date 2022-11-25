package Javaset1;

public class A3 {

	public A3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			char ch ='A';
			for(int c=1;c<=i;c++)
			{
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
