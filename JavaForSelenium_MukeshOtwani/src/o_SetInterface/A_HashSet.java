package o_SetInterface;

import java.util.HashSet;

public class A_HashSet {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Selenium");
		hs.add("TestNG");
		hs.add("Maven");
		hs.add("Jenkins");
		hs.add("Cucumber");
		
		System.out.println(hs);//Elements won't be printed in insertionOrder in HashSet

	}

}
