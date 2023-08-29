package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"Email\" and @name=\"Email\"]")
	 static WebElement username;
	
	@FindBy(xpath="//input[@id=\"Password\" and @name=\"Password\"]")
	 static WebElement pwd;
	
	@FindBy(xpath="//div//button[text()=\"Log in\"]")
	 static WebElement loginbtn;
	
	public void EnterUserName(String name)
	{
		username.clear();
		username.sendKeys(name);
	}
	public void EnterPassword(String passwd)
	{
		pwd.clear();
		pwd.sendKeys(passwd);
	}
	public void clickLoginBtn()
	{
		loginbtn.click();
	}
	
	

}
