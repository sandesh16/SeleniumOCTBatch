package excelReaderDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReaderTest {

	public static void main(String[] args) throws Exception {
		
		//Create Excel file & keep on your computer 
		FileInputStream fis=new FileInputStream("C:\\Driver\\ExcelData\\ExcelReadWrite.xlsx.xlsx");
		
		//create object of workbook
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//create object of sheet
		//XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFSheet sheet=workbook.getSheet("Data");
		
		
		//in excel keep data at row 1 & cell no 1
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		
		System.out.println(cell);
		
		String cellvalue=cell.getStringCellValue();
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\88\\chromedriver.exe");
	 	WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(cellvalue);
		
		
		
		
		
		
	}

}
