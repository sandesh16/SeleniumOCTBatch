package test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//How to read excel files using Apache POI
public class aa {
	
	public static void main(String[] args) throws Exception {

		// I have placed an excel file 'Test.xlsx' in my D Driver
		FileInputStream fis = new FileInputStream("C:\\Driver\\ExcelData\\ExcelReadWrite.xlsx.xlsx");
	

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		// I have added test data in the cell A1 as "Laptop search"
		// Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
	
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);

	//	System.out.println(cell);

		
		System.out.println(sheet.getRow(0).getCell(0));
	

		String cellval = cell.getStringCellValue();
		//System.out.println(cellval);


		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\88\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// Using the ExcelData String variable in SendKeys
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(cellval);

	}
}