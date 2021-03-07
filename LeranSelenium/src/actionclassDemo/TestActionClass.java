package actionclassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


public class TestActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\86\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sai/Desktop/Action.html?CurrentAddress=davbindu+society%2C+pune&PermanentAddress=davbindu+society%2C+pune");
		
		driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.id("userName"));
		WebElement currAddr= driver.findElement(By.id("currentAddress"));
		WebElement perAddr= driver.findElement(By.id("permanentAddress"));
		WebElement submitbutton= driver.findElement(By.id("submit"));
		
		//Instanciate action class
		Actions action=new Actions(driver);
		action.sendKeys(username,"Mr. Sandesh").perform();
		
		//Enter Current Address
		action.click(currAddr).sendKeys("Davbindu society Pune").perform();
		
		//copy current address
		action.keyDown(currAddr, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//Paste current address in permanent address
		action.keyDown(perAddr, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		//click on submit button
		submitbutton.click();
		
		
		
	}

}
