package Collection_Practise;

import java.util.Iterator;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack a = new Stack();
		a.add(10);
		a.add("gum");
		a.add(45.89);
		a.add(156);
		a.add(0, 1);
		a.add(5, 'L');
		
		a.push(23);
		System.out.println(a.peek());
		a.pop();
		a.remove(1);
		
		System.out.println();
		Iterator itr =a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
