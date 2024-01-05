package Test_Scripts;



import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import POM.BasePage1;
import POM.ElectronicsPage;

public class Demo_Elec_001_Test extends BasePage1{
	
	//public properties prop;
	@Test(groups="Functionality")
	public void electronic()
	{
		
		String ElectronicsTitle = "Demo Web Shop. Electronics";
		//String cellTitle = "Demo Web Shop. Cell Phones";
		String expectedResult="The product has been added to your shopping cart";
		String title = driver.getCurrentUrl();
		
		ElectronicsPage ePage=new ElectronicsPage(driver);
		ePage.getElectonicsLink().click();
		
		Assert.assertEquals("https://demowebshop.tricentis.com/electronics", title);
		
		ePage.getCellPhone().click();
		Reporter.log("clicked on CellPhone",true);
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://demowebshop.tricentis.com/cell-phones",url);
		ePage.getPhoneCover().click();
		Reporter.log("clicked on PhoneCover",true);
		Select sel = new Select(ePage.getManufactureDropDown());
		sel.selectByIndex(1);
		Select sel1 = new Select(ePage.getColorDropDown());
		sel1.selectByIndex(0);
		ePage.getAddToCart().click();
		Reporter.log("Clicked on Add to Cart Successfully",true);
		String shoppingText = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
		Assert.assertEquals(shoppingText,expectedResult);
	}

}
