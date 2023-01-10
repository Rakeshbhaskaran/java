package String;

import java.util.Scanner;

public class countDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		System.out.println("Enter char for which duplicate count shld be found");
		char d=sc.next().charAt(0);
		int count=0;
		char st[]=s.toLowerCase().toCharArray();
		for(int i=0;i<st.length;i++) {
			if(st[i]==d) {
				count++;
			}
		}
		System.out.println(count+" times "+d+" is repeated in the string");
		
		
	}

}
