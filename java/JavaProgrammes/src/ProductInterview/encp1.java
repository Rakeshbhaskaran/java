package ProductInterview;

public class encp1 {
	private String name;
	private int balance;
	
	encp1(String n,int b){
		this.name=n;
		this.balance=b;
	}
	
	String getName() {
		
		return this.name;
	}
	int  getbal() {
		return this.balance;
	}
	
	void setBalance(int bal) {
		this.balance=this.balance+bal;
	}
	
	

}
