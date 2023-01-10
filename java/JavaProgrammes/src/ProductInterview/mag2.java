package ProductInterview;

import java.util.Arrays;

public class mag2 {
public static void main(String[] args) {
	String s1="10rak20*30";
	 s1=s1+" ";
	String num="0";
	int sum=0;
	for(int i=0;i<s1.length();i++) {
		char ch =s1.charAt(i);
		if(ch>='0'&&ch<='9') {
			num=num+ch;
		}
		
		else {
			sum=sum+Integer.parseInt(num);
			num="0";
		}
	}

	System.out.println(sum);
	
	
}
}
