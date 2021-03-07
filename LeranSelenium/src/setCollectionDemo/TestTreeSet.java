package setCollectionDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		///It maintains Ascending Order
		TreeSet<String> h=new TreeSet<String>();
		h.add("Ravi");
		h.add("Vijay");
		h.add("Ravi");
		h.add("Ajay");
		h.add("Ravi");
		
		
		Iterator<String> itr=h.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
