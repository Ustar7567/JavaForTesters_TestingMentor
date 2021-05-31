package b_Loops;

public class C_DoWhileLoop {

	public static void main(String[] args) {
		int ticket=70;
		do {
			System.out.println("Condition met "+ticket);
			ticket++;
		}while(ticket<=75);//condition met
		//Do-While loop executes at least once even if the condition inside while part is not met.check the following piece of code
		
		int tckt=50;
		do {
			System.out.println("\nCondition not met "+tckt);
			tckt++;
		}while(tckt<=40);//Condition not met.tckt value (50)is not <=40.Still the loop runs once and prints tckt value as 50.
	}
}
