package interfaceExample2;

public class Vehicle implements Movable, Stoppable {
	
	public void move() {
		System.out.println("Avrage Speed is" +Avg_Speed);
		
	}
	
	public void stop() {
		System.out.println("Vehicle is stop");
		
	}

}
