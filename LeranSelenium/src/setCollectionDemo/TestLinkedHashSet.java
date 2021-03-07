package setCollectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		
		///It maintains insertion order
		LinkedHashSet<String> h=new LinkedHashSet<String>();
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
