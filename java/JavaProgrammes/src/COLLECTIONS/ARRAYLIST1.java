package COLLECTIONS;
import java.util.ArrayList;
import java.util.List;
public class ARRAYLIST1 { // add(),get(),size().

	public ARRAYLIST1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

			ArrayList a=new ArrayList();
			a.add(10);
			a.add(2);
			a.add(67.87);
			a.add(true);
			a.add("cat");
			a.add("girl");
			System.out.println(a);
			System.out.println(a.size());
			for(int i=0;i<a.size();i++)
			{
				System.out.println(a.get(i));
			}
			
		
	}

}
