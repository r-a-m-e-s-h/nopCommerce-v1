package TestCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utilites.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_nopCommerce {
	
	public static WebDriver driver;
	public static Logger logger = Logger.getLogger(BaseClass_nopCommerce.class);
	
	ReadConfig config = new ReadConfig();
	
	String uname = config.getUserName();
	String pwd = config.getPassword();
	String url = config.getURL();

	
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		
		logger.info("URL is opened");
	
		
	}
	
	@AfterTest
	public void TearDown()
	{
		//driver.quit();
	}
	
	

}
