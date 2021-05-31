package k_SuperKeyword;

public class D_ChildConstructorSuper extends C_ParentConstructorSuper {

	public static void main(String[] args) {
		D_ChildConstructorSuper o1=new D_ChildConstructorSuper();
		//though we are calling only child, the sys is implementing both parent and child constructors cz parent is inherited
		D_ChildConstructorSuper o2=new D_ChildConstructorSuper("manju");

	}
	public D_ChildConstructorSuper() { //non-parameterized
		System.out.println("child no prmtr");
	}
	
	public D_ChildConstructorSuper(String name) {//parameterized
		super(name);
		//if we don't use the above line (super keyword with parameter in it), sys prints non-parameterized constructor from parent class
		System.out.println("childprmtr "+name);
	}

}
