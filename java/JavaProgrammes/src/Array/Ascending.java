package Array;

public class Ascending {
	public static void main(String[] args) {
		int a[]= {0,4,56,1,678,43,9};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		// to print
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
