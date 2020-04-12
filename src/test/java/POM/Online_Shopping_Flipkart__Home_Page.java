package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class Online_Shopping_Flipkart__Home_Page extends Generic.Base_page {


	@FindBy(xpath="(//span[.='Men'])[1]")
	private WebElement men_link;
	
	@FindBy(xpath="(//a[text()='Fastrack'])[1]")
	private WebElement Fastrack_link;
	
	public Online_Shopping_Flipkart__Home_Page(WebDriver driver)
	{
		super(driver);
	}
	
	public void Men_mousehover()
	{
		verify_Visibility(5, men_link);
		Actions act = new Actions(driver);
		act.moveToElement(men_link).build().perform();
		
	}	
	
	public void Fastrack_Click()
	{
		verify_Visibility(5, Fastrack_link);
		Fastrack_link.click();
	}


	
	
}
