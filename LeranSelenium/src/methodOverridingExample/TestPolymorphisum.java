package methodOverridingExample;

public class TestPolymorphisum {

	public static void main(String[] args) {
		
	RBIBank b=new SBIBank();
	System.out.println("SBI bank rate of interest" +b.GetRateOfInterest());
	
	RBIBank b1=new ICICIBank();
	System.out.println("ICICI bank rate of interest" +b1.GetRateOfInterest());
	
	
	RBIBank b2=new AxisBank();
	System.out.println("Axix bank rate of interest" +b2.GetRateOfInterest());
	
	}

}
