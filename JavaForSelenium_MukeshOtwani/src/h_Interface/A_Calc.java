package h_Interface;

public interface A_Calc {
	
	int a=77; //variable declared in an interface is final by default.
	//So, we can use the 'a' value in any class, but can't change the value of 'a' outside the interface in any class
	public void add();//abstract method-no method body
	public void sub();//abstract method-no method body
	//We can create only abstract methods in an interface.

}
