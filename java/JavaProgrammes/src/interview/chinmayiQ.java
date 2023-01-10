package interview;

public class chinmayiQ {
	
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=5;i++) {
			if(i==5) {
				for(int k=1;k<=4;k++) {
					System.out.print(k);
				}
			}
			else {
			for(int j=1;j<=4;j++) {
				if(j<i) {
					System.out.print('*');
				}
				else {
					System.out.print(n++);
				}		
			}
			}
			System.out.println();
			 n=1;
		}
	}
}
