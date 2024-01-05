package Test_Scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.BasePage1;
import POM.BooksPage;

public class Demo_Comp_004_Test extends BasePage1
{
	@Test(groups="Regression")
	public void Books()
	{
		String booksUrl = "https://demowebshop.tricentis.com/books";
		String fictionBooksUrl = "https://demowebshop.tricentis.com/fiction";
		String expectedResult="The product has been added to your shopping cart";
		
		BooksPage b=new BooksPage(driver);
		b.getBooks().click();
		Reporter.log("Clicked on Books",true);
		String actualbooksUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualbooksUrl,booksUrl,"Books page is not displayed");
		
		b.getFictionBook().click();
		Reporter.log("Clicked on FictionBook",true);
		String actualfictionBooksUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualfictionBooksUrl,fictionBooksUrl,"Fiction Book page is not displayed");
		
		b.getAddtocart().click();
		Reporter.log("Product added to cart Successfully",true);
		String shoppingText = driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText();
		Assert.assertEquals(shoppingText,expectedResult);
	
	}

}
