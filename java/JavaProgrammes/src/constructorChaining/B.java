package constructorChaining;

public class B extends A {
	B(){
		super(10);
		System.out.println("constructer of B");
	}

	public static void main(String[] args) {
		B a1 =new B();
		A a =new A();
		
	}

}
