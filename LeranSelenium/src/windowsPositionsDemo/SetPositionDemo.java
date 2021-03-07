package windowsPositionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//Set Position  -From Left & from Top
		driver.manage().window().setPosition(new Point(50, 200));

		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("pass")).sendKeys("testing");
		driver.findElement(By.id("u_0_b")).click();

		// driver.close();

	}

}
