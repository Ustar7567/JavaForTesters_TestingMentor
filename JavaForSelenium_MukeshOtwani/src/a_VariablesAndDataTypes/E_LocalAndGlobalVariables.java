package a_VariablesAndDataTypes;

public class E_LocalAndGlobalVariables {
	
	static int b; //Global variable. Variable is not initialized.So, system takes null/default value. o/p will be 0

	public static void main(String[] args) {
		int a=78; //Local variable. Local variables should be initialized. Otherwise, system throws error.
		System.out.println(a);
		System.out.println(b);
	}

}
