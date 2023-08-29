package Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties = new Properties();
	
	
	public ReadConfig()
	{
		File fpath = new File("./config.properties");
		try
		{
			 
			FileInputStream fis = new FileInputStream(fpath);
			properties.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("The Error Message is  : "+e.getMessage());
		}
	}
	
	public String getURL()
	{
		String loginUrl = properties.getProperty("BaseLoginURL");
		return loginUrl;
	}
	public String getUserName()
	{
		String uname = properties.getProperty("UserName");
		return uname;
	}
	public String getPassword()
	{
		String pwd = properties.getProperty("PassWord");
		return pwd;
	}
	
	
	

}
