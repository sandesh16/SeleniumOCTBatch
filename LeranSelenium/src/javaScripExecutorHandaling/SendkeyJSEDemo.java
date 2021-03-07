package javaScripExecutorHandaling;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyJSEDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:100/");

		driver.manage().window().maximize();

		// sendkey
		WebElement element = driver.findElement(By.name("user_name"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='admin';", element);

		// sendkey
		WebElement sandesh = driver.findElement(By.name("user_password"));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='admin';", sandesh);

		// Click
		WebElement ele2 = driver.findElement(By.name("Login"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele2);

		// Scroll Down -Vertical
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(3000);

		// Scroll Down -Vertical
		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("window.scrollBy(0,-500)");

		// Set size window -Height & width
		driver.manage().window().setSize(new Dimension(300, 500));

		Thread.sleep(2000);

		// Scroll Down -Horizantal
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("window.scrollBy(1000,0)");
		
		Thread.sleep(2000);

		// Scroll Down -Horizantal
		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor6.executeScript("window.scrollBy(-500,0)");

	}

}
