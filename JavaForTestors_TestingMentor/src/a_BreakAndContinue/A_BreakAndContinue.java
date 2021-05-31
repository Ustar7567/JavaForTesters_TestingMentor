package a_BreakAndContinue;

public class A_BreakAndContinue {

	public static void main(String[] args) {
		
		int a=10;
		
		System.out.println("Break keyword");
		for(int i=0;i<=10;i++) {//This prints values from 1 to 10 usually.
			if(i==7) {//But, we wanna break the execution when i value reaches 7, then we use break keyword
				break;
			}
			System.out.println(i); 
		}
		System.out.println("Continue keyword");
		for(int i=0;i<=10;i++) {
			if(i==7) { //If i value reaches 7, then execution for 7th iteration is skipped and continued from the next iteration
				continue;
			}
			System.out.println(i);
		}

	}

}
