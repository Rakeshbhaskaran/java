package EXCEPTIONHANDLING;

public class thow2 {
	public static void main(String[] args) {
		try {
			RakeshCustomException obj = new RakeshCustomException();
			obj.getNumber(0);
		}
		catch(RakeshCustomException e) {
			System.out.println("number is zero "+e);
		}
	}

}
