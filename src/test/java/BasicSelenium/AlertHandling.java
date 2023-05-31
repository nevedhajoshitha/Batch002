package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.id("alertButton")).click();
	Alert alert = driver.switchTo().alert();
	String str = alert.getText();
	alert.accept();
	
	System.out.println(str);
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("confirmButton")).click();
	alert.dismiss();
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("promtButton")).click();
	alert.sendKeys("abcd");
	alert.accept();
	Thread.sleep(2000);
	driver.close();
	
	
}
}
