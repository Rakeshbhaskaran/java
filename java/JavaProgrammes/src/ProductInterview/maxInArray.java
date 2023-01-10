package ProductInterview;

public class maxInArray {
	public static void main(String[] args) {
		int [] a = {45,89,5,-1,67,100};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max value is "+max);
	}

}
