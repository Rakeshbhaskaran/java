package math;

public class D { // armstrong number from 100-1000
	
	static boolean isArmstrong(int n)
	{
		int n1=n;
		int n2=n;
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		int r=0;
		int s=0;
		while(n1>0)
		{
			r=n1%10;
			s=s+(int)Math.pow(r, c);
			n1=n1/10;
		}
		if (s==n2)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static void main(String[] args) {
		for(int i=100;i<=1000;i++)
		{
			if(isArmstrong(i) == true)
			{
				System.out.println(i);
			}
			
		}
	}

}
