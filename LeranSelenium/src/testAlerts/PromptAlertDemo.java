package testAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sai/Desktop/Prompts1.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		
		Alert alert=  driver.switchTo().alert();
		
		driver.switchTo().alert().sendKeys("Sandesh");
		
		//System.out.println(alert.getText());

		alert.accept();
		
		System.out.println(alert.getText());

		
		
		
		
	}

}
