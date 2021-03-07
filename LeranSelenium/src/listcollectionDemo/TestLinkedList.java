package listcollectionDemo;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
	
	LinkedList LL=new LinkedList();
	LL.add(10);
	LL.add(70);
	LL.add(15);
	LL.addLast(100);
	LL.addFirst(5);
	
	System.out.println("Original contents of LL" +LL);
	
	LL.remove(2);
	LL.removeFirst();
	LL.removeLast();
	System.out.println("LL after deleting" +LL);
	
	
	}

}
