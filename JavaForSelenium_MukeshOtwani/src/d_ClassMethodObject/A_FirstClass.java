package d_ClassMethodObject;

public class A_FirstClass {
	int x=20; //Non-static Global data members can be called by creating an object.
	int y=30;

	public static void main(String[] args) {
		
		A_FirstClass obj1=new A_FirstClass();
		obj1.sum();
		System.out.println("x value is "+obj1.x);
		System.out.println("y value is "+obj1.y);
		
		B_SecondClass.add();//calling static method from the class=> B_SecondClass
		B_SecondClass.sub();
		B_SecondClass obj2=new B_SecondClass();//calling non-static method from B_SecondClass without creating objects
		System.out.println(obj2.str); //calling non-static variable from B_SecondClass
		System.out.println(obj2.a);//calling static variable from B_SecondClass
	}
	public void sum() {
		int a=4;
		int b=2;
		int c=a+b;
		System.out.println("Sum is "+c);
	}

}
