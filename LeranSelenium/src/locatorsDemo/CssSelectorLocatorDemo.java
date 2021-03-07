package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocatorDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:100/");
		
		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[name='user_password']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[name='Login']")).click();
		Thread.sleep(3000);

	}

}
