package NUMBERS;
import java.util.Scanner;
// strong number is addition of factorial of its digits equal to number itself
public class Strong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		System.out.println(isStrong(n));
			
	}
	static boolean isStrong(int n) {
		int temp=n;
		
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+factorial(r);
			n=n/10;
		}
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
			
	}
		static int factorial(int n) {
			int p=1;
			while(n>0) {
				p=p*n;
				n--;
			}
			return p;
		}
		
	}
