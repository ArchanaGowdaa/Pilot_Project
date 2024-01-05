package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards 
{
	public GiftCards(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
			@FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
			private WebElement GiftCards;
			
			public WebElement getGiftCards() {
				return GiftCards;
			}

			public WebElement getVirtual() {
				return Virtual;
			}

			public WebElement getAddToCompareList() {
				return AddToCompareList;
			}

			public WebElement getRemove() {
				return Remove;
			}
			@FindBy(xpath="//a[text()='$5 Virtual Gift Card']")
			private WebElement Virtual;
			
			@FindBy(xpath="//input[@value=\"Add to compare list\"]")
			private WebElement AddToCompareList;
			
			@FindBy(xpath="//input[@value=\"Remove\"]")
			private WebElement Remove;
	

	
}
