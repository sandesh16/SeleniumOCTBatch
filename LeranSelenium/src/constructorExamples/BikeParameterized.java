package constructorExamples;

public class BikeParameterized {
	
	String Smodel;
	
	BikeParameterized (String Model)
	{
		Smodel=Model;
		System.out.println("Model of the Bike " +Smodel);
	}

	public static void main(String[] args) {
		BikeParameterized b=new BikeParameterized("Royel enfiled");

	}

}
