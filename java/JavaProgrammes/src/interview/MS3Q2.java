package interview;

public class MS3Q2 {
	public static void main(String[] args) {
		String s1="the man is there and his love is blind";
		String[]s=s1.split(" ");
		for(int i=0;i<s.length;i++) {
			if(s[i].contains("s")) {
				s[i]=s[i].toUpperCase();
			}
		}
		String s2="";
		for(int i=0;i<s.length;i++) {
			
			 s2=s2+s[i]+" ";
		}
		System.out.println(s2);
		
	}

}
