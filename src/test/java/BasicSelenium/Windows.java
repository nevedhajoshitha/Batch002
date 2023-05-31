package BasicSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	
	driver.findElement(By.id("windowButton")).click();
	//driver.findElement(By.id("messageWindowButton")).click();
	String main = driver.getWindowHandle();
	Set<String> child = driver.getWindowHandles();
	
	System.out.println(main);
	System.out.println(child);
	
	Iterator<String> it = child.iterator();
	
	while(it.hasNext()) {
		String s = it.next();
		if(!main.equalsIgnoreCase(s)) {
			driver.switchTo().window(s);
			Thread.sleep(2000);
			String str = driver.findElement(By.cssSelector("#sampleHeading")).getText();
			System.out.println(str);
			
		}
	}
	driver.switchTo().defaultContent();
	
	driver.quit();
}
}
