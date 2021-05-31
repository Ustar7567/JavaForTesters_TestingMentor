package m_WrapperClass;

public class A_Integer {

	public static void main(String[] args) {
		
		//Let's say we captured a price from amazon website. It gets captured in the form of a string
		//Now, we need to convert that string into integer to perform operations like addition. In such cases, wrapper class comes handy
		
		String price1="333";
		String price2="444";
		System.out.println("Price of book1 on Amazon is"+price1);
		System.out.println("Price of book2 on Amazon is"+price2);
		
		int p1=Integer.parseInt(price1);
		int p2=Integer.parseInt(price2);
		int p3=p1+p2;
		System.out.println("Total amount of two items is"+p3);
		
		if (p3==777) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}


	}

}
