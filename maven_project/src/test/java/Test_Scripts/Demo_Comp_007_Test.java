package Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM.BasePage1;
import POM.GiftCards;

public class Demo_Comp_007_Test extends BasePage1
{
	@Test(groups="Functionality")
	public void GiftCardsPage()
	{
		GiftCards g=new GiftCards(driver);
		g.getGiftCards().click();
		g.getVirtual().click();
		g.getAddToCompareList().click();
		
		WebElement virtual = driver.findElement(By.xpath("//a[text()='$5 Virtual Gift Card']"));
		g.getRemove().click();
		try
		{
			virtual.isDisplayed();
		}
		catch(Exception e)
		{
			System.out.println("item is removed from compare list");
		}
		
	}

}
