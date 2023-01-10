package interview;

public class S3Q6 {
	
	S3Q6(){
		System.out.println("zero para");
	}
	S3Q6(int  a){
		this();
		System.out.println(a+" para");
	}
	
	public static void main(String[] args) {
		S3Q6 s1 = new S3Q6(5);
	}

}
