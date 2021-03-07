package setCollectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashset {

	public static void main(String[] args) {
		
		///It does not maintains any order
		HashSet<String> h=new HashSet<String>();
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
