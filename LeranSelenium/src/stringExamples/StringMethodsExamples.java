package stringExamples;

public class StringMethodsExamples {

	public static void main(String[] args) {
	
		String str="Selenium";
		//lenght of the string
		System.out.println(str.length());
		
		//return a char value at the given index number
		System.out.println(str.charAt(7));
		
		//combines specific string at the end of string
		System.out.println(str.concat(" Webdrive"));
		
		//Check if this string start with  given prefix -Boolean 
		System.out.println(str.startsWith("Sel"));
		
		//Check if this string end with given suffix -Boolean
		System.out.println(str.endsWith("um"));
		
		//compare the containts of given 2 string 
		String str1="Selenium";
		System.out.println(str.equals(str1));
		
		System.out.println(str.indexOf("m"));
		
		String str4="";
		System.out.println(str4.isEmpty());
		
		System.out.println(str.replace('e', 'a'));
		
		//remove the index
		System.out.println(str.substring(1));
		
		String str5="SELENIUM";
		System.out.println(str5.toLowerCase());
		
		String str6="selenium";
		System.out.println(str6.toUpperCase());
		
		String str7="          selenium      ";
		System.out.println(str7.trim());
		
		
		
		
		

	}

}
