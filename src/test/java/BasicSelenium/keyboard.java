package BasicSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_G);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_E);
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_E);
	r.keyRelease(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_T);
	
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
}
}
