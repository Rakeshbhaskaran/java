package interview;

public class replace {

	public static void main(String[] args) {
		String s ="There are 200 products";
		
		String s1=s.replaceAll("[A-z]", "");
		System.out.println(s1);
	}
}
