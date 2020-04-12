package Generic;


import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Flipkart_Generic_URL{
public WebDriver driver;
public static ExtentHtmlReporter htmlreporter;
public static ExtentReports reports;
public static ExtentTest test;

	Logger log=Logger.getLogger(Flipkart_Generic_URL.class);
	
	BrowserFactory bff=new BrowserFactory();
	FileManager fm=new FileManager();

	@BeforeSuite
	public void setUp()
	{
		htmlreporter=new ExtentHtmlReporter("./Ereports/"+new Date().toString().replace(":", "-")+".html");
		reports=new ExtentReports();
		reports.attachReporter(htmlreporter);
	}

@Parameters({"browser"})
@BeforeMethod
public void OpenAppn(@Optional("chrome")String browser)
{
	log.info(browser+" browser is launched");
	//test.info("Browser name is : "+browser);
	
	Reporter.log("Browser name is : "+browser, true);
	Reporter.log("Thread id : "+Thread.currentThread().getId(),true);
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=bff.getBrowser("chrome");
		driver.get(fm.getFlipkartURL());
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver=bff.getBrowser("edge");
		driver.get(fm.getFlipkartURL());	
	}
	else
	{
		driver=bff.getBrowser("firefox");
		driver.get(fm.getFlipkartURL());		
	}
	
}

@AfterMethod
public void closeAppn(ITestResult res) throws Exception
{
	String testName="";
	if(ITestResult.FAILURE==res.getStatus())
	{
		testName=res.getName();
	
		
		//Screenshot.capture(driver,testName);
		test.fail("Test case failed", MediaEntityBuilder
				.createScreenCaptureFromPath(new Screenshot().capture(driver, testName)).build());
	}
	else 
	{
		test.pass("Test case is succesfully executed", MediaEntityBuilder
				.createScreenCaptureFromPath(new Screenshot4PassTC().capture(driver, testName)).build());
	}	
//		test.skip("Not implemented");
//		test.warning("Insufficient balance");
//		test.fatal("Blocking the feature");
		
		test.assignAuthor("Mahaboob Pasha");
		test.assignDevice("Laptop");
		test.assignCategory("GUI Automation");
		reports.setSystemInfo("Windows", "10");

	driver.quit();
	log.info("Browser is closed");
}
	@AfterSuite
	public void tearDown()
	{
		reports.flush();
		
	}

}
