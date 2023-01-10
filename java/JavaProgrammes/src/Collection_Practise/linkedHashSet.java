package Collection_Practise;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet a = new LinkedHashSet<>();
		a.add(10);
		a.add("gum");
		a.add(45.89);
		a.add(156);
		
		Iterator itr =a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
