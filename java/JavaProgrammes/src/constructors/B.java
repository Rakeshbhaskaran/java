package constructors;

public class B {
	String name;
	int amount;
	String brand;
	B(String name,int amount ,String brand){
		this.name=name;
		this.amount=amount;
		this.brand=brand;
		System.out.println("name "+name+" brand "+brand+" amount "+amount);
	}
	public static void main(String[] args) {
		B a1 =new B("FZs",137000,"Yamaha");
		B a2 = new B("NS200",147000,"Bajaj");
		B a3 =new B("Clasic350",215000,"RE");
		
	}

}
