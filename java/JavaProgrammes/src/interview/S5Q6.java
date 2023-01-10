package interview;

public class S5Q6 {
	public static void main(String[] args) {
		
		for(int i=2;i<=10;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
				if(flag==true) {
					int p=1;
					for(int k=i;k>1;k--) {
						p=p*k;
					}
					System.out.println("factorial of "+i+" is "+p);
				}
			}
		}
	}


