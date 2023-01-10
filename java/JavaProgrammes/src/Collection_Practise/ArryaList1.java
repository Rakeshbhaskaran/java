package Collection_Practise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryaList1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("gum");
		a.add(45.89);
		a.add(156);
		a.add(0, 1);
		a.add(5, 'L');
		
		Iterator itr= a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
