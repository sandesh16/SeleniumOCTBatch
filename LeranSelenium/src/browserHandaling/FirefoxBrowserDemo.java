package browserHandaling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Driver\\Vo27\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://google.com/");
	

	}

}
