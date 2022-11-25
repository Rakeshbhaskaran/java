package COLLECTIONS;

import java.util.ArrayList;

public class REMOVEALL {

	public REMOVEALL() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		for(int i=0;i<=5;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		ArrayList a1 =new ArrayList();
		for(int i=0;i<=10;i++)
		{
			a1.add(i);
		}
		System.out.println(a1);
		a1.removeAll(a);
		System.out.println(a1);
	}

}
