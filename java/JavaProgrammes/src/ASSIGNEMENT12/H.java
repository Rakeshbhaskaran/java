package ASSIGNEMENT12;

public class H {

	public H() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int n=01;
		int c=10;
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				for(int j=1;j<=5;j++)
				{
					if(c<10 &&c>0) {
					System.out.print("0"+c--+" ");	
					}
					else
					{System.out.print(c--+" ");}
				}
				c=c+15;
			}
			else
			{
				for(int j=1;j<=5;j++)
				{
					if(n<10 && n>0) {
					System.out.print("0"+n+++" ");}
					else
					{System.out.print(n+++" ");}
				}
				n=n+5;
			}
			System.out.println();	
		}
	}
}
