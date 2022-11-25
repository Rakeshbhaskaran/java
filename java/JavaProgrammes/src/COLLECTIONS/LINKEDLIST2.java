package COLLECTIONS;
import java.util.LinkedList;
public class LINKEDLIST2 {

	public LINKEDLIST2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		LinkedList l =new LinkedList();
		l.offer(10);
		l.offer(10);
		l.offer(20);
		l.offer("Hello");
		System.out.println(l);
		while(!l.isEmpty())
		{
			System.out.println(l.poll());
		}
	}

}
