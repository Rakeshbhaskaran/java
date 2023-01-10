package EXCEPTIONHANDLING;

public class THROW extends RuntimeException{

	THROW(String s){
		super(s);
	}
	public static void main(String[] args) {
	
	throw new THROW("BAD");
			
		}
}
