package ProductInterview;

public class twoDArray {
	public static void main(String[] args) {
		int r=4;
		int c=4;
		char [][]a=new char[r][c];
		char ch='A';
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=ch;
				ch++;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i%2==0&&j%2==0) {
					System.out.print(a[i][j]+" ");	
				}	
			}
			System.out.println();
		}
	}
}
