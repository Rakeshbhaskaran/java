package COLLECTIONS;

import java.util.ArrayList;

public class ARRAYLIST3 { // indexOf() and lastIndexOf()

	public ARRAYLIST3() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(4);
		a.add(1);
		System.out.println(a);
		System.out.println(a.indexOf(4));
		System.out.println(a.lastIndexOf(4));
		
		
	}

}
