package Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;



public abstract class Base_page {
	public WebDriver driver;
	public Base_page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
public void verify_Visibility( int time,WebElement element)
{
WebDriverWait wait= new WebDriverWait(driver, time);
try
{
	wait.until(ExpectedConditions.visibilityOf(element));
	Reporter.log("Element is located", true);
}
catch(Exception e)
{
	Reporter.log("Failed to Locate Element",true);	
	Assert.fail();
}
}

public void verify_Click( int time,WebElement element)
{
WebDriverWait wait= new WebDriverWait(driver, time);
try
{
	wait.until(ExpectedConditions.elementToBeClickable(element));
	Reporter.log("Element is clicked", true);
}
catch(Exception e)
{
	Reporter.log("Failed to Click Element",true);
	Assert.fail();
}
}

public void verify_Title( int time,String title)
{
WebDriverWait wait= new WebDriverWait(driver, time);
try
{
	wait.until(ExpectedConditions.titleContains(title));
	Reporter.log("Title is dispalyed", true);
}
catch(Exception e)
{
	Reporter.log("Title mismatch",true);
	Assert.fail();
}
}

public void verify_ElementLocation( int time,By xpath)
{
WebDriverWait wait= new WebDriverWait(driver, time);
try
{
	wait.until(ExpectedConditions.presenceOfElementLocated(xpath));	
	Reporter.log("Located element is found", true);
}
catch(Exception e)
{
	Reporter.log("Failed to find located element",true);
	Assert.fail();
}
}

public void verify_NoOfWindows(int time,int expectedNumberOfWindows)
{
WebDriverWait wait= new WebDriverWait(driver, time);
try
{
	wait.until(ExpectedConditions.numberOfWindowsToBe(expectedNumberOfWindows));
	Reporter.log("Loaded new window", true);
}
catch(Exception e)
{
	Reporter.log("Failed to load new window",true);	
	Assert.fail();
}
}
}


