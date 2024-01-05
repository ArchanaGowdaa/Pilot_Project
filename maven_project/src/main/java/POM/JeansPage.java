package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeansPage 
{
	public JeansPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="(//a[contains(text(),'Apparel')])[1]")
		private WebElement ApparelLink;
		@FindBy(xpath="//input[@value='Search']")
		private WebElement searchButton;
		
		public WebElement getSearchButton() {
			return searchButton;
		}

		public WebElement getApparelLink() {
			return ApparelLink;
		}

		public WebElement getSearchbox() {
			return searchbox;
		}
		

		public WebElement getSortbyAtoZ() {
			return sortbyAtoZ;
		}

		public WebElement getDisplay12() {
			return Display12;
		}

		public WebElement getViewAsList() {
			return ViewAsList;
		}

		public WebElement getAddToCart() {
			return AddToCart;
		}

		public WebElement getShoppingCart() {
			return ShoppingCart;
		}

		public WebElement getQTY() {
			return QTY;
		}

		public WebElement getUpdateCart() {
			return UpdateCart;
		}
		@FindBy(id="small-searchterms")
		private WebElement searchbox;
		
		@FindBy(xpath="//select[@id=\"products-orderby\"]")
		private WebElement sortbyAtoZ;
		
		@FindBy(xpath="//select[@id=\"products-pagesize\"]")
		private WebElement Display12;
		
		@FindBy(xpath="//select[@id=\"products-viewmode\"]")
		private WebElement ViewAsList;
		
		@FindBy(xpath="//input[@value=\"Add to cart\"]")
		private WebElement AddToCart;
		
		@FindBy(xpath="(//span['Shopping cart'])[2]")
		private WebElement ShoppingCart;
		
		@FindBy(xpath="//input[@name=\"itemquantity3796266\"]")
		private WebElement QTY;
		
		@FindBy(xpath="//input[@name=\"updatecart\"]")
		private WebElement UpdateCart;
		
		
}
