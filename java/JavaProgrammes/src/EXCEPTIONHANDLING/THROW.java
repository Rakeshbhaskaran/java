package EXCEPTIONHANDLING;

public class THROW extends RuntimeException{

	public THROW() {
		// TODO Auto-generated constructor stub
	}
	THROW(String s){
		super(s);
	}
	public static void main(String[] args) {
	
	throw new THROW("BAD");
			
		}

}
