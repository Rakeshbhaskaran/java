package ProductInterview;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("not prime");
		}
		else if(n==2) {
			System.out.println("prime");
		}
		else {
			boolean flag =true;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}	
			}
			if(flag==true) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
			
		}	
	}
}


