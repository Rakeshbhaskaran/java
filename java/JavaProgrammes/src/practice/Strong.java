package practice;
import java.util.Scanner;
public class Strong { // strong numbers in range

	public Strong() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter a range");
		int e= a1.nextInt();
		for(int i=1;i<=e;i++)
		{
			int n=i;
		int temp=n;
		int r=0;
		int s=0;
		while(n>0)
		{
			r=n%10;
			int p=1;
			while(r>0)
			{
				p=p*r;
				r--;
			}
			s=s+p;
			n=n/10;
		}
		if(s==temp)
		{
		System.out.println(temp);
		}
		
	}
	
	}
}
