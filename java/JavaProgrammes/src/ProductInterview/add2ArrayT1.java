package ProductInterview;

public class add2ArrayT1 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		
		int l =a.length+(b.length/2);
		int c[]= new int [l];
		int n=0;
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[n++];
			}			
			}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		}
	}


