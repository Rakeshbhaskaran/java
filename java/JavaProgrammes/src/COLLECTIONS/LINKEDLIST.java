package COLLECTIONS;
import java.util.LinkedList;
public class LINKEDLIST {

	public LINKEDLIST() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		for(int i=1;i<=10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		l.addFirst(0);
		l.addLast(11);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		l.remove(5);
		System.out.println(l);
		l.remove(new Integer(5));
		System.out.println(l);
		for(Object i:l)
		{
			System.out.println(i);
		}
		
	}

}
