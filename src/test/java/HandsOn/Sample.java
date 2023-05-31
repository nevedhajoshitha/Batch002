package HandsOn;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();

	JavascriptExecutor js = (JavascriptExecutor)d;
	
	d.get("https://stqatools.com/demo/Alerts.php");
	Thread.sleep(2000);
	
	d.findElement(By.id("btnAlert")).click();
	
	//js.executeScript("return alert('Hello World')");
	
//	Alert a = d.switchTo().alert();
//	a.accept();
	
	String s = d.findElement(By.id("ezAlerts-message")).getText();
	System.out.println(s);
	
	d.findElement(By.xpath("//button[text()='Ok']")).click();
}
}
