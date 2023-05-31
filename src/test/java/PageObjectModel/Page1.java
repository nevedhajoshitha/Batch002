package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
WebDriver driver;
	public Page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "login")
	WebElement loginbutton;
	
	public void click() {
		loginbutton.click();
	}
	
}
