package Abstraction;

public class B extends A  {

	void login()
	{
		System.out.println("Login");
	}
public static void main(String[] args) {
	B b1= new B();
b1.login();
A a1 =new B();
a1.login();


}
}
