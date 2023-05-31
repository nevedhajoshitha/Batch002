package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\NEVEDHA\\eclipse-workspace\\SeleniumINT002\\target\\Int002.xlsx");
		
		FileInputStream input = new FileInputStream(f);
		
		XSSFWorkbook w = new XSSFWorkbook(input);
		
		XSSFSheet s = w.getSheet("Int002");
		
		XSSFRow r = s.getRow(0);
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com/");
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys(r.getCell(0).getStringCellValue());
		
		driver.close();
	}
}
