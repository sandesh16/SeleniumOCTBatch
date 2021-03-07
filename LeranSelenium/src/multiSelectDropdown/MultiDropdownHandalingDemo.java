package multiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdownHandalingDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Driver/86/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sai/Desktop/MultiselectDropdown.html");
		
		driver.manage().window().maximize();
		
		Select drp= new Select(driver.findElement(By.id("fruits")));
		drp.selectByVisibleText("Banana");
		drp.selectByVisibleText("Apple");
		drp.selectByVisibleText("Mango");
		
		Thread.sleep(3000);
		
		drp.deselectAll();
		
		//Thread.sleep(3000);
		
	//	drp.deselectByVisibleText("Banana");
		
		

	

	}

}
