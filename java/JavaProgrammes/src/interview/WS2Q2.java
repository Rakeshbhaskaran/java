package interview;

public class WS2Q2 {
	public static void main(String[] args) {
		String s="TE$T Y@NTR@";
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(!(ch>='A'&&ch<='z')) {
				System.out.print(ch);
			}
		}
	}


}
