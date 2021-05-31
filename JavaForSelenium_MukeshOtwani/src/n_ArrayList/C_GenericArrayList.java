package n_ArrayList;

import java.util.ArrayList;

public class C_GenericArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Selenium");
		al.add("Training");
		al.add("is");
		al.add("fun");
		
		for (int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}

	}

}
