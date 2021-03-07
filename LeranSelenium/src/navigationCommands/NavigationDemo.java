package navigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Driver/86/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://demo.borland.com/gmopost/online-catalog.htm");
		
		driver.navigate().to("http://demo.borland.com/gmopost/online-catalog.htm");

		driver.manage().window().maximize();

		driver.findElement(By.name("QTY_TENTS")).clear();
		driver.findElement(By.name("QTY_TENTS")).sendKeys("10");
		driver.findElement(By.name("QTY_SHORTS")).clear();
		driver.findElement(By.name("QTY_SHORTS")).sendKeys("20");
		driver.findElement(By.name("bSubmit")).click();

		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().refresh();
	}

}
