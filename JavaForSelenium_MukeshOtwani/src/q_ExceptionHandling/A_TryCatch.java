package q_ExceptionHandling;

public class A_TryCatch {

	public static void main(String[] args) {
		
		try {
			int b=100/0; //if we write a valid code linke 100/2 in this line, o/p will be from try block
			System.out.println(b);
		}catch(ArithmeticException ae) {
			System.out.println("Something went wrong");//cz there's an excp in try block, it came to catch block
		}
		//if we wring this code without try, catch, prgrm terminates at line 8
		System.out.println("End");

	}

}
