package ASSIGNEMENT12;

public class G {

	public G() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				if(n<10 && n>0) {
					System.out.print("0"+n+" ");
				}
				else {
				System.out.print(n+" ");}
				n+=5;
			}
			System.out.println();
			n=n-24;
		}
	}

}
