package interview;

public class S2Q2 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int s=i;s<=3;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
