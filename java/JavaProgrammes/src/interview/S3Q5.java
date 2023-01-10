package interview;

public class S3Q5 {
	public static void main(String[] args) {
		frequency("Karnata");
	}
	static void frequency(String s) {
		for(char ch='A';ch<='z';ch++) {
			int count =0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count ++;
				}
			}
			if(count>0) {
			System.out.println(ch+" = "+count);
		}
	}
	}
}
