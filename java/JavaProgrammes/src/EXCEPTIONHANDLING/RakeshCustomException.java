package EXCEPTIONHANDLING;

public class RakeshCustomException extends Exception{
	public String getNumber(int i) throws RakeshCustomException {
		if(i==0) {
			throw new RakeshCustomException();
		}
		else {
			return "number is not zero";
		}
	}
	

}
