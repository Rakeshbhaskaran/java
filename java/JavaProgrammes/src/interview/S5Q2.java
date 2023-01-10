package interview;

public class S5Q2 {
	public static void main(String[] args) {
		int a[]={1,3,2,6,8,4,9,5};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("max value is "+max);
	}

}
