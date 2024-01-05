package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage extends BasePage1 {
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
			@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
			private WebElement Books;
			
			public WebElement getBooks() {
				return Books;
			}

			public WebElement getFictionBook() {
				return FictionBook;
			}

			public WebElement getAddtocart() {
				return Addtocart;
			}
			@FindBy(xpath="//a[text()='Fiction']")
			private WebElement FictionBook;
			
			@FindBy(id="add-to-cart-button-45")
			private WebElement Addtocart;

}
