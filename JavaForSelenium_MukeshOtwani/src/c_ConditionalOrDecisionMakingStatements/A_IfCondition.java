package c_ConditionalOrDecisionMakingStatements;

public class A_IfCondition {

	public static void main(String[] args) {
		System.out.println("test started\n");
		int a=100;
		if (a>90) {
			System.out.println("a value is "+a);
		}
		
		if (a<90) {//This will not get executed cz a(100) is not less than 90
			System.out.println("Second if block a value "+a);
		}
		System.out.println("\ntest ended");
	}

}
