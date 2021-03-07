package browserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommandDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Loads URL in the Browser
		driver.get("http://localhost:100/");
		
		

	}

}
