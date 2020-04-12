package POM;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Flipkart_Fastrack_Watch_Page extends Generic.Base_page {

	@FindBy(xpath="//div[@data-id='WATD9H76ZV3XUURP']")
	private WebElement Watch1;
	
	@FindBy(xpath="//div[@data-id='WATF2VTYEQ6H3H5U']")
	private WebElement Watch2;
	
	@FindBy(xpath="(//div[@class='IIdQZO _1SSAGr'])[9]")
	private WebElement Watch3;
	
	@FindBy(xpath="//div[@data-id='WATF2VTYAYUPDENJ']")
	private WebElement Watch4;
	
	public Flipkart_Fastrack_Watch_Page(WebDriver driver)
	{
		super(driver);
	}
	public void ClickWatch1()
	{
		verify_Click(5, Watch1);
		Watch1.click();
		Set<String> allwindow = driver.getWindowHandles();
		for (String str : allwindow) {
			driver.switchTo().window(str);
		}
		
	}
	public void ClickWatch2()
	{
		verify_Click( 5, Watch2);
		Watch2.click();
		Set<String> allwindow = driver.getWindowHandles();
		for (String str : allwindow) {
			driver.switchTo().window(str);
		}
	}
	public void ClickWatch3()
	{
		verify_Click(5, Watch3);
		Watch3.click();
		Set<String> allwindow = driver.getWindowHandles();
		for (String str : allwindow) {
			driver.switchTo().window(str);
		}
	}
	public void ClickWatch4()
	{
		verify_Click(5, Watch4);
		Watch4.click();
		Set<String> allwindow = driver.getWindowHandles();
		for (String str : allwindow) {
			driver.switchTo().window(str);
		}
	}
	
}
