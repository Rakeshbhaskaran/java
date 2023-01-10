package ProductInterview;

import java.util.Scanner;

public class AddStringNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				sum=sum+Integer.parseInt(s.charAt(i)+"");
			}
		}
		System.out.println(sum);
	}

}
