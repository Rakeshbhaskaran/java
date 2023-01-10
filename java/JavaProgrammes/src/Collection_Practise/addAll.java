package Collection_Practise;

import java.util.ArrayList;

public class addAll {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(2);
		a.add(67.87);
		a.add(true);
		a.add("cat");
		a.add("girl");
		System.out.println(a);
		
		ArrayList b=new ArrayList();
		b.add(45);
		b.add(true);
		b.add("gun");
		System.out.println(b);
		
		//a.add(b);
		
		
		a.addAll(2, b);
		System.out.println(a);
		
		
	}

}
