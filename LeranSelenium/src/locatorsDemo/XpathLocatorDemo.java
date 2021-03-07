package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:100/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@name='Login'][@value='  Login  ']")).click(); 


	}

}
