package stringExamples;

public class StringManupulationExampls {

	public static void main(String[] args) {
	
		//StringBuffer sb=new StringBuffer("Selenium");
		StringBuilder sb=new StringBuilder("Selenium");
		
		sb.insert(8, " Webdriver");
		sb.delete(5, 8);
		sb.append(" test");
		
		System.out.println(sb);
		

	}

}
