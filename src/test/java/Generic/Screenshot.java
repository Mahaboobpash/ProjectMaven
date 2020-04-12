package Generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Screenshot {
public String capture(WebDriver driver, String testName)
{
Date d=new Date();
String d1=d.toString();
String date = d1.replace(":", "-");
String path = System.getProperty("user.dir")+"./Defects/"+date+testName+".jpg";     //user.dir states current directory or project

//String path="F:\\Eclipse(Maven)\\Ecommerce\\Defects\\"+date+testName+".jpg";		//Absolute path of file

TakesScreenshot ts=(TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File dest = new File(path);
try
{
	FileHandler.copy(src, dest);
	}
catch(Exception e)
{
Reporter.log("failed to take Screenshot", true);	
}
return path;
}
}
