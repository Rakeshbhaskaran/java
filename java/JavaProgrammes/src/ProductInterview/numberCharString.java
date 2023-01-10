package ProductInterview;

public class numberCharString {

public static void main(String[] args) {
	String s1="Rakeshaaaaa";
	 for(char c='A';c<='z';c++) { 
		 int count=0; 
		 for(int i=0;i<s1.length();i++) {
			 char var = s1.charAt(i); 
			 if(c==var) { 
				 count++; 
				 } 
			 } 
		 if(count>0) {
		System.out.println(c+" "+count); 
		} 
		 }
}

}
