package n_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class B_Iterator {

	public static void main(String[] args) {
		ArrayList o1=new ArrayList();
		o1.add("Manju");
		o1.add(777);
		o1.add(33.3);
		o1.add('P');
		
		Iterator abc=o1.iterator();
		System.out.println("Printing ArrayList elements using Iterator");
		while(abc.hasNext()) {
			Object value=abc.next();
			System.out.println(value);
		}
		

	}

}
