package ExceptionHandling1;

public class vote {

	public static void main(String[] args) {
		int age=17;
		if(age<18) {
			throw  new rakeshException("you cannot vote");
			
		}
		else {
			System.out.println("you can vote");
		}
	}

}
