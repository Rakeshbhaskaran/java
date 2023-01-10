package interview;

public class S3Q3 {
	public static void main(String[] args) {
		vowels("Rakesh");
		
	}
	static void vowels(String s) {
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||
					ch=='o'||ch=='u'||
					ch=='A'||ch=='E'||ch=='I'||
					ch=='O'||ch=='U') {
				System.out.print(ch+" ");
			}
		}
	}

}
