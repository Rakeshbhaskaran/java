package COLLECTIONS;
import java.util.TreeSet;
import java.util.Iterator;
import Interface.A;
public class TREESET {

	public TREESET() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		for(int i=100;i>=10;i=i-10)
		{
			t.add(i);
		}
		System.out.println(t); // TreeSet is always Ascending
		Iterator i=t.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		TreeSet t1=new TreeSet();
		
	}

}
