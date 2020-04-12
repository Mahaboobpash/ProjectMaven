package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Flipkart_Fastrack_Watch1_DetailsPage extends Generic.Base_page {

	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement Add2Cart_button;
	
	public Flipkart_Fastrack_Watch1_DetailsPage(WebDriver driver)
	{
		super(driver);
	}
	public void Click_Add2cart()
	{
		verify_Click(5, Add2Cart_button);
		Add2Cart_button.click();
	}
	
}
