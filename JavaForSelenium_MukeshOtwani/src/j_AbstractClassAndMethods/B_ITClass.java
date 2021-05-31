package j_AbstractClassAndMethods;

public abstract class B_ITClass implements A_Emp{ //salary method is abstract. So, the class is abstract

	
	public void goodies() {
		System.out.println("Goodies");
		
	}

	
	public void work() {
		System.out.println("Work");
		
	}

	public abstract void salary();//salary method in emp interface is not implemented here. So, keeoing it as abstract

}
