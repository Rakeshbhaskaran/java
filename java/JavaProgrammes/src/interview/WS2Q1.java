package interview;

public class WS2Q1 {
	public static void main(String[] args) {
		int e=0;
		int o=0;
		for(int i=20;i<=70;i++) {
			if(i%2==0) {
				e++;
			}
			else {
				o++;
			}
		}
		System.out.println("even count "+e);
		System.out.println("odd count "+o);
	}

}
