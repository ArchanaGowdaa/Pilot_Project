package Test_Scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_class.Excel_Sheet;
import Generic_class.Excel_Sheet1;
import POM.BasePage1;
import POM.ComputersPage;
import POM.JeansPage;
import POM.LoginPage;

public class Demo_Comp_003_Test  extends BasePage1
{
	@Test(groups="Functionality")
	public void Computer() throws EncryptedDocumentException, IOException {
		String expectedResult="Product review is successfully added.";
		LoginPage lp= new LoginPage(driver);
		//driver.get("https://demowebshop.tricentis.com/login");
		lp.LoginLink.click();
		Reporter.log("Click on Login link",true);
		//Excel_Sheet1 e=new Excel_Sheet1();
		lp.getEmailTextBox().sendKeys("acchu945@gmail.com");
		Reporter.log("Email entered successfully",true);
		lp.getPasswordTextBox().sendKeys("acchu945@");
		Reporter.log("Password entered successfully",true);
		lp.getLoginButton().click();
		
		ComputersPage comp=new ComputersPage(driver);
		comp.getComputers().click();
		Reporter.log("Click on Computer",true);
		
		comp.getAccessoriesLink().click();
		Reporter.log("Click on AccessoriesLink",true);
		comp.getTCPCoaching().click();
		Reporter.log("Click on TCP coaching ",true);
		comp.getAddYourReview().click();
		Reporter.log("Click on AddYourReview",true);
		comp.getReviewTitle().sendKeys("BadProduct");
		Reporter.log("Click on Review Title",true);
		Reporter.log("Entered Review Title successfully",true);
		comp.getReviewText().sendKeys("Don't buy");
		Reporter.log("Click on Review Text",true);
		Reporter.log("Entered Review Text successfully",true);
		comp.getSubmitButton().click();
		Reporter.log("Click on submit button",true);
		Reporter.log("Click on Review Title",true);
		Reporter.log("Product review is successfully added",true);
		String shoppingText = driver.findElement(By.xpath("//div[contains(text(),'Product review is successfully added.')] ")).getText();
		Assert.assertEquals(shoppingText,expectedResult);
		
	    //comp.getReviewTitle().sendKeys(e.readData("Sheet1", 1, 0));
		//comp.getReviewText().sendKeys(e.readData("Sheet1",1, 1));

	}
	
	
}