package Encapsulation;

public class Student {
	private String name;
	private int standard;
	private char sec;
	private int roll;
	

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String n,int std,char sec,int roll)
	{
		this.name=n;
		this.standard=std;
		this.sec=sec;
		this.roll=roll;
	}
	public 	String getName()
	{
		return name;
	}
	public 	int getStandard()
	{
		return standard;
	}
	public 	char getSec()
	{
		return sec;
	}
	public 	int getRoll()
	{
		return roll;
	}

}
