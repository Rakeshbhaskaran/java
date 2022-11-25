package Encapsulation;

public class EndUser {

	public EndUser() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	BankAccount dummy=new BankAccount();
	BankAccount Rak=new BankAccount("Rakesh",500,"123456");
	
	
	
	System.out.println();
	
	BankAccount jai= new BankAccount("jaideep", 1000, "636260");
	System.out.println(jai.getBalance("636260"));
	System.out.println(jai.getBalance("31656"));
	System.out.println(jai.getName("63626"));
	System.out.println(jai.getName("636260"));
	
	System.out.println();
	BankAccount amu =  new BankAccount("Amrutha",500,"amu@12");
	
	System.out.println(amu.getName("amu@12"));
	System.out.println(amu.getName("4566"));
	
	System.out.println(amu.setName("namrutha", "amu@12"));
	
	
	
	
	
		
		
	}
	
	

}

