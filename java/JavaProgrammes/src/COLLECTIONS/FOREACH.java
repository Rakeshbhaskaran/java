package COLLECTIONS;
import java.util.ArrayList;
public class FOREACH {

	public FOREACH() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		for(Object i: a)
		{
			System.out.println(i);
		}
		
		
	}

}
