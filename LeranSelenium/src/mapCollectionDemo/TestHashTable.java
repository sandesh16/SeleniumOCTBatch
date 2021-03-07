package mapCollectionDemo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;

public class TestHashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm=new Hashtable<Integer, String>();
		hm.put(100, "Amit");
		hm.put(107, "sandesh");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		hm.put(102, "Rahul");
		
		//to convert map into collection 
		Collection entr=hm.entrySet();
		
		Iterator itr=entr.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
