package DMS;

public class IF {
	public static void main(String[] args) {
		int a =10;
		String s ="dog";
		if(s.equalsIgnoreCase("dcat"))
		{
			System.out.println("true");
		}
		else if(s.equalsIgnoreCase("dog"))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("else is not mandaotory");
		}
	}

}
