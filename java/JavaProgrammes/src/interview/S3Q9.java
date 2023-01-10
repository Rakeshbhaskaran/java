package interview;

public class S3Q9 {
	public static void main(String[] args) {
		System.out.println(rev("My name is ram"));
		
	}
	static String rev(String s) {
		String a []=s.split(" ");
		String rev="";
		for(int i=0;i<a.length;i++) {
			rev=" "+a[i]+rev;
		}
		return rev;
	}

}
