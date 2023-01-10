package COLLECTIONS;
import java.util.PriorityQueue;
public class PRIORITYQUEUE {

	public PRIORITYQUEUE() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		PriorityQueue p= new PriorityQueue();
		p.offer(1);
		p.offer(3);
		p.offer(1);
		p.offer(10);
		p.offer(5);
		p.offer(8);
		p.offer(6);
		System.out.println(p);
		while(!p.isEmpty())
		{
			//System.out.println(p.poll()6);
		}
	}

}
