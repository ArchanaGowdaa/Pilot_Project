package Test_Scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.BasePage1;
import POM.DigitalDownloads;

public class Demo_Comp_005_Test extends BasePage1
{
	@Test(groups="Smoke")
	public void DigitalDownloadsPage()
	{
		String Digitalurl="https://demowebshop.tricentis.com/digital-downloads";
		String Music2url = "https://demowebshop.tricentis.com/music-album-1";
		//String Downloadurl= "";
		
		DigitalDownloads d=new DigitalDownloads(driver);
		d.getDigital().click();
		Reporter.log("Digital download page displayed",true);
		
		String actualDigitalTitle = driver.getCurrentUrl();
		Assert.assertEquals(actualDigitalTitle,Digitalurl,"Digital Download page is not displayed");
		
		d.getMusic2().click();
		Reporter.log("Clicked on Music2 link ",true);
		String actualMusic2url = driver.getCurrentUrl();
		Assert.assertEquals(actualMusic2url,Music2url,"Music2 link is not Displayed");
		
		d.getDownload().click();
		Reporter.log("page Downloaded successfully",true);
		//String actualDownloadurl = driver.getCurrentUrl();
		//Assert.assertEquals(actualDownloadurl,Downloadurl," Downloaded  unsuccessfull");
		
		
	}
}
