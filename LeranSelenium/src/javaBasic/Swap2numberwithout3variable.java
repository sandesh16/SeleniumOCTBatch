package javaBasic;

public class Swap2numberwithout3variable {

	public static void main(String[] args) {
		int a=10;
		int b=5;

		a=a+b; // --> a=15
		b=a-b;   //-->b=10
		a=a-b;   //-->a=5;
		//test
		System.out.println("value of a is:-" +a);
		System.out.println("value of b is:-" +b);
	}

}
