package ProductInterview;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicateFromArray {
	public static void main(String[] args) {
		
		int a[]= {45,1,2,3,0,1,1,45,4,5,6,7,6,45};
		Arrays.sort(a);
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[k]=a[i];
				k++;
			}
		}
		a[k]=a[a.length-1];
		for(int i=0;i<=k;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
