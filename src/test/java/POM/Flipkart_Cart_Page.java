package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Flipkart_Cart_Page extends Generic.Base_page {

	@FindBy(xpath="(//div[@class='gdUKd9'])[2]")
	private WebElement Remove_link;
	
	@FindBy(xpath="//div[@class='gdUKd9 _3Z4XMp _2nQDKB']")
	private WebElement Remove2_button;
	
	@FindBy(xpath="//div[.='Your cart is empty!']")
	private WebElement cartvisible;
	
	public Flipkart_Cart_Page(WebDriver driver)
	{
		super(driver);
	}
	public void Click_Remove()
	{
		verify_Click( 5, Remove_link);
		Remove_link.click();
	}
	public void Click_Remove2()
	{
		verify_Click( 5, Remove2_button);
		Remove2_button.click();
		
	}
	public void verify_cart_empty()
	{
		verify_Visibility(5, cartvisible);
		System.out.println("Cart empty");
	}
	

}
