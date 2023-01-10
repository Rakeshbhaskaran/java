package interview;

public class WS1Q2 {
	public static void main(String[] args) {
		int[] a = {28,45,36,87,66,55,99,1098};
		int max =a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
