package BasicSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waits {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.navigate().to("https://www.google.com/");
	
	//implicit wait
	//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	
	//explicit wait
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
	
	FluentWait<WebDriver> fluent = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(3));
	fluent.pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);
	fluent.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	
	driver.findElement(By.name("q")).sendKeys("Selenium waits");
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
	
	driver.close();
}
}
