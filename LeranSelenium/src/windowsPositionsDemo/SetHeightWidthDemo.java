package windowsPositionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetHeightWidthDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// Set size window -Height & width
		driver.manage().window().setSize(new Dimension(300, 500));

		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("pass")).sendKeys("testing");
		driver.findElement(By.id("u_0_b")).click();

		// driver.close();

	}

}
