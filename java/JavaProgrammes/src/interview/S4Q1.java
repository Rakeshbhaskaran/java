package interview;

public class S4Q1 {
	public static void main(String[] args) {
		System.out.println(removeDuplicate("javajava"));
	}
	static String removeDuplicate(String s) {
		String d="";
		for(int i=0;i<s.length();i++) {
			if(d.indexOf(s.charAt(i))==-1) {
				d=d+s.charAt(i);
			}
		}
		return d;
	}

}
