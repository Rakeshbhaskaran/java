package interview;

public class Intq2Q4 {
	public static void main(String[] args) {
		int n=1;
		do {
			System.out.print(n++);
			if(n==5) {
				for(int i=1;i<5;i++) {
					System.out.print(n);
				}	
			}
		}
		while(n<=9);
	}

}
