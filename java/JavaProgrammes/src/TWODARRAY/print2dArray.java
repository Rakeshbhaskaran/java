package TWODARRAY;

public class print2dArray {
	
	public static void main(String[] args) {
		int n=1;
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=4;c++) {
				System.out.print(n+++" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	
	int c=1;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			
			if(i%2==0&&j%2==0) {
				System.out.print(c+" ");
			}
			c++;
		}
	}
	

}
}
