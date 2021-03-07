package browserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		
		String PageSource=  driver.getPageSource();
		System.out.println(PageSource);

	}

}
