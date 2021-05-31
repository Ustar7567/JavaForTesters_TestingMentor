package q_ExceptionHandling;

public class B_TryCatchFinally {

	public static void main(String[] args) {
		try {
			int b=100/0; 
			System.out.println(b);
		}catch(ArithmeticException ae) {//we can have multiple catch blocks. If we wanna handle all exceptions, then
			//we can give catch(Exception e)
			System.out.println("Something went wrong");
		}
		finally { //no matter exception has occured or not, the code inside finally block is execued
		System.out.println("End"); 
	}
	}

}
