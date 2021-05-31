package g_Arrays;

public class B_MultiDimensionalArray {

	public static void main(String[] args) {
		int roll[][]=new int[3][3];//array with 3 rows, 3 columns
		roll[0][0]=30;//1st row,1st column
		roll[0][1]=31;
		roll[0][2]=32;
		roll[1][0]=33;//2nd row,1st column
		roll[1][1]=34;
		roll[1][2]=35;
		roll[2][0]=36;
		roll[2][1]=37;//3rd row,2nd column
		roll[2][2]=38;
		
		//We can also declare and initialize the array in the same line as follows
		//int[][] roll={{30,31,32},{33,34,35},{36,37,38}};
		System.out.println(roll[0][2]);

		System.out.println("Length is "+roll.length);

		for(int i=0;i<roll.length;i++) {
			for(int j=0;j<roll.length;j++) {
				System.out.println(roll[i][j]);
			}
			
		}

	}
}
