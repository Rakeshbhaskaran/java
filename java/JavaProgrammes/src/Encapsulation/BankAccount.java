package Encapsulation;

public class BankAccount {
	
	private String name;
	private double balance;
	private String password;

	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	public  BankAccount(String n,double amt,String password)
	{
		this.name=n;
		this.balance=amt;
		this.password=password;
	}
	public String getName(String password)
	{
		if(password.equals(this.password))
		{
		return name;
		}
		else
		{
			return "wrong password";
		}
	}
	public String setName(String newname,String password)
	{
		if(password.equals(this.password))
		{
		name=newname;
		return "name changed to "+this.name;
		}
		else
		{
			return "wrong password";
		}
	}
	public double getBalance(String password)
	{
		if(password.equals(this.password))
		{
		return this.balance;
		}
		else
		{
//			double message= Double.parseDouble("404");
//			return message;
			throw new WrongPasswordException("Wrong password");
		}
	}
	public double setBalance(double newbal,String password)
	{
		if(password.equals(this.password))
		{
		balance+=newbal;
		return this.balance;
		}
		else 
		{
			throw new WrongPasswordException("Wrong password");
		}
		
	}
	
	

}
