package Test_Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_class.Excel_Sheet;
import POM.BasePage1;
import POM.JeansPage;

public class Demo_Jeans_002_Test extends BasePage1
{
	@Test(groups="Smoke")
	public void BlueJeans() throws EncryptedDocumentException, IOException {
		String expectedResult="The product has been added to your shopping cart";
		JeansPage j=new JeansPage(driver);
		j.getSearchbox().sendKeys("blue jeans");
		j.getSearchButton().click();
		Reporter.log("Clicked on SearchButton",true);
		Select s=new Select(j.getSortbyAtoZ());
		s.selectByVisibleText("Name: A to Z");
		Reporter.log("Clicked on SortBy",true);
		Select s1=new Select(j.getDisplay12());
		s1.selectByVisibleText("12");
		Reporter.log("Clicked on Display",true);
		Select s2=new Select(j.getViewAsList());
		s2.selectByVisibleText("List");
		Reporter.log("Clicked on VisibleText",true);
		j.getAddToCart().click();
		Reporter.log("Clicked on Add to Cart",true);
		Reporter.log("Product added to cart successfully",true);
		String shoppingText = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
		Assert.assertEquals(shoppingText,expectedResult);
		
	}

}
