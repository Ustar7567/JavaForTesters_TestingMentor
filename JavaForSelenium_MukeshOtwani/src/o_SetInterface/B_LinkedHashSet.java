package o_SetInterface;

import java.util.LinkedHashSet;

public class B_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Selenium");
		lhs.add("TestNG");
		lhs.add("Maven");
		lhs.add("Jenkins");
		lhs.add("Cucumber");
		
		System.out.println(lhs);//Elements will be printed in insertion order in LinkedHashSet
		
	}

}
