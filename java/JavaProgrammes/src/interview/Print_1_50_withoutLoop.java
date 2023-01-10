package interview;

public class Print_1_50_withoutLoop {
	public static void main(String[] args) {
		rec(1);
	}
	static void rec(int i) {
		if(i<=50) {
			System.out.println(i++);
			rec(i);
		}
	}

}
