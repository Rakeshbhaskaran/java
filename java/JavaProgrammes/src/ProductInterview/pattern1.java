package ProductInterview;

public class pattern1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(' ');
			}
			for(int c=5;c>=i;c--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
