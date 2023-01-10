package Collection_Practise;

import java.util.Iterator;

public class Vector {
	public static void main(String[] args) {
		java.util.Vector a = new java.util.Vector<>();
		a.add(10);
		a.add("gum");
		a.add(45.89);
		a.add(156);
		a.add(0, 1);
		a.add(5, 'L');
		
		Iterator itr =a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
