package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.borland.com/gmopost/");
		driver.manage().window().maximize();

		
		driver.findElement(By.name("bSubmit")).click();
		
		driver.findElement(By.name("QTY_TENTS")).clear();
		driver.findElement(By.name("QTY_TENTS")).sendKeys("10");
		
		driver.findElement(By.name("QTY_BACKPACKS")).clear();
		driver.findElement(By.name("QTY_BACKPACKS")).sendKeys("20");
		
		
		driver.findElement(By.name("QTY_SHORTS")).clear();
		driver.findElement(By.name("QTY_SHORTS")).sendKeys("30");
		
	
		driver.findElement(By.name("bSubmit")).click();
		
	}

}
