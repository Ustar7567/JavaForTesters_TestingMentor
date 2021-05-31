package l_ThisKeyword;

public class A_WithConstr {

	public A_WithConstr() {
		this("Manju");
		System.out.println("I am a construtor with no parameters");
	}
	public A_WithConstr(String name) {
		this(10);
		System.out.println("I am a construtor with String parameter "+name);
	}
	public A_WithConstr(int count) {
		System.out.println("I am a construtor with integer parameter "+count);
	}
	public void iAmMethod() {
		System.out.println("I m a method");
	}
	
	public static void main(String[] args) {
		A_WithConstr o1=new A_WithConstr(); //If we create one obj, then sys will call constr with no parameters
		o1.iAmMethod();
		
		//If we wanna call all constr.s, we need to careate obj.s for all constructors as follows
		//A_WithConstr o1=new A_WithConstr(); calls constr with no parameter
		//A_WithConstr o2=new A_WithConstr(); calls constr with string parameter
		//A_WithConstr o2=new A_WithConstr(); calls constr with integer parameter
		
		//To avoid writing these many lines of code, we use this keyword to call constr.s from inside another constr in the same class
		
	}

}
