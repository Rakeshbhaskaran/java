package interview;

public class MS3Q3 {
	public static void main(String[] args) {
		String s1="08/08/2022ELF36TODAY08/08";
		String [] s= new String[6];
		int k=0;
		String temp="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>='0'&&ch<='9') {
				
				temp=temp+ch;
			}
		}
	}

}
