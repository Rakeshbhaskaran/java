package Encapsulation;

public class CreateStudent {

	public CreateStudent() {
		// TODO Auto-generated constructor stub
	}
	
	static void display(Student s)
	{
		System.out.println(s.getName()+" "+s.getStandard()+" "+s.getSec()+" "+s.getRoll());
	}
	public static void main(String[] args) {
		Student rak=new Student("Rakesh",12,'C',48);
		Student chi=new Student("Chinmayi",11,'B',11);
		Student magu=new Student("Magendra",1,'B',28);
		Student amb=new Student("Ambika",9,'A',05);
		Student sumo=new Student("Suma",2,'Z',50);
		
		display(rak);
		display(chi);
		display(magu);
		display(amb);
		display(sumo);
		
		
		
		/*System.out.println(rak.getName()+" "+rak.getStandard()+" "+rak.getSec()+" "+rak.getRoll());
		System.out.println(chi.getName()+" "+chi.getStandard()+" "+chi.getSec()+" "+chi.getRoll());
		System.out.println(magu.getName()+" "+magu.getStandard()+" "+magu.getSec()+" "+magu.getRoll());
		System.out.println(amb.getName()+" "+amb.getStandard()+" "+amb.getSec()+" "+amb.getRoll()); */
		
	}
	
	
	
	

}
