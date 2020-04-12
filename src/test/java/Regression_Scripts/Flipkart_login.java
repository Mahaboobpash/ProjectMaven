package Regression_Scripts;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;







import Generic.DataProviderExcel;
import Generic.Flipkart_Generic_URL;
import POM.Flipkart_Cart_Page;
import POM.Flipkart_Fastrack_Watch1_DetailsPage;
import POM.Flipkart_Fastrack_Watch_Page;
import POM.Online_Shopping_Flipkart__Home_Page;
import POM.Online_Shopping_Flipkart__Login_Page;

public class Flipkart_login extends Flipkart_Generic_URL {
	@Test(dataProvider="Databank")
	public void flipkartend2end(String email_id,String pwd) throws Exception
	{
		test=reports.createTest("Flipkartend2end", "User entered valid credentials in order to login to Flipkart");
		
		test.info("Flipkart test has started");
	Online_Shopping_Flipkart__Login_Page login=new Online_Shopping_Flipkart__Login_Page(driver);
	login.setMailid(email_id);
	test.pass("Succesfully entered Email id");
	login.setPassword(pwd);
	test.pass("Succesfully entered password");
	login.clickLogin();
	Thread.sleep(3000);
	test.pass("Succesfully login to Flipkart ");
	Online_Shopping_Flipkart__Home_Page Fhome=new Online_Shopping_Flipkart__Home_Page(driver);
	Fhome.Men_mousehover();
	test.pass("Sucessfully clicked Men icon");
	Fhome.Fastrack_Click();
	Thread.sleep(5000);
	test.pass("Sucessfully clicked Fastrack icon");
	
	Flipkart_Fastrack_Watch_Page Flist=new Flipkart_Fastrack_Watch_Page(driver);
	Flist.ClickWatch1();
	test.pass("Sucessfully clicked Watch1 icon and watch1 displayed");
	test.info("Flipkart test ended");
//	Thread.sleep(3000);
	
//	Flipkart_Fastrack_Watch1_DetailsPage Fdetail=new Flipkart_Fastrack_Watch1_DetailsPage(driver);
//	Fdetail.Click_Add2cart();
//	Thread.sleep(3000);
//	
//	Flipkart_Cart_Page fcart=new Flipkart_Cart_Page(driver);
//	fcart.Click_Remove();
//	Thread.sleep(3000);
//	fcart.Click_Remove2();
//	fcart.verify_cart_empty();
//	
	
	}
	
	@DataProvider(name="Databank")
	public Object[][] fetchData()
	{
		Object[][] arrobj=DataProviderExcel.Getdata("Sheet6");
		return arrobj;
	}

}
