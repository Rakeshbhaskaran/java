package interview;

public class S3Q10 {
	static void m1() {
		m2();
		System.out.println("m1");
	}
	static void m2() {
		m3();
		System.out.println("m2");
	}
	static void m3() {
		System.out.println("m3");
	}
	public static void main(String[] args) {
		m1();
	}

}
