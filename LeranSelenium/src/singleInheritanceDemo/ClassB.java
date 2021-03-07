package singleInheritanceDemo;

public class ClassB extends ClassA {
	
	void testone()
	{
		System.out.println("Single inheritance implementation testing form child class");
	}
	

	public static void main(String[] args) {
	
		ClassB obj=new ClassB();
		obj.test();
		obj.testone();

	}

}
