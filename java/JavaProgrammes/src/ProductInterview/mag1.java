package ProductInterview;

public class mag1 {
	public static void main(String[] args) {
		for(int row=1;row<=3;row++) {
			if(row%2==1) {
				System.out.print(" ");
			}
			
			for(int col=1;col<=row;col++) {
				if(col==1||col==2||col==3) {
				System.out.print("*");
			}
				else {
					System.out.print(" ");
				}
			
		}
			System.out.println();
	}
		
	}
}
