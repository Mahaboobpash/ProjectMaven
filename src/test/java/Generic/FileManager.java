package Generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class FileManager {
	Properties pro;
	public FileManager()
	{
		try
		{
			FileInputStream fis=new FileInputStream("./configuration.properties");
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			Reporter.log("Property file not found", true);
		}
	}
	public String getFlipkartURL()
	{
		String url= pro.getProperty("flipkart");
		if(url==null)
			throw new RuntimeException("URL is not found");
		return url;
	}
	
	public String getAmazonURL()
	{
		String url= pro.getProperty("amazon");
		if(url==null)
			throw new RuntimeException("URL is not found");
		return url;
	}
	
	public String getMyntraURL()
	{
		String url= pro.getProperty("myntra");
		if(url==null)
			throw new RuntimeException("URL is not found");
		return url;
	}
	
	public String getFacebookURL()
	{
		String url= pro.getProperty("facebook");
		if(url==null)
			throw new RuntimeException("URL is not found");
		return url;
	}
}
