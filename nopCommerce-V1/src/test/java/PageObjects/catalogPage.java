package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class catalogPage {
	
	
	WebDriver driver;
	
	public catalogPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class=\"nav-icon fas fa-book\"]/following-sibling::p")
	public static WebElement catalogBtn;
	
	
	@FindBy(xpath="//p[text()=\" Products\"]")
	public static WebElement productsBtn;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/form[1]/section/div/div/div/div[1]/div/div[1]")
	static WebElement searchBar;
	
	@FindBy(xpath="//input[@id=\"SearchProductName\" and @name=\"SearchProductName\"]")
	public static WebElement productTxtBox;
	
	@FindBy(id="SearchProductTypeId")
	public static WebElement productTypeDD;
	
	@FindBy(id="search-products")
	static WebElement searchBtn;
	
	public void clickCatalog()
	{
		catalogBtn.click();
	}
	public void clickProductBtn()
	{
		productsBtn.click();
	}
	public void clickSearchBar()
	{
		searchBar.click();
	}
	public void EnterProductName()
	{
		productTxtBox.sendKeys("camera");
	}
	public void SelectProductType()
	{
		Select s1 = new Select(productTypeDD);
		s1.selectByVisibleText("Simple");
	}
	public void clickSearchBTn()
	{
		searchBtn.click();
	}
	public void checkSearchBarStatus()
	{
		WebElement sb =driver.findElement(By.xpath("//div[@style=\"display: none;\" and @class=\"search-body \"]"));
		if(!(sb.isEnabled()))
		{
			System.out.println("searech bar is enabled");
		}
		else
		{
			searchBar.click();
		}
	}
	
	

}
