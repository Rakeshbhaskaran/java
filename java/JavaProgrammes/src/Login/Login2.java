package Login;

public class Login2 extends Login1 {
	void username()
	{
		System.out.println("username2");
	}
	void login()
	{
		System.out.println("login2");
	}
	public static void main(String[] args) {
		Login1 l2= new Login2();
		l2.username();
		l2.password();
		l2.login();
	}

	

}
