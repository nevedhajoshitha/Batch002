package BasicSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotSelenium {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement frame = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']//iframe"));
	
	driver.switchTo().frame(frame);
	
	WebElement drag = driver.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
	WebElement drop = driver.findElement(By.cssSelector("div#trash"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(drag, drop).perform();
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	

	
//	TakesScreenshot ts = (TakesScreenshot)driver;
//	File temp = ts.getScreenshotAs(OutputType.FILE);
//	File per = new File("C:\\Users\\NEVEDHA\\eclipse-workspace\\SeleniumINT002\\target\\screenshot.png");
//	FileUtils.copyFile(temp, per);
	
	driver.close();
}
}
