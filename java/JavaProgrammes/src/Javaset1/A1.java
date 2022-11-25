package Javaset1;

public class A1 { // print sum of even number from 1-50

	public A1() {
		// TODO Auto-generated constructor stub
	}
	public static boolean isPrime (int n)
	{
		if(n==1)
		{
			return false;
		}
		else if(n==2)
		{
			return true;
			
		}
		else
		{
			boolean flag =true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag = false;
					break;
				}
			}
			return flag;
		}
	}
	
public static void main(String[] args) {

	int s=0;
	for(int i=1;i<=50;i++)
	{
		if(isPrime(i)==true)
		{
			s=s+i;
		}
	}
	System.out.println(s);
		
	
}
}
