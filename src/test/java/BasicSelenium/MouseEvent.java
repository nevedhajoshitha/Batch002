package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvent {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/buttons");
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	WebElement dc = driver.findElement(By.id("doubleClickBtn"));
	WebElement rc = driver.findElement(By.id("rightClickBtn"));
	WebElement dynamic = driver.findElement(By.xpath("//button[text()='Click Me']"));
	
	Actions act = new Actions(driver);
	act.doubleClick(dc).perform();
	Thread.sleep(2000);
	
	//act.contextClick(rc).perform();
	act.contextClick().perform();
	Thread.sleep(2000);
	
	act.click(dynamic).perform();
	Thread.sleep(2000);
	
	driver.get("https://demoqa.com/droppable");
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	act.dragAndDrop(drag, drop).perform();
	Thread.sleep(2000);
	
	driver.close();
}
}
