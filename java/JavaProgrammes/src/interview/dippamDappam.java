package interview;

public class dippamDappam {
	public static void main(String[] args) {
		String s="Rakesh";
		int mid=s.length()/2;
		String s1=s.substring(0, mid);
		String s2=s.substring(mid);
		String rev="";
		for(int i=0;i<s1.length();i++) {
			rev=s1.charAt(i)+rev;
		}
		String f=rev+s2;
		System.out.println(f);
		
	}

}
