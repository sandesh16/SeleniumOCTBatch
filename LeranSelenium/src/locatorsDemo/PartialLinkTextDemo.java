package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:100/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("vtiger Customer Portal")).click();
		
		driver.findElement(By.partialLinkText("vtiger")).click();

	}

}
