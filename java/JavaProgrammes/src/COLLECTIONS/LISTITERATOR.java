package COLLECTIONS;
import java.util.LinkedList;
import java.util.ListIterator;
public class LISTITERATOR {

	public LISTITERATOR() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		for(int i=1;i<=10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		System.out.println(   );
		ListIterator a=l.listIterator(l.size());
		while(a.hasNext())
		{
			System.out.println(a.previous());
		}
		
		
	}

}
