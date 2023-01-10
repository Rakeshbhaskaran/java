package interview;

import java.util.LinkedHashSet;

public class S4Q9 {
	public static void main(String[] args) {
		String s="Hello Hi Hello How Hi Are You";
		String a []=s.split(" ");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			lhs.add(a[i]);
		}
		String d="";
		for(String e:lhs) {
			d=d+e+" ";
		}
		System.out.println(d);
	}

}
