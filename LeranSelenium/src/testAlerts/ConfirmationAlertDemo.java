package testAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:100/");
		driver.manage().window().maximize();

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.linkText("New Account")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("Shruti");
		
		driver.findElement(By.name("button")).click();
		driver.findElement(By.name("Delete")).click();
		
		//Capturing alerts message
		
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		
		
		//now dismiss alert
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
