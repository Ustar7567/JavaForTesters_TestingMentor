package o_SetInterface;

import java.util.TreeSet;

public class C_TreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("123");
		ts.add("Selenium");
		ts.add("TestNG");
		ts.add("Maven");
		ts.add("Jenkins");
		ts.add("Cucumber");

		System.out.println(ts);//Elements will be printed in ascending order in TreeSet	
		//we can use for loop, enhanced for loop, while loop, iteration also to print the elements

	}

}
