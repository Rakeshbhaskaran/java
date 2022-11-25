package Mock2;
import java.util.Scanner;
import java.util.Arrays;
public class A { // IP ={1,1,2,2,2,3,3,4,5,6,7,7,7}, OP={1,2,3,4,5,6,7}

	public A() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner a1 =new Scanner(System.in);
		System.out.println("enter array size");
		int a[]=new int[a1.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" array value");
			a[i]=a1.nextInt();
		}
		Arrays.sort(a);
		
		int b[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				b[k]=a[i];
				k++;
			}	
		}
		b[k]=a[a.length-1];
		for(int i=0;i<=k;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
