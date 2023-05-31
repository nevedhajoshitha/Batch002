package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/select-menu");
	WebElement dd = driver.findElement(By.id("cars"));
	Select s = new Select(dd);
	s.selectByIndex(2);
	Thread.sleep(2000);
	s.selectByValue("saab");
	Thread.sleep(2000);
	s.selectByVisibleText("Audi");
	Thread.sleep(2000);
	s.deselectAll();
	Thread.sleep(2000);
	
	driver.close();
}
}
