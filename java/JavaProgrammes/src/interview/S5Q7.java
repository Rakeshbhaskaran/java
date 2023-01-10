package interview;

import java.util.HashSet;

public class S5Q7 {
	public static void main(String[] args) {
		int a[]= {4,56,78,1,2,-8,343,-89,4,56,56,78,1,2};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		
		for(Integer e:hs) {
			System.out.println(e);
		}
		
		
		
	}

}
