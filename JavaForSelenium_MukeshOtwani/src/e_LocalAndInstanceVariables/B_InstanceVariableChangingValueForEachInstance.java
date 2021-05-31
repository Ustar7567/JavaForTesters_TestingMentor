package e_LocalAndInstanceVariables;

public class B_InstanceVariableChangingValueForEachInstance {
	int roll;
	double marks;//Instance Variables

	B_InstanceVariableChangingValueForEachInstance(int roll, double marks){//constructor
		this.roll=roll;
		this.marks=marks;

	}

	public static void main(String[] args) {
		B_InstanceVariableChangingValueForEachInstance obj1=new B_InstanceVariableChangingValueForEachInstance(1,80);
		obj1.show();
		B_InstanceVariableChangingValueForEachInstance obj2=new B_InstanceVariableChangingValueForEachInstance(2,80.5);
		obj2.show();
		B_InstanceVariableChangingValueForEachInstance obj3=new B_InstanceVariableChangingValueForEachInstance(3,90);
		obj3.show();

	}

	public void show() {
		System.out.println("roll no.is "+roll+" "+"marks are "+marks);
	}
}
