package testFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sai/Desktop/Framesdemo.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//driver.switchTo().frame("IF1");
		
		//driver.switchTo().frame("iframe1");
		
			
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		

	}

}
