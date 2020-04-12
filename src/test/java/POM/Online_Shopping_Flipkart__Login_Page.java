package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Online_Shopping_Flipkart__Login_Page extends Generic.Base_page{
	
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement mail_id;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement login_button;
	
	public Online_Shopping_Flipkart__Login_Page(WebDriver driver)
	{
		super(driver);
	}
	
	public void setMailid(String email_id)
	{
		verify_Visibility(5, mail_id);
		mail_id.sendKeys(email_id);
	}
	
	public void setPassword(String pwd)
	{
		verify_Visibility(5, password);
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		verify_Click(5, login_button);
		login_button.click();
	}
	
}
