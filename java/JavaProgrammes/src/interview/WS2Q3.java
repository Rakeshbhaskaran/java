package interview;

public class WS2Q3 {
	public static void main(String[] args) {
		
		String s="hi my ‘eman’ is ‘mar’";
		String [] a=s.split(" ");
		for(int i=0;i<a.length;i++) {
			if(a[i].charAt(0)=='‘') {
				String rev="";
				for(int j=0;j<a[i].length();j++) {
					rev=a[i].charAt(j)+rev;
				}
				a[i]=rev;
			}
		}
		
		String n="";
		for(String e:a) {
			n =n+e+" ";
		}
		System.out.println(n);
	}

}
