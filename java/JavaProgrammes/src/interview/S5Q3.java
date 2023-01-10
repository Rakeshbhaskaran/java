package interview;

public class S5Q3 {
	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6,6,8,9,2};
		int b[]=evenArray(a);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
	}
	static int[] evenArray(int []a) {
		
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				a[k++]=a[i];
			}	
		}
		int b[]=new int[k];
		for(int i=0;i<k;i++) {
			b[i]=a[i];
		}
		return b;
		
	}

}
