package k_SuperKeyword;

public class C_ParentConstructorSuper {
	public C_ParentConstructorSuper() {//non-parameterized
		System.out.println("parent no prmtr");
		//*If the parent class doesn't hv a zero argument constructor/no prmtr const.r, sys throws compile time error
	}
	
	public C_ParentConstructorSuper(String name) {//parameterized
		System.out.println("parentprmtr "+name);
	}

}
//Super keyword working procedure in constructor will be dfrnt from its working in variables and methods
//Here, super keyword is used to implement parameterized constructor from parent in child class.