package j_AbstractClassAndMethods;

public class C_HRClass extends B_ITClass{

	public static void main(String[] args) {
		
		C_HRClass o1=new C_HRClass();//referencing HR class. So, all methods in HR class are implemented
		o1.goodies();
		o1.work();
		o1.salary();
		o1.bonus();
		
		//B_ITClass o2=new B_ITClass(); we can't do this cz B_ITClass is an abstract class and we can't create obj for abstract class
		
		B_ITClass o2=new C_HRClass();//referencing IT class. So, only methods in IT class are implemented. 
		o2.goodies();
		o2.work();
		o2.salary();


	}
	
	public void salary() { ////salary method in emp interface is implemented here
		System.out.println("Salary");
	}
	
	public void bonus() {
		System.out.println("Bonus");
	}

}
