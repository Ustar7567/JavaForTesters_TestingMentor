package l_ThisKeyword;

public class B_WithVariables {
	
	int x;
	int y;
	
	public B_WithVariables(int x, int y) {
		this.x=x; //this keyword here is assigning the passed x,y values (10,30) to instance variables
		this.y=y;
		/*If we do this,
		 * x=x;
		 * y=y;
		 *sys gets confused as to which is global variable and which is local variable
		 *and uses default values of those instance variables to perform addition. result will be 0*/
		
		/*but, if we write the code as follows:
		public B_WithVariables(int a, int b) {
		x=a; 
		y=b;
		there won't be any confusion. This keyword need not be used in this case */
	}
	
	public void sum() {
	int sum=x+y;
	System.out.println(sum);
	}

	public static void main(String[] args) {
		B_WithVariables o1=new B_WithVariables(10,30);
		o1.sum();

	}

}
