package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentTabularReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	ExtentHtmlReporter report = new ExtentHtmlReporter("C:\\Users\\NEVEDHA\\eclipse-workspace\\SeleniumINT002\\target\\extentreport.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(report);
	ExtentTest test = extent.createTest("First report", "this is my first extent report");
	
	driver.get("https://demoqa.com/books");
	test.log(Status.INFO, "The page is loaded");
	Page1 p1 = new Page1(driver);
	p1.click();
	
	Thread.sleep(2000);
	
	Page2 p2 = new Page2(driver);
	p2.enteruser("nevedha");
	p2.enterpwd("Joshitha@2015");
	Thread.sleep(2000);
	p2.click();
	test.log(Status.INFO, "The user has logged in successfully");
	
	Thread.sleep(2000);
	
	driver.close();
	extent.flush();
}
}
