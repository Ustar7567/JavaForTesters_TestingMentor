package b_Encapsulation;

public class B_BoxCreation {

	public static void main(String[] args) {
		A_Common o1=new A_Common();
		int a= o1.setHeight(10); //Assigning length, width and height through setter methods
		int b= o1.setLength(20);
		int c= o1.setWidth(15);
		o1.setBoxDimensions(a,b,c); //executing setboxdimension method through variables set from setter methods
		
		System.out.println(o1.getHeight()); //printing the assigned height through getter method

	}

}

//Basically, we are restricting the type of dimensions the user gives.
//User can provide h or l or b that's less than 1 through which it's impossible to create a box cz box dimensions should be >=1
//In this case, through encapsulation, we are writing logic in setter method to avoiding taking invalid input
//So, user can't directly provide variable values in his class in which he is using our logic and variables. But can set the values using setter method