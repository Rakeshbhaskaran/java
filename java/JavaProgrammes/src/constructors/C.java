package constructors;

public class C { // constructor overloading
	C (){
		System.out.println("Con-1");
	}
	C(int a){
		System.out.println("const-2");
	}
	void C(int a) { // ita
		
			System.out.println("method ");
		
	}
	C(String b){
		System.out.println("const-4");
	}
	
public static void main(String[] args) {
	C a1 =new C();
}
}
