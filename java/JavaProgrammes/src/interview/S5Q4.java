package interview;

public class S5Q4 {
	public static void main(String[] args) {
		
		System.out.println(removeDuplicate("JAVAjava"));
	}
	static String removeDuplicate(String s) {
		String d ="";
		for(int i=0;i<s.length();i++) {
			String ch=s.charAt(i)+"";
			if(!d.contains(ch)) {
				d=d+ch;
			}
		}
		return d;
		
	}

}
