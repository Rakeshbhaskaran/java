package interview;

public class S5Q5 {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,4,5,6,7};
		System.out.println(contains(a, 4));
		
	}
	static boolean contains(int[] a, int b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				return true;
			}
		}
		return false ;
	}
	

}
