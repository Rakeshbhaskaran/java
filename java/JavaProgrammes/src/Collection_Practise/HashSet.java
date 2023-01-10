package Collection_Practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class HashSet {
	public static void main(String[] args) {
		java.util.HashSet<Integer> a = new java.util.HashSet<>();
		System.out.println(a.add(10));
		System.out.println(a.add(10));
		System.out.println(a.add(456));
		System.out.println(a.add(89));
		
		ArrayList a1 = new ArrayList<>(a);
		Collections.sort(a1);
		
		Iterator itr =a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
