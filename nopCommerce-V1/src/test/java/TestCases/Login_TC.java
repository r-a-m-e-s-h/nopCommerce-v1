package TestCases;

import org.testng.annotations.Test;

import PageObjects.loginPage;



public class Login_TC extends BaseClass_nopCommerce{
	
	
	
@Test
public void loginTestCase()
{
	loginPage lp = new loginPage(driver);
	
	lp.EnterUserName(uname);
	logger.info("UserName Enteried");
	
	lp.EnterPassword(pwd);
	logger.info("PassWord Entered");
	
	lp.clickLoginBtn();
	logger.info("Login Btn CLicked");
}
	
	
	
	
	
	
	
			
	
	

}
