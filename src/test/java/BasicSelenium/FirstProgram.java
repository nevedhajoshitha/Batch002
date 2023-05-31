package BasicSelenium;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class FirstProgram {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.navigate().to("https://demoqa.com/");
	
	
	Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	ImageIO.write(s.getImage(),"PNG", new File("C:\\Users\\NEVEDHA\\eclipse-workspace\\SeleniumINT002\\target\\FullPage.png"));
	
	//WebElement ele = driver.findElement(By.id("email"));
	
	//js.executeScript("alert('welcome to the session');");
//	js.executeScript("document.getElementByID('pass').click();");
//	Thread.sleep(2000);
//	//ele.sendKeys("username");
//	//Thread.sleep(2000);
//	WebElement ele1 = driver.findElement(By.id("pass"));
//	ele1.sendKeys("password");
//	WebElement ele2 = driver.findElement(By.xpath("//button[@name='login']"));
//	//ele2.click();
//	js.executeScript("arguments[0].click();", ele2);
//	Thread.sleep(2000);
	
	driver.close();
}
}
