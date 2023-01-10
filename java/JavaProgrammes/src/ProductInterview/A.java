package ProductInterview;

import java.util.LinkedHashSet;

public class A {

	public static void main(String[] args) {
		String s1="Rakeshaaaaa";
		/*
		 * for(char c='A';c<='z';c++) { int count=0; for(int i=0;i<s1.length();i++) {
		 * char var = s1.charAt(i); if(c==var) { count++; } } if(count>0) {
		 * System.out.println(c+" "+count); } }
		 */LinkedHashSet<Character> l1 = new LinkedHashSet();
		char []arr = s1.toCharArray();
		for(char var:arr) {
			l1.add(var);
		}
		
		for(char var : l1) {
			int count = 0;
			for(int i=0;i<s1.length();i++) {
				if(var == s1.charAt(i))
					count++;
			}
			System.out.println(var+" "+count);
			
		}
		
		
		

	}

}
