package actionclassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		 //Note: Following statement is required since Selenium 3.0, 
		//optional till Selenium 2.0
	
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\88\\chromedriver.exe");
 	WebDriver driver = new ChromeDriver();
	 
	//String URL = "https://demoqa.com/droppable/";
	 
	//driver.get(URL);
	
	driver.get("https://demoqa.com/droppable/");
	 
	// It is always advisable to Maximize the window before performing DragNDrop action		 
	driver.manage().window().maximize();
	 
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	
	//Actions class method to drag and drop		
	Actions builder = new Actions(driver);
	 
	WebElement from = driver.findElement(By.id("draggable"));
	 
	WebElement to = driver.findElement(By.id("droppable"));	 
	
	//Perform drag and drop
	builder.dragAndDrop(from, to).perform();
	
	//verify text changed in to 'Drop here' box 
	String textTo = to.getText();

	if(textTo.equals("Dropped!")) {
		System.out.println("PASS: Source is dropped to target as expected");
	}else {
		System.out.println("FAIL: Source couldn't be dropped to target as expected");
	}

	//driver.close();

}	

}