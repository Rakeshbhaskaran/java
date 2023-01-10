package interview;

public class S4Q8 {
	public static void main(String[] args) {
		int a[]= {1,2,3,6};
		System.out.println(sumArray(a));
	}
	static int sumArray(int[] a) {
		int s=0;
		for(int i=0;i<a.length;i++) {
			s=s+a[i];
		}
		return s;
	}

}
