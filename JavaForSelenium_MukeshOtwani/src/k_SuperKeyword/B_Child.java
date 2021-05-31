package k_SuperKeyword;

public class B_Child extends A_Parent{
	
	int int_rate=10; //child class and parent class has same variable name with diff. values

	public static void main(String[] args) {
		B_Child o1=new B_Child();
		o1.interestRateFromPvtBank();

	}
	
	public void interestRate() { //over-riding interestRate() method in child class
		System.out.println("The interest rate in child class is "+int_rate);
	}
	
	public void interestRateFromPvtBank() {
		interestRate();////taking int_rate from child class method
		super.interestRate(); //used super keyword.So, taking int_rate from parent class method
		System.out.println("int rate from prvt bank is "+int_rate); //taking int_rate from child class variable
		System.out.println("int rate from prvt bank is "+super.int_rate); //used super keyword.So, taking int_rate from parent class variable
	}


}
