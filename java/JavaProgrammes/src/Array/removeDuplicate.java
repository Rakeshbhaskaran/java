package Array;

import java.util.Arrays;

public class removeDuplicate {
	public static void main(String[] args) {
		int a[]= {4,2,4,1,1,5,89,89,45,4};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[k]=a[i];
				k++;
			}
		}
		System.out.println();
			a[k]=a[a.length-1];
			for(int i=0;i<=k;i++) {
				System.out.print(a[i]+" ");
			}
			
		}
		

}
