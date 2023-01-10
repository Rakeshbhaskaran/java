package ProductInterview;

import java.util.Scanner;

public class twoDarrArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row first and columb");
		int r = sc.nextInt();
		int c=sc.nextInt();
		char ch='A';
		char[] []a= new char[r][c];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=ch++;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i%2==0&&j%2==0) {
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
		}
	}

}
