package COLLECTIONS;
import java.util.ArrayList;
public class ADDALL {

	public ADDALL() {
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
		for(int i=11;i<=15;i++)
		{
			a1.add(i);
		}
		System.out.println(a1);
		a1.addAll(a);
		System.out.println(a1);
		
		
		
	}

}
