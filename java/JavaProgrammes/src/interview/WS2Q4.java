package interview;

public class WS2Q4 {
	public static void main(String[] args) {
		int n =145;
		int temp=n;
		int s=0;
		while(n>0) {
			int rim=n%10;
			int p=1;
			for(int i=rim;i>1;i--) {
				p=p*i;
			}
			s=s+p;
			n=n/10;
		}
		if(s==temp) {
			System.out.println("strong");
		}
		else {
			System.out.println("not strong");
		}
	}
	

}
