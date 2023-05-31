package HandsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Captcha {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	
	d.get("https://www.orangehrm.com/en/contact-sales/");
	
	WebElement f = d.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));

	d.switchTo().frame(f);
	Thread.sleep(2000);
	d.findElement(By.id("recaptcha-anchor")).click();
}
}
