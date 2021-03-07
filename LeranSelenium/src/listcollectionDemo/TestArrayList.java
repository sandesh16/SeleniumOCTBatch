package listcollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;



public class TestArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Sandesh");
		al.add("Shruti");
		al.add("Sandesh");
		al.add("Pavitra");
		al.add("Sandesh");
		
		
		Iterator itr=al.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		*/

	}

}
