package Test_Scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.BasePage1;
import POM.Jewelery;
import POM.LoginPage;

public class Demo_Comp_006_Test extends BasePage1
{
	@Test
	public void JeweleryAddToCart() throws InterruptedException
	{
		SoftAssert softassert=new SoftAssert();
		String ExpectedJewlery = "https://demowebshop.tricentis.com/jewelry";
		String ExpectedJewlery1 = "https://demowebshop.tricentis.com/black-white-diamond-heart";
		String ExpectedJewlery2 = "https://demowebshop.tricentis.com/productemailafriend/14";
		String ExpectedJewlery3 = "Your message has been sent.";
		LoginPage lp= new LoginPage(driver);
		lp.LoginLink.click();
		Reporter.log("Click on Login link",true);
		lp.getEmailTextBox().sendKeys("acchu945@gmail.com");
		Reporter.log("Email entered successfully",true);
		lp.getPasswordTextBox().sendKeys("acchu945@");
		Reporter.log("Password entered successfully",true);
		lp.getLoginButton().click();
		
		Jewelery j1=new Jewelery(driver);
		j1.getJewellery().click();
		Reporter.log("Clicked on Jewelery link",true);
		String actualResult = driver.getCurrentUrl();
		softassert.assertEquals(actualResult,ExpectedJewlery);
		Thread.sleep(2000);
		
		j1.getBlackAndWhite().click();
		Reporter.log("Clicked on BlackAndWhite link",true);
		String actualResult1 = driver.getCurrentUrl();
		softassert.assertEquals(actualResult1,ExpectedJewlery1);
		
		j1.getEmailAFriend().click();
		Reporter.log("Clicked on EmailAFriend",true);
		String actualResult2 = driver.getCurrentUrl();
		softassert.assertEquals(actualResult2,ExpectedJewlery2);
		
		j1.getFriendMailTF().sendKeys("archanagowda2299@gmail.com");
		//j1.getYourMailTF().sendKeys("acchu945@gmail.com");;
		j1.getSendMail().click();
		Reporter.log("Sent mail successfully",true);
		String actualResult3 = driver.findElement(By.xpath("//div[contains(text(),'Your message has been sent.')]")).getText();
		softassert.assertEquals(actualResult3, ExpectedJewlery3);
		softassert.assertAll();
	}

}
