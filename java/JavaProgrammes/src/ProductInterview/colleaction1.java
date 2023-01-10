package ProductInterview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class colleaction1 {
	public static void main(String[] args) {
		HashSet a = new HashSet<>();
		a.add(10);
		a.add(20);
		a.add(45);
		
		LinkedList b = new LinkedList(a);
		Iterator itr = b.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() );
		}
		
		
	}

}
