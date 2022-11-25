package COLLECTIONS;
import java.util.HashSet;
import java.util.Iterator;
public class HASHSET {

	public HASHSET() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		HashSet h =new HashSet();
		h.add(10);
		h.add(10);
		h.add(30);
		h.add(false);
		h.add(60);
		System.out.println(h);
		System.out.println();
		Iterator a=h.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		
		
	}

}
