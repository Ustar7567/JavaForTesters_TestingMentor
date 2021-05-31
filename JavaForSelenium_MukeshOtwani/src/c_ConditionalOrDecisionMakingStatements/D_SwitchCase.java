package c_ConditionalOrDecisionMakingStatements;

public class D_SwitchCase {

	public static void main(String[] args) {
		int empRating=2;
		switch(empRating) {
		case 1: System.out.println("Poor performance");
		break;
		case 2:System.out.println("Meeting expectations");
		break;
		case 3:System.out.println("Well done");
		break;
		case 4:System.out.println("Employee of the year");
		break;
		default:System.out.println("You are fired");
		}

	}

}
