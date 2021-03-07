package drodownHandaling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandalingDemo {

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
		
		driver.findElement(By.name("bSubmit")).click();
		
		Select drp= new Select(driver.findElement(By.name("CardType")));
		//drp.selectByVisibleText(" Visa ");
		
		//drp.selectByValue("Visa");
		
		drp.selectByIndex(1);
		
		driver.findElement(By.name("shipSameAsBill")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("shipSameAsBill")).click();

	}

}
