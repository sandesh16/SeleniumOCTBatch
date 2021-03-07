package windowsPositionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindowDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// Maximize window
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("pass")).sendKeys("testing");
		driver.findElement(By.id("u_0_b")).click();

		// driver.close();

	}

}

