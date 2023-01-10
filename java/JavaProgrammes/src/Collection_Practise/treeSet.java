package Collection_Practise;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
	public static void main(String[] args) {
		TreeSet a = new TreeSet<>();
		a.add("string");
		a.add("gun");
		a.add("guna");
		
		Iterator itr =a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
