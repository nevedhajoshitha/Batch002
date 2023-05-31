package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio_Check {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.get("https://demoqa.com/automation-practice-form");
	
	WebElement ele = driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
	ele.click();
	Thread.sleep(2000);
	System.out.println(ele.isSelected());
	
	
	WebElement check = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
	check.click();
	//System.out.println(check.isSelected());
	Thread.sleep(2000);
	driver.close();
}
}
