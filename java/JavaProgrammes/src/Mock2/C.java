package Mock2;
import java.util.Scanner;
public class C {

	public C() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Scanner a1 =new Scanner(System.in);
	System.out.println("enter a number");
	int a=a1.nextInt();
	for(int i=1;i<=a;i++)
	{
		int n=1;
		char ch='A';
		for(int j=1;j<=a;j++)
		{
			if(j==i)
			{
				System.out.print('@'+" ");
			}
			else if(j<i)
			{
				System.out.print(n++ + " ");
			}
			else 
			{
				
				System.out.print(ch++ + " ");
			}
		}
		System.out.println();
	}
}
}
