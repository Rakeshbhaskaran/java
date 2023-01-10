package interview;

public class IntQ5 {
	public static void main(String[] args) {
		String s="GC18ELF2022JUNE23 ";
		String num="0";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				num=num+ch;	
			}
			else {
				sum=sum+Integer.parseInt(num);
				num="0";
			}
		}
		System.out.println("sum is "+sum);
	}

}
