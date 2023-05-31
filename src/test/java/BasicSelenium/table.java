package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	WebElement table = driver.findElement(By.id("customers"));
	
	List<WebElement> headings = table.findElements(By.tagName("th"));
	for(int i=0; i<headings.size();i++) {
		WebElement h = headings.get(i);
		String s = h.getText();
		System.out.println(s);
	}
	
	List<WebElement> content = table.findElements(By.tagName("td"));
	for(int i =0; i<content.size();i++) {
		WebElement c = content.get(i);
		String s = c.getText();
		System.out.println(s);
	}
	driver.close();
}
}
