package g_Arrays;

public class A_SingleDimensionalArray {

	public static void main(String[] args) {
		int studentID[]=new int[5];
		studentID[0]=3243;
		studentID[1]=3444;
		studentID[2]=3424;
		studentID[3]=5656;
		studentID[4]=4332;
		System.out.println(studentID[3]+"\n");
		
		
		int a=0;
		while(a<studentID.length) {
			System.out.print(studentID[a]+" ");//printing array values using while loop
			a++;
		}
		System.out.println("\n");
		
		for(int i=0;i<studentID.length;i++) {
			System.out.print(studentID[i]+" ");//printing array values using for loop
		}
	}
		

	}
