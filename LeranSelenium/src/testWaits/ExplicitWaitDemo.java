package testWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:100/");
		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.linkText("New Lead")).click();
		
		//Explicit wait - to wait for the first text box is clickable
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));

		//Thread.sleep(3000);
		
		//sendkey as soon as firstname text box is visible
		
		driver.findElement(By.name("firstname")).sendKeys("sandesh");

	} 

}
