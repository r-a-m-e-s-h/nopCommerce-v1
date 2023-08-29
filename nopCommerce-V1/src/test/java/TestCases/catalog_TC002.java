package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjects.catalogPage;

public class catalog_TC002 extends BaseClass_nopCommerce{





	@Test
	public void CatalogTC() throws InterruptedException
	{
		
		catalogPage cp = new catalogPage(driver);
		
		cp.clickCatalog();
		Thread.sleep(2000);
		
		cp.clickProductBtn();
		Thread.sleep(2000);
		
		
		//cp.checkSearchBarStatus();		
		
		cp.EnterProductName();
		Thread.sleep(2000);
		
		cp.SelectProductType();
		Thread.sleep(2000);
		
		cp.clickSearchBTn();
		
		
	}

}
