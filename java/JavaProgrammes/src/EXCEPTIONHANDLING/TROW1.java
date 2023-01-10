package EXCEPTIONHANDLING;

public class TROW1 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			throw new ivalid_age("bad");
		}
		catch(ivalid_age e) {
			System.out.println(e);	
		}
		System.out.println(2);
	}

}
