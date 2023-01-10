package ProductInterview;

import java.util.Scanner;

public class primeNumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number range");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			if(isPrime(i)==true) {
				System.out.print(i+" ");
			}
		}}
		
		static boolean isPrime(int n) {
			boolean flag=true;
			if(n==1) {
				flag=false;
			}
			else if(n==2) {
				flag=true;
			}
			else {
				 
				for(int i=2;i<n;i++) {
					if(n%i==0) {
						flag=false;
						break;
					}	
				}	
		}
			return flag;
			
		}
}
