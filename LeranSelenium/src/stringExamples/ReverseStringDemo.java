package stringExamples;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		String str="Selenium";
		int i=str.length();   //i=8
		
		//StringBuilder obj=new StringBuilder();
		
		StringBuffer obj=new StringBuffer();
		
		for (int j = i-1; j >=0; j--) 
		{
			obj=obj.append(str.charAt(j));
			
		}
		
		System.out.println(obj);

	}

}
