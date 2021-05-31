package h_Interface;

public class B_AdvCalc implements A_Calc {

	public static void main(String[] args) {
		B_AdvCalc o1=new B_AdvCalc();
		o1.add();
		o1.sub();
		o1.CalcCos();
		o1.CalcSin();
		
	}
	public void CalcSin() { //own method of this class
		System.out.println("This is Sin");
	}
	public void CalcCos() { //own method of this class
		System.out.println("This is Cos");
	}
	
	
	public void add() { //abstract class from interface
		System.out.println("This is addition");	
	}

	public void sub() {  //abstract class from interface
		System.out.println("This is substraction");
	}

}
