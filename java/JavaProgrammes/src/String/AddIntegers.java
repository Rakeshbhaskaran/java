package String;

public class AddIntegers {
	public static void main(String[] args) {
			String s1 ="ELF39ELF";
			//String s=s1.toUpperCase();
			char a[]=s1.toCharArray();
			int sum=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]>='0'&&a[i]<='9') {
					int temp=Integer.parseInt(a[i]+"");
					System.out.println(temp);
					
					sum=sum+temp;			
				}
			}
			System.out.println(sum);
			
	}

}
