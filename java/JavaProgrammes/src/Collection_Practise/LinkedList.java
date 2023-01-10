package Collection_Practise;

import java.util.Iterator;

public class LinkedList {
	public static void main(String[] args) {
			java.util.LinkedList a = new java.util.LinkedList<>();
			a.add(10);
			a.add("gum");
			a.add(45.89);
			a.add(156);
			a.add(0, 1);
			a.add(5, 'L');
			a.addFirst(1000);
			a.addLast(0);
			System.out.println();
			System.out.println(a.get(4));
			System.out.println();
			Iterator itr =a.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
	}

}
