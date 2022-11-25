package Javaset1;

public class A5 {

	public A5() {
		// TODO Auto-generated constructor stub
	}
	String name;
	int roll;
	String house;
	A5(String name,int roll,String house)
	{
		this.name =name;
		this.roll=roll;
		this.house=house;
		System.out.println("name "+name+",roll "+roll+",house "+house);
		
		
	}
	public static void main(String[] args) {
		A5 s1=new A5("rakesh",01,"green");
		A5 s2 =new A5("jaideep",02,"red");
		
		
		
	}

}
