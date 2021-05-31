package h_Interface;

public class C_AdvCalc implements A_Calc {

	public static void main(String[] args) {
		A_Calc o2=new C_AdvCalc(); //We can't say "A_Calc o2=new A_Calc(); and C_AdvCalc o2=new A_Calc();" cz we can't create an object for interface
		o2.add();
		o2.sub();   //A_Calc is base class, C_AdvCalc is child class
	
	}
	
	public void cs() {
		System.out.println("This is cos");	
	}
	public void sn() {
		System.out.println("This is sin");	
	}

	public void add() {
		System.out.println("This is addition");	
	}

	public void sub() {
		System.out.println("This is sub");	
	}

}
