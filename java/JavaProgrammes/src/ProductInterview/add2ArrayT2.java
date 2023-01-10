package ProductInterview;

public class add2ArrayT2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		
		int halflength=(b.length/2);
		int c[] = new int[b.length];//take always bigger arrays length
		for(int i=0;i<c.length;i++) {
			if(i<halflength) {
				c[i]=a[i]+b[i];
			}
			else {
				c[i]=a[i]+0;
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}

	}

}
