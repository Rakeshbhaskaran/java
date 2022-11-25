package COLLECTIONS;
import java.util.Vector;
public class VECTOR {

	public VECTOR() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Vector a=new Vector();
		for(int i=10;i<=50;i=i+10)
		{
			a.addElement(i);
		}
		System.out.println(a);
		
	}

}
