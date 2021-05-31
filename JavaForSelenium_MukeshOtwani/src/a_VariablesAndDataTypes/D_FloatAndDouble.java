package a_VariablesAndDataTypes;

public class D_FloatAndDouble {

	public static void main(String[] args) {
		//If we initialize a float value to int variable like int a=45.65; system will show red error msg at the value (45.65 in this case)
		//If we hover over the red warning, it gives two options "Add cast to int","Change type of 'a' to 'double'.
		//If we click on add cast to int, system will do type casting like int a=(int) 45.6787; o/p will be 45
		//If we click on Change type of 'a' to 'double', system changes type of a to double like double a= 45.6787; o/p will be 45.6787
		//*By default, system takes fractional values as double.
		//But, keeping memory allocation in mind, if we wanna change it to float like float a= 45.6787;again s/s shows red warnings
		//If we hover over the red warning, it gives two options "Add cast to float","Change type of 'a' to 'double'.
		//If we do casting like float a= (float) 45.6787; o/p is 45.6787
		//If we change type to double,system changes type of a to double like double a= 45.6787; o/p will be 45.6787
		//Here, again memory allocation issue.
		//So, if we wanna forcefully tell the system that we need the value in float, then append 'f'at the end of the fractional value.
		float a= 45.6787f;
		float a1= (float)87.897;//Type casting
		System.out.println(a);
		System.out.println(a1);
		double b=67.8876756755;
		System.out.println(b);
		int c= (int) 8678.897;//Type casting. Prints only 8678. 
		//This type casting is downcasting. Casting float to int in this case.
		//Two types of type casting=> down-casting(casting higher data type to lower data type) and Up-casting(vice versa to down-casting).
		System.out.println(c);
		float f=(float)7887;
		System.out.println(f);//Up-casting

	}

}
