package i_MethodOverriding;

public class B_Child extends A_Parent{   //observe extends keyword here 

	public static void main(String[] args) {
		
		A_Parent o1=new A_Parent(); //created obj for parent. So, displays parent method
		o1.display();
		
		B_Child o2=new B_Child(); //created obj for child class. So, displays over-ridden child method
		o2.display(); //Over-ridden
		
		A_Parent o3=new B_Child();//create obj with child method keeping parent as reference. So, displays over-ridden
		o3.display();
		

	}
	public void display() { //same method name and same signature in both parent and child
		System.out.println("Child class display method");
	}

}
