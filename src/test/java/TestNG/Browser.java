package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	WebDriver driver;
	
@BeforeClass
public void Open() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}

@AfterClass
public void Close() {
	driver.close();
}

@DataProvider(name = "test data")
public Object[][] data() {
	return new Object[][] {{"Selenium programs"},{"Selenium TestNG"},{"Cucumber"}};
}

@Test
public void Google() throws InterruptedException {
	driver.get("https://google.com/");
	SoftAssert soft = new SoftAssert();
	String actual = driver.getTitle();
	String expected = "Goog";
	soft.assertEquals(actual, expected);
	soft.assertEquals(actual, "Google");
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
	Thread.sleep(2000);
	soft.assertAll();
}


}
