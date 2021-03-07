package testAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertDemo {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:100/");
		driver.manage().window().maximize();

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.linkText("New Lead")).click();
		
		driver.findElement(By.name("button")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.quit();
	}

}
