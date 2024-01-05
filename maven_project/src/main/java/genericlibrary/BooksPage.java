package genericlibrary;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class BooksPage extends BasePage {

		public BooksPage(WebDriver driver) {
			super(driver);
	  }
		
		@FindBy(linkText = "Computing and Internet")
		private WebElement computingInternetlink;

		public WebElement getComputingInternetlink() {
			return computingInternetlink;
		}

		
		
		
		

	}

