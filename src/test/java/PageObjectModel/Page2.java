package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {
	WebDriver driver;
	public Page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "userName")
	WebElement user;
	
	@FindBy(id = "password")
	WebElement pwd;
	
	@FindBy(id = "login")
	WebElement login;
	
	public void enteruser(String u) {
		user.sendKeys(u);
	}
	
	public void enterpwd(String p) {
		pwd.sendKeys(p);
	}
	
	public void click() {
		login.click();
	}
	
}
