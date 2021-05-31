package e_LocalAndInstanceVariables;

public class A_InstanceVariableNotChangingValueForEachInstance {
	int roll=10;
	double marks=80.5;

	public static void main(String[] args) {
		A_InstanceVariableNotChangingValueForEachInstance obj1=new A_InstanceVariableNotChangingValueForEachInstance();
		obj1.show();
		A_InstanceVariableNotChangingValueForEachInstance obj2=new A_InstanceVariableNotChangingValueForEachInstance();
		obj2.show();
		A_InstanceVariableNotChangingValueForEachInstance obj3=new A_InstanceVariableNotChangingValueForEachInstance();
		obj3.show();
		//creating three instances/objects to show how those instance variables are allocating the memory
		//Debug the code and you can see that each obj has its own copy of the values
		

	}
	public void show() {
		System.out.println("roll no. is "+roll+" "+"marks are "+marks);//prints default values of int and double cz those instance variables are not initiated
	}

}
