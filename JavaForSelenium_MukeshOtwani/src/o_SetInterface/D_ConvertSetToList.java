package o_SetInterface;

import java.util.ArrayList;
import java.util.TreeSet;

public class D_ConvertSetToList {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("111");
		ts.add("222");
		ts.add("333");
		ts.add("444");
		ts.add("555");
		System.out.println(ts);//here no get method to find element through index value
		
		ArrayList ls=new ArrayList(ts); //converted ts TreeSet to ls ArrayList
		System.out.println(ls.get(2)); //using get method to find element through index value

	}

}
