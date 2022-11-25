package math;

public class H {

	public H() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int a[]= {2,1,3,6,8,7,9,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<=a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			int s= a[0]+a[a.length-2];
			System.out.println("sum of 1st max and 2nd min = "+s);
		
	}

}
