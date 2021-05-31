package c_ConditionalOrDecisionMakingStatements;

public class B_IfElse {

	public static void main(String[] args) {
		System.out.println("Test starts");
		String browser="Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on Chrome");
		}
		else {
			System.out.println("Test excuted in other browser");
		}
		System.out.println("Test ends");

	}

}
