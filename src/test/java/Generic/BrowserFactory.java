package Generic;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory implements Auto_Const {

	private Map<String, WebDriver> drivers= new HashMap<String, WebDriver>();
	
	public WebDriver getBrowser(String browserName)
	{
		WebDriver driver =null;
		switch(browserName)
		{
		case "firefox" :
		driver=drivers.get("firefox");
		if (driver==null) 
			System.setProperty(gecko_key, gecko_value);
			driver=new FirefoxDriver();
			drivers.put("firefox", driver);
			break;
			
		case "chrome" :
			driver=drivers.get("chrome");
			if (driver==null) 
				System.setProperty(chrome_key, chrome_value);
				driver=new ChromeDriver();
				drivers.put("chrome", driver);
				break;
				
		case "edge" :
			driver=drivers.get("edge");
			if (driver==null) 
				System.setProperty(edge_key, edge_value);
				driver=new EdgeDriver();
				drivers.put("edge", driver);
				break;
				
		default:
		System.out.println("Invalid Browser");
		}
		return driver;
	}
	
	public  void closeBrowser()
	{
		for(String key:drivers.keySet())
		{
			drivers.get(key).quit();
		}
	}
	
}
