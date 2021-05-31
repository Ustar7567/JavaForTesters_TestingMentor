package c_ConditionalOrDecisionMakingStatements;

public class C_NestedIfElse {

	public static void main(String[] args) {
		System.out.println("Test starts");
		String browser="chrome";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test executed on Chrome");
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Test executed on Firefox");
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.out.println("Test executed on IE");
		}
		else {
			System.out.println("Test executed on other browser");
		}
		System.out.println("Test ends");

	}

}
