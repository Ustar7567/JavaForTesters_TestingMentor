package p_MapInterface;

import java.util.HashMap;

public class A_HashMap {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("007", "Sel");
		hm.put("02", "TestNG");
		hm.put("300", "Maven");
		hm.put("04", "Jenkins");
		hm.put("202", "Cucumber");
		hm.put("202", "Cuc1");//HashMap doesn't allow duplicate values. Printed 202 key value only once
		
		System.out.println(hm);//Doesn't print values in an order
		System.out.println(hm.get("007"));//Retrieving only one value
		System.out.println(hm.entrySet()); //entrySet is used in Sel
	//LinkedHashMap returns values based on insertion order
    //TreeMap returns values in ascending order

	}

}
