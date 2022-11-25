package COLLECTIONS;

import java.util.ArrayList;

public class ARRAYLIST2 { // remove()

	public ARRAYLIST2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(1);
		a.add(true);
		a.add(3);
		a.add(5);
		a.add(6);
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		a.remove(new Integer(3));
		System.out.println(a);
		a.add(6);
		System.out.println(a);
		a.remove(6);
		System.out.println(a);
		
		
		
	}

}
