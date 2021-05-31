package n_ArrayList;

import java.util.ArrayList;

public class A_ArrayList {

	public static void main(String[] args) {
		
		ArrayList obj1=new ArrayList();
		obj1.add("Selenium");
		obj1.add("Selenium");//add allows duplicate values as well.But if we use obj.set, it won't allow duplicates.
		obj1.add(69876976);
		obj1.add(7565.8778);
		obj1.add('M');
		System.out.println(obj1);
		System.out.println(obj1.get(3));
		
		System.out.println("\nprinting elements using for loop");
		int a=obj1.size();
		for(int i=0;i<a;i++) {
			System.out.println(obj1.get(i));
		}
		
		System.out.println("\nPrinting elements using enhanced for loop");
		for(Object abc:obj1) {
			System.out.println(abc);
		}

	}

}
