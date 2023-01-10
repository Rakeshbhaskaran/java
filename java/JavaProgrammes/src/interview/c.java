package interview;

import java.util.Arrays;

public class c {

	public static void main(String[] args) {
			
		int a[]= {1,2,3,4,5,6,89,67,90,-1};
		Arrays.sort(a);
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
			max=a[i];
			}
		}
		
		
		
		System.out.println("max value is "+ max);
		System.out.println("second max valie is "+ a[a.length-2]);
	}

}
