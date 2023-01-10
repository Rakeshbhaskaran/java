package interview;

public class S4Q10 {
	public static void main(String[] args) {
		String s ="aaaabbbbccccdddddeeefff";
		String d ="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(d.indexOf(ch)==-1) {
				d=d+s.charAt(i);
			}
		}
		System.out.println(d);
		
	}

}
