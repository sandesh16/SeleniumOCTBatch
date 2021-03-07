package abstractionExamples;

public class Rectangle extends Shape {
	
	
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
	
	public static void main(String[] args) {
		
		Shape s=new Rectangle();
		s.draw();
		
	}

}
