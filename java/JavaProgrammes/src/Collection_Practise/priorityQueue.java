package Collection_Practise;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
	public static void main(String[] args) {
		PriorityQueue a = new PriorityQueue<>();
		a.offer(10);
		a.offer(45);
		a.offer(2);
		a.offer(-8);
		
		Iterator itr= a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
