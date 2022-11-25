package COLLECTIONS;
import java.util.ArrayList;
public class GENERICARRAYLIST {

	public GENERICARRAYLIST() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(null);
		for(Integer i:a)
		{
			System.out.println(i);
		}
	}

}
