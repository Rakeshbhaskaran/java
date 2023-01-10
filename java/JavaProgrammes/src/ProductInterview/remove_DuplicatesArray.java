package ProductInterview;

import java.util.Arrays;

class remove_DuplicatesArray {

	public static void main(String[] args) {
		int [] a= {1,1,2,2,3,3,3};
		Arrays.sort(a);
		
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[k++]=a[i];
				
			}
		}
		a[k]=a[a.length-1];
		for(int i=0;i<=k;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	

}
